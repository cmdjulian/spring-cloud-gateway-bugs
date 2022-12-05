# Instructions

When running the project with `./gradlew bootRun` even if java-parameter-names are enabled for java nd kotlin compiler
tasks it still prints a warning on startup:

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.0.0)

2022-12-05T13:51:32.860+01:00  INFO 64600 --- [           main] com.example.demo.DemoApplicationKt       : Starting DemoApplicationKt using Java 17.0.5 with PID 64600 (/home/julian/Git/cmdjulian/spring-cloud-gateway-bugs/build/classes/kotlin/main started by julian in /home/julian/Git/cmdjulian/spring-cloud-gateway-bugs)
2022-12-05T13:51:32.865+01:00  INFO 64600 --- [           main] com.example.demo.DemoApplicationKt       : No active profile set, falling back to 1 default profile: "default"
2022-12-05T13:51:33.866+01:00  INFO 64600 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=112f0c6d-c6d2-3480-a9f0-aa7632c1226c

> Task :bootRun

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.0.0)

2022-12-05T13:51:36.336+01:00  INFO 64675 --- [           main] com.example.demo.DemoApplicationKt       : Starting DemoApplicationKt using Java 17.0.5 with PID 64675 (/home/julian/Git/cmdjulian/spring-cloud-gateway-bugs/build/classes/kotlin/main started by julian in /home/julian/Git/cmdjulian/spring-cloud-gateway-bugs)
2022-12-05T13:51:36.338+01:00  INFO 64675 --- [           main] com.example.demo.DemoApplicationKt       : No active profile set, falling back to 1 default profile: "default"
2022-12-05T13:51:36.867+01:00  INFO 64675 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=112f0c6d-c6d2-3480-a9f0-aa7632c1226c
2022-12-05T13:51:37.014+01:00  WARN 64675 --- [           main] ocalVariableTableParameterNameDiscoverer : Using deprecated '-debug' fallback for parameter name resolution. Compile the affected code with '-parameters' instead or avoid its introspection: com.example.demo.Routes$$SpringCGLIB$$0
2022-12-05T13:51:37.248+01:00  INFO 64675 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [After]
2022-12-05T13:51:37.248+01:00  INFO 64675 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [Before]
2022-12-05T13:51:37.248+01:00  INFO 64675 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [Between]
2022-12-05T13:51:37.248+01:00  INFO 64675 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [Cookie]
2022-12-05T13:51:37.248+01:00  INFO 64675 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [Header]
2022-12-05T13:51:37.248+01:00  INFO 64675 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [Host]
2022-12-05T13:51:37.248+01:00  INFO 64675 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [Method]
2022-12-05T13:51:37.248+01:00  INFO 64675 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [Path]
2022-12-05T13:51:37.248+01:00  INFO 64675 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [Query]
2022-12-05T13:51:37.248+01:00  INFO 64675 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [ReadBody]
2022-12-05T13:51:37.248+01:00  INFO 64675 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [RemoteAddr]
2022-12-05T13:51:37.248+01:00  INFO 64675 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [XForwardedRemoteAddr]
2022-12-05T13:51:37.248+01:00  INFO 64675 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [Weight]
2022-12-05T13:51:37.248+01:00  INFO 64675 --- [           main] o.s.c.g.r.RouteDefinitionRouteLocator    : Loaded RoutePredicateFactory [CloudFoundryRouteService]
2022-12-05T13:51:37.297+01:00  INFO 64675 --- [           main] ctiveUserDetailsServiceAutoConfiguration : 

Using generated security password: d0def462-3166-4de8-adcd-bbad75e23837

2022-12-05T13:51:37.467+01:00  INFO 64675 --- [           main] o.s.b.web.embedded.netty.NettyWebServer  : Netty started on port 8080
2022-12-05T13:51:37.485+01:00  INFO 64675 --- [           main] com.example.demo.DemoApplicationKt       : Started DemoApplicationKt in 1.353 seconds (process running for 1.546)
```

`2022-12-05T13:51:37.014+01:00  WARN 64675 --- [           main] ocalVariableTableParameterNameDiscoverer : Using deprecated '-debug' fallback for parameter name resolution. Compile the affected code with '-parameters' instead or avoid its introspection: com.example.demo.Routes$$SpringCGLIB$$0`