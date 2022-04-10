# Star Wars
An Android app that interacts with the open  [Star Wars API](https://swapi.dev/) to search movie characters and getting character details.

### Features
- Clean Architecture with MVVM and Repository Pattern
- Dagger Hilt
- Kotlin Coroutines with Flow
- Kotlin Gradle DSL

## Table of content
- [Prerequisite](#Prerequisite)
- [Design](#Design)
- [Architecture](#Architecture)
- [Testing](#Testing)
- [Libraries](#Libraries)
- [Demo](#Demo)
- [Extras](#Extras)

## Prerequisite
[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21)
- Android Studio 4.1 or higher
- Gradle 6.5

## Design
This app has two pages:
##### Character Search page
On this page, we need a SearchView, a recyclerview to show search results and an empty layout if no character is found. So after landing the first page, if SearchView appears at the top position then there will remain a lot of empty spaces. For that I used `motionLayout` and SearchView will be shown in the middle position at the initial stage and after the input on SearchView, it will move to the top with animation and will be showing the search result in recyclerview below the SearchView or show an empty layout if no result found.
##### Character details page
On this page, we need 4 different details section, (Profile, Planet, Species and Films) where species and films, both can have multiple items, I used vertical recyclerview to show species items because each species item has a small amount of data and for film details used horizontal recyclerview because each film item has a large amount of data. Each section will be shown with details info if get details from API and if data not found in a section then the unavailable text will be shown there.

## Architecture
The architecture of the project follows the principles of **Clean Architecture** and uses **MVVM** Architecture and Kotlin along with the Repository pattern to provide clean and scalable development. The main benefits of using Clean Architecture are decoupled code and easier to reuse, maintain and test code. It also maximizes the use of **SOLID** principles.

##### Why MVVM ?
There are a few well-known architectural patterns (MVC, MVP, MVVM, MVI) used in the Android community. Any design pattern can be used. But we will have to choose the one which meets our requirements.

In **MVC**, the Controller is tied so tightly to the Android APIs that it is difficult to unit test also it is tightly coupled to the views.

**MVI** could be used here but it introduces complexity to both create and maintain. It also generates more boilerplate code than **MVVM** and **MVP**.

As this is a small project I think **MVVM** is enough. **MVP** was our go-to solution for a long time, for separating UI code from the rest of the app. We can combine Clean Architecture with the **MVP** architecture as well. But since Android Architecture Components already provides a built-in ViewModel class, we are going with **MVVM** over **MVP**

Our `app` module contains all of the code related to the Presentation layer and all the things from Android SDK. This includes things Activities, ViewModels, etc. I used the **MVVM** architectural pattern to separate the UI code from the rest of the app, coupled with Android Architecture Components. 

##### Modules
In this project, layers are divided into different gradle modules namely: 
- __Presentation__:  Layer with the Android Framework, the MVVM pattern and the DI module. Depends on the domain to access the use cases and on DI, to inject dependencies.
- __Domain__: Layer with business logic. Contains the use cases, in charge of calling the correct repository or data member.
- __Data__: Layer with the responsibility of providing data for the domain layer. It contains the implementations of the repositories declare in the domain layer. 

|<img src="images/data_flow.jpg"/>|
|:----:|

The presentation and data layers are only aware of the domain layer and not each other.

To make dependencies manageable it uses Dagger-Hilt as Dependency Injection and it uses Coroutines with Flow for asynchronous programming.

##### Presentation
In this project, `app` module is the presentation layer where contains the UI files (activities) and ViewModel which control the views. UI communicates with ViewModel to request data and observe the ViewModel, using live data components and react to its changes. ViewModel communicates with the domain layer and invokes UseCases, collects data and updates live data. 

Dependency Injection also implemented here which provides proper objects and injects them to desired dependencies.

##### Domain
Business logic can be defined as the core operations done by the application. The `domain` module contains the app business logic. The components of the domain are Entities, Repositories and UseCases. 
Entities are the data classes that represent the objects on which the business is based. 
Repositories are interfaces used by the use cases and implemented in the data layer.
UseCases which represent a single unit of business logic, use the repositories to resolve the action they are supposed to do. UseCases override the operator `invoke`, so they can be called as a function.

##### Data
The `data` module is the implementation of all the repositories declared by the domain layer. It handles data interacting with the network and is later served up to the presentation layer. 
In this project, this module uses the Retrofit library to fetch data from the [Star Wars API](https://swapi.dev/). It contains `HttpsInterceptor` that modifies API requests and changes their scheme from `http` to the secure `https` to avoid cleartext issues because the [Star Wars API](https://swapi.dev/) returns non `https` URLs for fetching character details. 

## Testing
Junit4 is used in this project to testing the framework with Google Truth for making assertions. 
In the `data` module, used MockWebServer to test the API request and verify that mock JSON responses provided in the test resource folder are returned. 

In the `app` module,  there are unit tests for ViewModels, UI Screens and util classes. Used robolectric in ViewModel testing and espresso in UI testing. For dependencies support, inside the test environment, used custom runner `HiltTestRunner` which is extending AndroidJUnitRunner.

The test uses fake objects for all the tests instead of mocks because it makes it easier to verify interactions between objects and their dependencies and simulate the behavior of the real objects.

## Libraries
The app is built upon the following libraries :
- [Viewmodel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Manage UI related data in a lifecycle conscious way and act as a channel between use cases and UI.
- [View Binding](https://developer.android.com/topic/libraries/view-binding) - Allows to more easily write code that interacts with views.
- [Retrofit](https://square.github.io/retrofit/) - Type-safe HTTP client for Android.  
- [Moshi](https://github.com/square/moshi) - A modern JSON library, used to parse requests on the data layer for Entities and understands Kotlin non-nullable and default parameters.
- [Dagger Hilt](https://dagger.dev/hilt) - Handles dependency injection.
- [okhttp-logging-interceptor](https://github.com/square/okhttp/blob/master/okhttp-logging-interceptor/README.md) - logs HTTP request and response data.
- [kotlinx.coroutines](https://github.com/Kotlin/kotlinx.coroutines) - Library Support for coroutines, provides `runBlocking` coroutine builder used in tests.
- [Truth](https://truth.dev/) - Assertions Library, provides readability as far as assertions are concerned.
- [MockWebServer](https://github.com/square/okhttp/tree/master/mockwebserver) - Web server for testing HTTP clients, verify requests and responses on the star wars api with the retrofit client.
- [Material Design](https://material.io/develop/android/docs/getting-started/) - build awesome beautiful UIs.
- [Robolectric](http://robolectric.org/) - Unit test on android framework.
- [Espresso](https://developer.android.com/training/testing/espresso) - Test framework to write UI Tests.
- [recyclerview-animators](https://github.com/wasabeef/recyclerview-animators) - Recycler View Animations.
- [AboutLibraries](https://github.com/mikepenz/AboutLibraries) - Provide info on used open source libraries.
- [Stetho](https://github.com/facebook/stetho) - Debug bridge.
- [Kotlin Gradle DSL](https://guides.gradle.org/migrating-build-logic-from-groovy-to-kotlin)

## Demo
|<img src="images/home_screen.jpg" width=200/>|<img src="images/search_result.jpg" width=200/>|<img src="images/details.jpg" width=200/>|<img src="images/no_result.jpg" width=200/>|
|:----:|:----:|:----:|:----:|

## Extras
The Gradle script uses Kotlin Gradle DSL for leveraging the functionality of Kotlin and the code suggestion feature along with other features of the IDEs in the Gradle file also just like any other normal Kotlin file.
