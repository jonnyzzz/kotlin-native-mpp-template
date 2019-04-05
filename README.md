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
git merge jonnyzzz-kn/macos-x64 --allow-unrelated-histories

## Enjoy!
```

In The Branch
=============

That branch contains an example of the `macos X64` setup
for Kotlin/Native.

Use the
```
./gradlew runDebugExecutableMacosX64
```

To tun the application!
