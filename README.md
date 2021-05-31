## Android Components Architecture in a Modular Word
[![License](https://img.shields.io/badge/License-Apache%202.0-lightgrey.svg)](http://www.apache.org/licenses/LICENSE-2.0)

<img src="screenshots/demo/demo.gif" width="250" align="right" hspace="20">

## Table of Contents

-   [Development](https://github.com/vyshas/kotlin-sample-app#development)
-   [Architecture](https://github.com/vyshas/kotlin-sample-app#architecture)
-   [Documentation](https://github.com/vyshas/kotlin-sample-app#documentation)
-   [Tech-stack](https://github.com/vyshas/kotlin-sample-app#tech-stack)
-   [License](https://github.com/vyshas/kotlin-sample-app#license)

## Development

### Environment setup

First off, you require the latest Android Studio 4.1.0 (or newer) to be able to build the app.

You need to supply keys for Marvel API. You can find information about how to gain access by using the [link](https://developer.marvel.com).

When you obtain the keys, you can provide them to the app by putting the following in the `local.properties` project root file:

```properties
#Marvel API KEYS
marvel.key.public = <insert>
marvel.key.private = <insert>
```

## Architecture

The architecture of the application is based, apply and strictly complies with each of the following 5 points:

<img src="screenshots/architecture/project_structure.png" width="300" align="right" hspace="20">

-   A single-activity architecture, using the [Navigation component](https://developer.android.com/guide/navigation/navigation-getting-started) to manage fragment operations.
-   [Android architecture components](https://developer.android.com/topic/libraries/architecture/), part of Android Jetpack for give to project a robust design, testable and maintainable.
-   Pattern [Model-View-ViewModel](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93viewmodel) (MVVM) facilitating a [separation](https://en.wikipedia.org/wiki/Separation_of_concerns) of development of the graphical user interface.
-   [S.O.L.I.D](https://en.wikipedia.org/wiki/SOLID) design principles intended to make software designs more understandable, flexible and maintainable.
-   [Modular app architecture](https://proandroiddev.com/build-a-modular-android-app-architecture-25342d99de82) allows to be developed features in isolation, independently from other features.

### Modules

Modules are collection of source files and build settings that allow you to divide a project into discrete units of functionality. In this case apart from dividing by functionality/responsibility, existing the following dependence between them:

<p align="center">
 <img src="screenshots/architecture/diagram_communication_modules.png">
</p>

The above graph shows the app modularisation:
-   `:app` depends on `:core` and indirectly depends on `:features` by dynamic-features.
-   `:features` modules depends on `:commons`, `:core`, `:libraries` and `:app`.
-   `:core` and `:commons` only depends for possible utils on `:libraries`.
-   `:libraries` don’t have any dependency.

## Documentation

The documentation is generated following [KDoc](https://kotlinlang.org/docs/reference/kotlin-doc.html) language (the equivalent of Java's [JavaDoc](https://en.wikipedia.org/wiki/Javadoc)) via documentation engine for Kotlin [Dokka](https://github.com/Kotlin/dokka).

To consult it check this [link](https://vyshas.github.io/android-modular-architecture/) or open the project `/docs` directory.

## Tech-stack

This project takes advantage of many popular libraries, plugins and tools of the Android ecosystem. Most of the libraries are in the stable version, unless there is a good reason to use non-stable dependency.


## License

```license
Copyright 2019-2020 vyshas

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
