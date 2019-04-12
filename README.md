Kotlin Native MPP Template
==========================

This repository contains several template projects to simplify the setup of Kotlin/Native projects. Every branch includes a different example.

All projects use Gradle with Kotlin DSL and the Kotlin Multiplatform plugin. You may open the project either in IntelliJ IDEA or in CLion

Are we missing more templates? Please contribute!


License
=======

MIT. 

See the LICENSE file in the repository

Using The Template
===================

Checkout the
[master branch](https://github.com/jonnyzzz/kotlin-native-mpp-template)
of the repository to get more details and learn about other available templates 


Use these script to apply the branch from commandline:
```bash
git remote add jonnyzzz-kn https://github.com/jonnyzzz/kotlin-native-mpp-template.git
git fetch jonnyzzz-kn
git merge jonnyzzz-kn/mingw-x64+tests --allow-unrelated-histories

## Enjoy!
```

In The Branch
=============

That branch contains an example of the `mingw X64` Kotlin/Native setup
for Kotlin/Native for Windows.

Use the
```
./gradlew runDebugExecutableMingwX64
```

To tun the application!

Tests classes uses `kotiln.test` multiplatform library, 
see the `src/macosX64Test/kotlin` folder for sources. 

To execute tests, use the
```
./gradlew macosX64Test
```

It will show a similar output from the test runner:
```
> Task :macosX64Test FAILED
[==========] Running 2 tests from 1 test cases.
[----------] Global test environment set-up.
[----------] 2 tests from org.jonnyzzz.kotlin.mpp.template.ThisIsKotlinTest
[ RUN      ] org.jonnyzzz.kotlin.mpp.template.ThisIsKotlinTest.test
[       OK ] org.jonnyzzz.kotlin.mpp.template.ThisIsKotlinTest.test (0 ms)
[ RUN      ] org.jonnyzzz.kotlin.mpp.template.ThisIsKotlinTest.test with long name
kotlin.AssertionError: this is executed to generate failure message
        at 0   test.kexe                           0x000000010f345e06 kfun:kotlin.Error.<init>(kotlin.String?)kotlin.Error + 70
        at 1   test.kexe                           0x000000010f345c57 kfun:kotlin.AssertionError.<init>(kotlin.Any?)kotlin.AssertionError + 119
        at 2   test.kexe                           0x000000010f342ce2 kfun:org.jonnyzzz.kotlin.mpp.template.ThisIsKotlinTest.test with long name() + 146
        at 3   test.kexe                           0x000000010f342bf8 kfun:org.jonnyzzz.kotlin.mpp.template.$ThisIsKotlinTest$test$0.$test with long name$FUNCTION_REFERENCE$1.invoke#internal + 72
        at 4   test.kexe                           0x000000010f3dd62c kfun:kotlin.native.internal.test.BaseClassSuite.TestCase.run() + 492
        at 5   test.kexe                           0x000000010f3d73bb kfun:kotlin.native.internal.test.TestRunner.run#internal + 1131
        at 6   test.kexe                           0x000000010f3d69d3 kfun:kotlin.native.internal.test.TestRunner.runIteration#internal + 1395
        at 7   test.kexe                           0x000000010f3d61a3 kfun:kotlin.native.internal.test.TestRunner.run()ValueType + 627
        at 8   test.kexe                           0x000000010f3d52de kfun:kotlin.native.internal.test.testLauncherEntryPoint(kotlin.Array<kotlin.String>)ValueType + 110
        at 9   test.kexe                           0x000000010f3dc252 kfun:kotlin.native.internal.test.main(kotlin.Array<kotlin.String>) + 50
        at 10  test.kexe                           0x000000010f3428f6 EntryPointSelector + 6
        at 11  test.kexe                           0x000000010f3427e1 Konan_run_start + 113
        at 12  test.kexe                           0x000000010f34275b Konan_main + 27
        at 13  libdyld.dylib                       0x00007fff6015a3d5 start + 1
        at 14  ???                                 0x0000000000000001 0x0 + 1
[  FAILED  ] org.jonnyzzz.kotlin.mpp.template.ThisIsKotlinTest.test with long name (0 ms)
[----------] 2 tests from org.jonnyzzz.kotlin.mpp.template.ThisIsKotlinTest (1 ms total)

[----------] Global test environment tear-down
[==========] 2 tests from 1 test cases ran. (1 ms total)
[  PASSED  ] 1 tests.
[  FAILED  ] 1 tests, listed below:
[  FAILED  ] org.jonnyzzz.kotlin.mpp.template.ThisIsKotlinTest.test with long name

1 FAILED TESTS
```
