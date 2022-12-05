# Instructions

start the application with `./gradlew bootRun` and observe the error:

```
> Task :bootRun FAILED

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.0.0)

2022-12-05T13:30:08.101+01:00  INFO 53724 --- [           main] com.example.demo.DemoApplicationKt       : Starting DemoApplicationKt using Java 17.0.5 with PID 53724 (/home/julian/Git/cmdjulian/spring-cloud-gateway-bugs/build/classes/kotlin/main started by julian in /home/julian/Git/cmdjulian/spring-cloud-gateway-bugs)
2022-12-05T13:30:08.104+01:00  INFO 53724 --- [           main] com.example.demo.DemoApplicationKt       : No active profile set, falling back to 1 default profile: "default"
2022-12-05T13:30:08.468+01:00  INFO 53724 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=29bc47e0-7962-3082-8f8f-d70b7f80b5e0
2022-12-05T13:30:08.831+01:00  WARN 53724 --- [           main] onfigReactiveWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'routeDefinitionRouteLocator' defined in class path resource [org/springframework/cloud/gateway/config/GatewayAutoConfiguration.class]: Unsatisfied dependency expressed through method 'routeDefinitionRouteLocator' parameter 1: Error creating bean with name 'localResponseCacheGatewayFilterFactory' defined in class path resource [org/springframework/cloud/gateway/config/LocalResponseCacheAutoConfiguration.class]: Unsatisfied dependency expressed through method 'localResponseCacheGatewayFilterFactory' parameter 1: Error creating bean with name 'concurrentMapCacheManager' defined in class path resource [org/springframework/cloud/gateway/config/LocalResponseCacheAutoConfiguration.class]: Failed to instantiate [org.springframework.cache.CacheManager]: Factory method 'concurrentMapCacheManager' threw exception with message: org/springframework/cache/caffeine/CaffeineCacheManager
2022-12-05T13:30:08.840+01:00  INFO 53724 --- [           main] .s.b.a.l.ConditionEvaluationReportLogger : 

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2022-12-05T13:30:08.849+01:00 ERROR 53724 --- [           main] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'routeDefinitionRouteLocator' defined in class path resource [org/springframework/cloud/gateway/config/GatewayAutoConfiguration.class]: Unsatisfied dependency expressed through method 'routeDefinitionRouteLocator' parameter 1: Error creating bean with name 'localResponseCacheGatewayFilterFactory' defined in class path resource [org/springframework/cloud/gateway/config/LocalResponseCacheAutoConfiguration.class]: Unsatisfied dependency expressed through method 'localResponseCacheGatewayFilterFactory' parameter 1: Error creating bean with name 'concurrentMapCacheManager' defined in class path resource [org/springframework/cloud/gateway/config/LocalResponseCacheAutoConfiguration.class]: Failed to instantiate [org.springframework.cache.CacheManager]: Factory method 'concurrentMapCacheManager' threw exception with message: org/springframework/cache/caffeine/CaffeineCacheManager
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:793) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:543) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1324) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1161) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:561) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:521) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:961) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:915) ~[spring-context-6.0.2.jar:6.0.2]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:584) ~[spring-context-6.0.2.jar:6.0.2]
	at org.springframework.boot.web.reactive.context.ReactiveWebServerApplicationContext.refresh(ReactiveWebServerApplicationContext.java:66) ~[spring-boot-3.0.0.jar:3.0.0]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:730) ~[spring-boot-3.0.0.jar:3.0.0]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:432) ~[spring-boot-3.0.0.jar:3.0.0]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:308) ~[spring-boot-3.0.0.jar:3.0.0]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1302) ~[spring-boot-3.0.0.jar:3.0.0]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1291) ~[spring-boot-3.0.0.jar:3.0.0]
	at com.example.demo.DemoApplicationKt.main(DemoApplication.kt:13) ~[main/:na]
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'localResponseCacheGatewayFilterFactory' defined in class path resource [org/springframework/cloud/gateway/config/LocalResponseCacheAutoConfiguration.class]: Unsatisfied dependency expressed through method 'localResponseCacheGatewayFilterFactory' parameter 1: Error creating bean with name 'concurrentMapCacheManager' defined in class path resource [org/springframework/cloud/gateway/config/LocalResponseCacheAutoConfiguration.class]: Failed to instantiate [org.springframework.cache.CacheManager]: Factory method 'concurrentMapCacheManager' threw exception with message: org/springframework/cache/caffeine/CaffeineCacheManager
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:793) ~[spring-beans-6.0.2.jar:6.0.2]
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'localResponseCacheGatewayFilterFactory' defined in class path resource [org/springframework/cloud/gateway/config/LocalResponseCacheAutoConfiguration.class]: Unsatisfied dependency expressed through method 'localResponseCacheGatewayFilterFactory' parameter 1: Error creating bean with name 'concurrentMapCacheManager' defined in class path resource [org/springframework/cloud/gateway/config/LocalResponseCacheAutoConfiguration.class]: Failed to instantiate [org.springframework.cache.CacheManager]: Factory method 'concurrentMapCacheManager' threw exception with message: org/springframework/cache/caffeine/CaffeineCacheManager

	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:543) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1324) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1161) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:561) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:521) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.addCandidateEntry(DefaultListableBeanFactory.java:1621) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.findAutowireCandidates(DefaultListableBeanFactory.java:1585) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveMultipleBeans(DefaultListableBeanFactory.java:1476) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1363) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1325) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:880) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:784) ~[spring-beans-6.0.2.jar:6.0.2]
	... 19 common frames omitted
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'concurrentMapCacheManager' defined in class path resource [org/springframework/cloud/gateway/config/LocalResponseCacheAutoConfiguration.class]: Failed to instantiate [org.springframework.cache.CacheManager]: Factory method 'concurrentMapCacheManager' threw exception with message: org/springframework/cache/caffeine/CaffeineCacheManager
	at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:652) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:640) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1324) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1161) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:561) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:521) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1405) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1325) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:880) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:784) ~[spring-beans-6.0.2.jar:6.0.2]
	... 36 common frames omitted
Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.cache.CacheManager]: Factory method 'concurrentMapCacheManager' threw exception with message: org/springframework/cache/caffeine/CaffeineCacheManager
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:171) ~[spring-beans-6.0.2.jar:6.0.2]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:648) ~[spring-beans-6.0.2.jar:6.0.2]
	... 50 common frames omitted
Caused by: java.lang.NoClassDefFoundError: org/springframework/cache/caffeine/CaffeineCacheManager
	at org.springframework.cloud.gateway.config.LocalResponseCacheAutoConfiguration.concurrentMapCacheManager(LocalResponseCacheAutoConfiguration.java:75) ~[spring-cloud-gateway-server-4.0.0-RC2.jar:4.0.0-RC2]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:139) ~[spring-beans-6.0.2.jar:6.0.2]
	... 51 common frames omitted
Caused by: java.lang.ClassNotFoundException: org.springframework.cache.caffeine.CaffeineCacheManager
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641) ~[na:na]
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188) ~[na:na]
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520) ~[na:na]
	... 57 common frames omitted

Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'concurrentMapCacheManager' defined in class path resource [org/springframework/cloud/gateway/config/LocalResponseCacheAutoConfiguration.class]: Failed to instantiate [org.springframework.cache.CacheManager]: Factory method 'concurrentMapCacheManager' threw exception with message: org/springframework/cache/caffeine/CaffeineCacheManager

Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.cache.CacheManager]: Factory method 'concurrentMapCacheManager' threw exception with message: org/springframework/cache/caffeine/CaffeineCacheManager

Caused by: java.lang.NoClassDefFoundError: org/springframework/cache/caffeine/CaffeineCacheManager

Caused by: java.lang.ClassNotFoundException: org.springframework.cache.caffeine.CaffeineCacheManager


Execution failed for task ':bootRun'.
> Process 'command '/usr/lib/jvm/java-17-openjdk/bin/java'' finished with non-zero exit value 1

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.
```

The error seems to lay in `org.springframework.cloud.gateway.config.LocalResponseCacheAutoConfiguration` as this class
only checks if caffeine is present and if so tries to access Spring Boot related autoconfiguration.  
This problem can be fixed by including spring starter
cache (`implementation("org.springframework.boot:spring-boot-starter-cache")`').