# Instructions

You have to have a proper setup of GraalVM 22.3.0. I used sdkman to install the newest liberica distribution (
22.3.r17-nik).

When you have done this run `./gradlew nativeCompile`.

Observe error:

```
Starting a Gradle Daemon, 2 incompatible Daemons could not be reused, use --status for details

> Task :processAot

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.0.0)

2022-12-05T13:19:11.798+01:00  INFO 50201 --- [           main] com.example.demo.DemoApplicationKt       : Starting DemoApplicationKt using Java 17.0.5 with PID 50201 (/home/julian/Git/cmdjulian/spring-cloud-gateway-bugs/build/classes/kotlin/main started by julian in /home/julian/Git/cmdjulian/spring-cloud-gateway-bugs)
2022-12-05T13:19:11.800+01:00  INFO 50201 --- [           main] com.example.demo.DemoApplicationKt       : No active profile set, falling back to 1 default profile: "default"
2022-12-05T13:19:12.283+01:00  INFO 50201 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=ae389f70-af32-3fea-86b3-d3f2deb7b1b2

> Task :generateResourcesConfigFile
[native-image-plugin] Resources configuration written into /home/julian/Git/cmdjulian/spring-cloud-gateway-bugs/build/native/generated/generateResourcesConfigFile/resource-config.json

> Task :nativeCompile
[native-image-plugin] GraalVM Toolchain detection is disabled
[native-image-plugin] GraalVM location read from environment variable: JAVA_HOME
[native-image-plugin] Native Image executable path: /home/julian/.sdkman/candidates/java/22.3.r17-nik/lib/svm/bin/native-image
========================================================================================================================
GraalVM Native Image: Generating 'demo' (executable)...
========================================================================================================================
Warning: Could not resolve com.github.luben.zstd.ZstdCompressCtx for reflection configuration. Reason: java.lang.ClassNotFoundException: com.github.luben.zstd.ZstdCompressCtx.
Warning: Could not resolve io.netty.handler.ssl.OpenSslClientSessionCache for reflection configuration. Reason: java.lang.NoClassDefFoundError: io/netty/internal/tcnative/SSLSessionCache.
Warning: Could not resolve io.netty.handler.ssl.ReferenceCountedOpenSslClientContext$ExtendedTrustManagerVerifyCallback for reflection configuration. Reason: java.lang.NoClassDefFoundError: io/netty/internal/tcnative/CertificateVerifier.
Warning: Could not resolve io.netty.handler.ssl.ReferenceCountedOpenSslServerContext$ExtendedTrustManagerVerifyCallback for reflection configuration. Reason: java.lang.NoClassDefFoundError: io/netty/internal/tcnative/CertificateVerifier.
Warning: Could not resolve io.netty.handler.ssl.ReferenceCountedOpenSslServerContext$OpenSslServerCertificateCallback for reflection configuration. Reason: java.lang.NoClassDefFoundError: io/netty/internal/tcnative/CertificateCallback.
Warning: Could not resolve org.conscrypt.ConscryptEngine for reflection configuration. Reason: java.lang.ClassNotFoundException: org.conscrypt.ConscryptEngine.
Warning: Could not resolve org.conscrypt.ConscryptEngine for reflection configuration. Reason: java.lang.ClassNotFoundException: org.conscrypt.ConscryptEngine.
Warning: Could not resolve org.conscrypt.ConscryptEngine for reflection configuration. Reason: java.lang.ClassNotFoundException: org.conscrypt.ConscryptEngine.
Warning: Could not resolve com.sun.el.ExpressionFactoryImpl for reflection configuration. Reason: java.lang.ClassNotFoundException: com.sun.el.ExpressionFactoryImpl.
Warning: Could not resolve groovy.grape.GrabAnnotationTransformation for reflection configuration. Reason: java.lang.ClassNotFoundException: groovy.grape.GrabAnnotationTransformation.
Warning: Could not resolve groovy.lang.Script for reflection configuration. Reason: java.lang.ClassNotFoundException: groovy.lang.Script.
Warning: Could not resolve groovy.lang.Script for reflection configuration. Reason: java.lang.ClassNotFoundException: groovy.lang.Script.
Warning: Could not resolve groovyjarjarantlr.CommonToken for reflection configuration. Reason: java.lang.ClassNotFoundException: groovyjarjarantlr.CommonToken.
Warning: Could not resolve jakarta.persistence.Persistence for reflection configuration. Reason: java.lang.ClassNotFoundException: jakarta.persistence.Persistence.
Warning: Could not resolve javafx.beans.value.ObservableValue for reflection configuration. Reason: java.lang.ClassNotFoundException: javafx.beans.value.ObservableValue.
Warning: Could not resolve javax.money.MonetaryAmount for reflection configuration. Reason: java.lang.ClassNotFoundException: javax.money.MonetaryAmount.
Warning: Could not resolve org.codehaus.groovy.antlr.GroovySourceAST for reflection configuration. Reason: java.lang.ClassNotFoundException: org.codehaus.groovy.antlr.GroovySourceAST.
Warning: Could not resolve org.codehaus.groovy.ast.builder.AstBuilderTransformation for reflection configuration. Reason: java.lang.ClassNotFoundException: org.codehaus.groovy.ast.builder.AstBuilderTransformation.
Warning: Could not resolve org.codehaus.groovy.runtime.ScriptBytecodeAdapter for reflection configuration. Reason: java.lang.ClassNotFoundException: org.codehaus.groovy.runtime.ScriptBytecodeAdapter.
Warning: Could not resolve org.glassfish.expressly.ValueExpressionImpl for reflection configuration. Reason: java.lang.ClassNotFoundException: org.glassfish.expressly.ValueExpressionImpl.
Warning: Could not resolve org.glassfish.expressly.parser.AstValue for reflection configuration. Reason: java.lang.ClassNotFoundException: org.glassfish.expressly.parser.AstValue.
Warning: Could not resolve org.joda.time.ReadableInstant for reflection configuration. Reason: java.lang.ClassNotFoundException: org.joda.time.ReadableInstant.
Warning: Could not register method org.hibernate.validator.internal.constraintvalidators.bv.time.future.FutureValidatorForReadablePartial.<init>() for reflection. Reason: java.lang.NoClassDefFoundError: org/joda/time/ReadableInstant.
Warning: Could not register method org.hibernate.validator.internal.constraintvalidators.bv.time.futureorpresent.FutureOrPresentValidatorForReadablePartial.<init>() for reflection. Reason: java.lang.NoClassDefFoundError: org/joda/time/ReadableInstant.
Warning: Could not register method org.hibernate.validator.internal.constraintvalidators.bv.time.past.PastValidatorForReadablePartial.<init>() for reflection. Reason: java.lang.NoClassDefFoundError: org/joda/time/ReadableInstant.
Warning: Could not register method org.hibernate.validator.internal.constraintvalidators.bv.time.pastorpresent.PastOrPresentValidatorForReadablePartial.<init>() for reflection. Reason: java.lang.NoClassDefFoundError: org/joda/time/ReadableInstant.
Warning: Could not resolve org.jboss.logmanager.LogManager for reflection configuration. Reason: java.lang.ClassNotFoundException: org.jboss.logmanager.LogManager.
Warning: Method ch.qos.logback.core.encoder.LayoutWrappingEncoder.setParent(Appender) not found.
Warning: Could not resolve com.aayushatharva.brotli4j.Brotli4jLoader for reflection configuration. Reason: java.lang.ClassNotFoundException: com.aayushatharva.brotli4j.Brotli4jLoader.
Warning: Could not resolve com.github.luben.zstd.Zstd for reflection configuration. Reason: java.lang.ClassNotFoundException: com.github.luben.zstd.Zstd.
Warning: Could not resolve com.ning.compress.lzf.impl.UnsafeChunkDecoder for reflection configuration. Reason: java.lang.ClassNotFoundException: com.ning.compress.lzf.impl.UnsafeChunkDecoder.
Warning: Could not register io.netty.handler.codec.compression.Lz4FrameDecoder: queryAllPublicMethods for reflection. Reason: java.lang.NoClassDefFoundError: net/jpountz/lz4/LZ4Exception.
Warning: Could not register io.netty.handler.codec.compression.Lz4FrameEncoder: queryAllPublicMethods for reflection. Reason: java.lang.NoClassDefFoundError: net/jpountz/lz4/LZ4Exception.
Warning: Could not register io.netty.handler.codec.marshalling.CompatibleMarshallingDecoder: queryAllPublicMethods for reflection. Reason: java.lang.NoClassDefFoundError: org/jboss/marshalling/ByteInput.
Warning: Could not register io.netty.handler.codec.marshalling.CompatibleMarshallingEncoder: queryAllPublicMethods for reflection. Reason: java.lang.NoClassDefFoundError: org/jboss/marshalling/ByteOutput.
Warning: Could not register io.netty.handler.codec.marshalling.MarshallingDecoder: queryAllPublicMethods for reflection. Reason: java.lang.NoClassDefFoundError: org/jboss/marshalling/ByteInput.
Warning: Could not register io.netty.handler.codec.marshalling.MarshallingEncoder: queryAllPublicMethods for reflection. Reason: java.lang.NoClassDefFoundError: org/jboss/marshalling/ByteOutput.
Warning: Could not register io.netty.handler.codec.protobuf.ProtobufDecoder: queryAllPublicMethods for reflection. Reason: java.lang.NoClassDefFoundError: com/google/protobuf/ExtensionRegistryLite.
Warning: Could not resolve org.apache.commons.logging.impl.Log4JLogger for reflection configuration. Reason: java.lang.ClassNotFoundException: org.apache.commons.logging.impl.Log4JLogger.
Warning: Could not resolve org.apache.commons.logging.impl.LogFactoryImpl for reflection configuration. Reason: java.lang.ClassNotFoundException: org.apache.commons.logging.impl.LogFactoryImpl.
Warning: Could not resolve org.apache.commons.logging.impl.WeakHashtable for reflection configuration. Reason: java.lang.ClassNotFoundException: org.apache.commons.logging.impl.WeakHashtable.
Warning: Could not resolve org.apache.log4j.Level for reflection configuration. Reason: java.lang.ClassNotFoundException: org.apache.log4j.Level.
Warning: Could not resolve org.apache.log4j.Priority for reflection configuration. Reason: java.lang.ClassNotFoundException: org.apache.log4j.Priority.
Warning: Could not resolve org.conscrypt.Conscrypt for reflection configuration. Reason: java.lang.ClassNotFoundException: org.conscrypt.Conscrypt.
Warning: Could not resolve org.conscrypt.OpenSSLContextImpl$TLSv13 for reflection configuration. Reason: java.lang.ClassNotFoundException: org.conscrypt.OpenSSLContextImpl$TLSv13.
Warning: Could not resolve org.hamcrest.number.OrderingComparison for reflection configuration. Reason: java.lang.ClassNotFoundException: org.hamcrest.number.OrderingComparison.
Warning: Could not register reactor.netty.channel.MicrometerChannelMetricsHandler$ConnectMetricsHandler: queryAllPublicMethods for reflection. Reason: java.lang.NoClassDefFoundError: io/micrometer/core/instrument/Timer.
Warning: Could not register reactor.netty.channel.MicrometerChannelMetricsHandler$TlsMetricsHandler: queryAllPublicMethods for reflection. Reason: java.lang.NoClassDefFoundError: io/micrometer/core/instrument/Timer.
Warning: Could not register io.netty.handler.codec.compression.Lz4FrameDecoder: queryAllPublicMethods for reflection. Reason: java.lang.NoClassDefFoundError: net/jpountz/lz4/LZ4Exception.
Warning: Could not register io.netty.handler.codec.compression.Lz4FrameEncoder: queryAllPublicMethods for reflection. Reason: java.lang.NoClassDefFoundError: net/jpountz/lz4/LZ4Exception.
Warning: Could not register io.netty.handler.codec.marshalling.CompatibleMarshallingDecoder: queryAllPublicMethods for reflection. Reason: java.lang.NoClassDefFoundError: org/jboss/marshalling/ByteInput.
Warning: Could not register io.netty.handler.codec.marshalling.CompatibleMarshallingEncoder: queryAllPublicMethods for reflection. Reason: java.lang.NoClassDefFoundError: org/jboss/marshalling/ByteOutput.
Warning: Could not register io.netty.handler.codec.marshalling.MarshallingDecoder: queryAllPublicMethods for reflection. Reason: java.lang.NoClassDefFoundError: org/jboss/marshalling/ByteInput.
Warning: Could not register io.netty.handler.codec.marshalling.MarshallingEncoder: queryAllPublicMethods for reflection. Reason: java.lang.NoClassDefFoundError: org/jboss/marshalling/ByteOutput.
Warning: Could not register io.netty.handler.codec.protobuf.ProtobufDecoder: queryAllPublicMethods for reflection. Reason: java.lang.NoClassDefFoundError: com/google/protobuf/ExtensionRegistryLite.
Warning: Could not register org.springframework.security.web.access.expression.WebSecurityExpressionRoot: allDeclaredFields for reflection. Reason: java.lang.NoClassDefFoundError: jakarta/servlet/http/HttpServletRequest.
Warning: Could not register org.springframework.cloud.gateway.filter.ratelimit.RedisRateLimiter: allDeclaredConstructors for reflection. Reason: java.lang.NoClassDefFoundError: org/springframework/data/redis/core/ReactiveStringRedisTemplate.
Warning: Could not register org.springframework.cloud.gateway.filter.ratelimit.RedisRateLimiter: allDeclaredFields for reflection. Reason: java.lang.NoClassDefFoundError: org/springframework/data/redis/core/ReactiveStringRedisTemplate.
Warning: Could not register org.springframework.cloud.gateway.filter.factory.TokenRelayGatewayFilterFactory: allDeclaredMethods for reflection. Reason: java.lang.NoClassDefFoundError: org/springframework/security/oauth2/client/authentication/OAuth2AuthenticationToken.
[1/7] Initializing...                                                                                    (7,7s @ 0,44GB)
 Version info: 'GraalVM 22.3.0 Java 17 CE'
 Java version info: '17.0.5+8-LTS'
 C compiler: gcc (pc, x86_64, 12.2.0)
 Garbage collector: Serial GC
 1 user-specific feature(s)
 - org.springframework.aot.nativex.feature.PreComputeFieldFeature
The bundle named: org.apache.el.Messages, has not been found. If the bundle is part of a module, verify the bundle name is a fully qualified class name. Otherwise verify the bundle path is accessible in the classpath.
Field org.apache.commons.logging.LogAdapter#log4jSpiPresent set to true at build time
Field org.apache.commons.logging.LogAdapter#log4jSlf4jProviderPresent set to true at build time
Field org.apache.commons.logging.LogAdapter#slf4jSpiPresent set to true at build time
Field org.apache.commons.logging.LogAdapter#slf4jApiPresent set to true at build time
Field org.springframework.core.NativeDetector#imageCode set to true at build time
Field org.springframework.core.KotlinDetector#kotlinPresent set to true at build time
Field org.springframework.core.KotlinDetector#kotlinReflectPresent set to true at build time
Field org.springframework.format.support.DefaultFormattingConversionService#jsr354Present set to false at build time
Field org.springframework.cglib.core.AbstractClassGenerator#imageCode set to true at build time
Field org.springframework.security.config.annotation.web.reactive.WebFluxSecurityConfiguration#isOAuth2Present set to false at build time
[2/7] Performing analysis...  []                                                                        (14,2s @ 2,46GB)
   8.744 (87,99%) of  9.937 classes reachable
  12.167 (66,30%) of 18.351 fields reachable
  37.806 (82,39%) of 45.884 methods reachable
     655 classes,   310 fields, and     0 methods registered for reflection
> IDLE
Fatal error: java.lang.TypeNotPresentException: Type org.springframework.security.oauth2.client.ReactiveOAuth2AuthorizedClientManager not present
        at java.base/sun.reflect.generics.factory.CoreReflectionFactory.makeNamedType(CoreReflectionFactory.java:117)
        at java.base/sun.reflect.generics.visitor.Reifier.visitClassTypeSignature(Reifier.java:125)
        at java.base/sun.reflect.generics.tree.ClassTypeSignature.accept(ClassTypeSignature.java:49)
        at java.base/sun.reflect.generics.visitor.Reifier.reifyTypeArguments(Reifier.java:68)
        at java.base/sun.reflect.generics.visitor.Reifier.visitClassTypeSignature(Reifier.java:138)
------------------------------------------------------------------------------------------------------------------------
        at java.base/sun.reflect.generics.tree.ClassTypeSignature.accept(ClassTypeSignature.java:49)
        at java.base/sun.reflect.generics.repository.FieldRepository.computeGenericType(FieldRepository.java:90)
        at java.base/sun.reflect.generics.repository.FieldRepository.getGenericType(FieldRepository.java:82)
        at java.base/java.lang.reflect.Field.getGenericType(Field.java:276)
        at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.reflect.ReflectionDataBuilder.registerTypesForField(ReflectionDataBuilder.java:486)
        at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.reflect.ReflectionDataBuilder.processMethodMetadata(ReflectionDataBuilder.java:251)
        at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.reflect.ReflectionDataBuilder.duringAnalysis(ReflectionDataBuilder.java:199)
        at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.reflect.ReflectionFeature.duringAnalysis(ReflectionFeature.java:254)
        at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.NativeImageGenerator.lambda$runPointsToAnalysis$10(NativeImageGenerator.java:748)
        at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.FeatureHandler.forEachFeature(FeatureHandler.java:85)
        at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.NativeImageGenerator.lambda$runPointsToAnalysis$11(NativeImageGenerator.java:748)
        at org.graalvm.nativeimage.pointsto/com.oracle.graal.pointsto.AbstractAnalysisEngine.runAnalysis(AbstractAnalysisEngine.java:162)
        at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.NativeImageGenerator.runPointsToAnalysis(NativeImageGenerator.java:745)
        at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.NativeImageGenerator.doRun(NativeImageGenerator.java:578)
        at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.NativeImageGenerator.run(NativeImageGenerator.java:535)
        at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.NativeImageGeneratorRunner.buildImage(NativeImageGeneratorRunner.java:403)
        at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.NativeImageGeneratorRunner.build(NativeImageGeneratorRunner.java:580)
        at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.NativeImageGeneratorRunner.main(NativeImageGeneratorRunner.java:128)
Caused by: java.lang.ClassNotFoundException: org.springframework.security.oauth2.client.ReactiveOAuth2AuthorizedClientManager
        at java.base/java.net.URLClassLoader.findClass(URLClassLoader.java:445)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:587)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
        at java.base/java.lang.Class.forName0(Native Method)
        at java.base/java.lang.Class.forName(Class.java:467)
        at java.base/sun.reflect.generics.factory.CoreReflectionFactory.makeNamedType(CoreReflectionFactory.java:114)
        ... 22 more
                        0,7s (3,1% of total time) in 19 GCs | Peak RSS: 3,68GB | CPU load: 9,16
========================================================================================================================
Failed generating 'demo' after 22,1s.
    Error: Image build request failed with exit status 1

> Task :nativeCompile FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':nativeCompile'.
> Process 'command '/home/julian/.sdkman/candidates/java/22.3.r17-nik/bin/native-image'' finished with non-zero exit value 1

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 32s
10 actionable tasks: 10 executed
```