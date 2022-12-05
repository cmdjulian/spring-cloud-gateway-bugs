# Instructions

Trying to run `./gradlew check` results in the following runtime error if the `org.graalvm.buildtools.native` is
present:

```
> Task :processTestAot FAILED
14:33:38.168 [main] INFO org.springframework.test.context.aot.TestClassScanner - Scanning for Spring test classes in all packages in classpath roots [/home/julian/Git/etalytics/scripts-engine/guard/build/classes/kotlin/test]
14:33:38.373 [main] DEBUG org.springframework.test.context.util.TestContextSpringFactoriesUtils - Skipping candidate TestExecutionListener [org.springframework.test.context.web.ServletTestExecutionListener] due to a missing dependency. Specify custom TestExecutionListener classes or make the default TestExecutionListener classes and their required dependencies available. Offending class: [jakarta/servlet/ServletContext]
14:33:38.376 [main] DEBUG org.springframework.test.context.util.TestContextSpringFactoriesUtils - Skipping candidate TestExecutionListener [org.springframework.test.context.transaction.TransactionalTestExecutionListener] due to a missing dependency. Specify custom TestExecutionListener classes or make the default TestExecutionListener classes and their required dependencies available. Offending class: [org/springframework/transaction/interceptor/TransactionAttributeSource]
14:33:38.376 [main] DEBUG org.springframework.test.context.util.TestContextSpringFactoriesUtils - Skipping candidate TestExecutionListener [org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener] due to a missing dependency. Specify custom TestExecutionListener classes or make the default TestExecutionListener classes and their required dependencies available. Offending class: [org/springframework/transaction/interceptor/TransactionAttribute]
14:33:38.378 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using TestExecutionListeners for test class [GuardTests]: [DirtiesContextBeforeModesTestExecutionListener, ApplicationEventsTestExecutionListener, MockitoTestExecutionListener, DependencyInjectionTestExecutionListener, DirtiesContextTestExecutionListener, WithSecurityContextTestExecutionListener, EventPublishingTestExecutionListener, ReactorContextTestExecutionListener, RestDocsTestExecutionListener, MockRestServiceServerResetTestExecutionListener, MockMvcPrintOnlyOnFailureTestExecutionListener, WebDriverTestExecutionListener, MockWebServiceServerTestExecutionListener, ResetMocksTestExecutionListener]
14:33:38.383 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [GuardTests]: using SpringBootContextLoader
14:33:38.383 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [de.etalytics.guard.GuardTests]: no resource found for suffixes {-context.xml, Context.groovy}.
14:33:38.384 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils - Could not detect default configuration classes for test class [de.etalytics.guard.GuardTests]: GuardTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
14:33:38.399 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using ContextCustomizers for test class [GuardTests]: [DisableObservabilityContextCustomizer, PropertyMappingContextCustomizer, Customizer, ExcludeFilterContextCustomizer, DuplicateJsonObjectContextCustomizer, MockitoContextCustomizer, TestRestTemplateContextCustomizer, WebTestClientContextCustomizer]
14:33:38.444 [main] DEBUG org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider - Identified candidate component class: file [/home/julian/Git/etalytics/scripts-engine/guard/build/classes/kotlin/main/de/etalytics/guard/Guard.class]
14:33:38.452 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Found @SpringBootConfiguration de.etalytics.guard.Guard for test class de.etalytics.guard.GuardTests
Exception in thread "main" java.lang.NoClassDefFoundError: jakarta/servlet/Filter
        at java.base/java.lang.ClassLoader.defineClass1(Native Method)
        at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1012)
        at java.base/java.security.SecureClassLoader.defineClass(SecureClassLoader.java:150)
        at java.base/jdk.internal.loader.BuiltinClassLoader.defineClass(BuiltinClassLoader.java:862)
        at java.base/jdk.internal.loader.BuiltinClassLoader.findClassOnClassPathOrNull(BuiltinClassLoader.java:760)
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClassOrNull(BuiltinClassLoader.java:681)
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:639)
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
        at java.base/java.lang.ClassLoader.defineClass1(Native Method)
        at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1012)
        at java.base/java.security.SecureClassLoader.defineClass(SecureClassLoader.java:150)
        at java.base/jdk.internal.loader.BuiltinClassLoader.defineClass(BuiltinClassLoader.java:862)
        at java.base/jdk.internal.loader.BuiltinClassLoader.findClassOnClassPathOrNull(BuiltinClassLoader.java:760)
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClassOrNull(BuiltinClassLoader.java:681)
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:639)
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
        at org.springframework.security.test.aot.hint.WebTestUtilsTestRuntimeHints.registerFilterChainProxyHints(WebTestUtilsTestRuntimeHints.java:44)
        at org.springframework.security.test.aot.hint.WebTestUtilsTestRuntimeHints.registerHints(WebTestUtilsTestRuntimeHints.java:38)
        at org.springframework.test.context.aot.TestContextAotGenerator.lambda$processAheadOfTime$0(TestContextAotGenerator.java:145)
        at java.base/java.lang.Iterable.forEach(Iterable.java:75)
        at org.springframework.test.context.aot.TestContextAotGenerator.lambda$processAheadOfTime$1(TestContextAotGenerator.java:140)
        at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        at java.base/java.util.stream.DistinctOps$1$2.end(DistinctOps.java:168)
        at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:510)
        at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
        at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
        at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:596)
        at org.springframework.test.context.aot.TestContextAotGenerator.processAheadOfTime(TestContextAotGenerator.java:135)
        at org.springframework.test.context.aot.TestAotProcessor.performAotProcessing(TestAotProcessor.java:91)
        at org.springframework.test.context.aot.TestAotProcessor.doProcess(TestAotProcessor.java:72)
        at org.springframework.test.context.aot.TestAotProcessor.doProcess(TestAotProcessor.java:39)
        at org.springframework.context.aot.AbstractAotProcessor.process(AbstractAotProcessor.java:82)
        at org.springframework.boot.test.context.SpringBootTestAotProcessor.main(SpringBootTestAotProcessor.java:57)
Caused by: java.lang.ClassNotFoundException: jakarta.servlet.Filter
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
        ... 48 more
Kotlin build report is written to /home/julian/Git/etalytics/scripts-engine/guard/build/reports/kotlin-build/etaGuard-build-2022-12-05-14-33-38.txt

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':processTestAot'.
> Process 'command '/home/julian/.sdkman/candidates/java/22.3.r17-nik/bin/java'' finished with non-zero exit value 1

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.

* Get more help at https://help.gradle.org

Deprecated Gradle features were used in this build, making it incompatible with Gradle 8.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

See https://docs.gradle.org/7.6/userguide/command_line_interface.html#sec:command_line_warnings
```
