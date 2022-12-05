package com.example.demo

import org.springframework.cloud.gateway.filter.factory.RetryGatewayFilterFactory
import org.springframework.cloud.gateway.filter.factory.RetryGatewayFilterFactory.BackoffConfig
import org.springframework.cloud.gateway.filter.factory.RetryGatewayFilterFactory.RetryConfig
import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.GatewayFilterSpec
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.cloud.gateway.route.builder.UriSpec
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import java.net.URI
import java.time.Duration

@Configuration
class Routes(private val retryFilterFactory: RetryGatewayFilterFactory) {

    private fun retryFilter() = retryFilterFactory.apply(
        RetryConfig().apply {
            retries = 2
            setStatuses(HttpStatus.SERVICE_UNAVAILABLE)
            backoff = BackoffConfig(Duration.ofMillis(10), Duration.ofMillis(50), 2, false)
        }
    )

    @Bean
    fun customRouteLocator(builder: RouteLocatorBuilder): RouteLocator = builder.routes()
        .apply { buildRoutes() }
        .build()

    private fun RouteLocatorBuilder.Builder.buildRoutes() {
        registerRoute()
    }

    private fun RouteLocatorBuilder.Builder.registerRoute() {
        fun filters(spec: GatewayFilterSpec): UriSpec {
            return spec.removeRequestHeader(HttpHeaders.AUTHORIZATION)
                .filter(retryFilter())
        }

        route { predicateSpec ->
            predicateSpec.host("test.com")
                .filters(::filters)
                .uri(URI("http://localhost"))
        }
    }
}
