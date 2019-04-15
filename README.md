Kotlin Native JVM Template
==========================

This branch contains a Kotlin JVM applicatino project. It uses `kotlin-jvm` Gradle plugin instead of the multiplatform plugin.

All projects use Gradle with Kotlin DSL and the Kotlin Multiplatform plugin. You may open the project either in IntelliJ IDEA or in CLion

Are we missing more templates? Please contribute!

License
=======

MIT. 

See the `LICENSE` file in the repository



Using The Template
===================

Checkout the
[master branch](https://github.com/jonnyzzz/kotlin-native-mpp-template)
of the repository to get more details and learn about other available templates 


Use these script to apply the branch from commandline:
```bash
git remote add jonnyzzz-kn https://github.com/jonnyzzz/kotlin-native-mpp-template.git
git fetch jonnyzzz-kn
git merge jonnyzzz-kn/jvm --allow-unrelated-histories

## Enjoy!
```

In The Branch
=============

That branch contains an example of the Kotlin/JVM setup.

On Linux and macOS use
```
./gradlew run
```
On Windows use
```
gradlew run
```

To tun the application!


