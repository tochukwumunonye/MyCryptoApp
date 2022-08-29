![Android Build](https://github.com/Ezike/StarWarsSearch/workflows/Android%20Build/badge.svg)

# Egym App

Hi 👋🏼👋🏼👋🏼
Thanks so much for checking out my project. 
## Table of content

- [Prerequisite](#prerequisite)
- [Preview](#preview)
- [Feature](#feature)
- [Design](#design)
- [Architecture](#architecture)
- [Testing](#testing)
- [Improvement](#improvement)


## Prerequisite
- Android Studio Arctic Fox | 2020.3.1
- Gradle version 7.1.0
- MinSdk 21
- TargetSdk 32

## Preview
#### Portrait Orientation

<img src="https://user-images.githubusercontent.com/61085272/187267880-4f43e35a-a025-4870-b335-15086f09db21.png" width="33%" /> <img src="https://user-images.githubusercontent.com/61085272/187267650-40d489a9-9b43-4aca-924a-cf26dbcf5b89.png" width="33%" /> <img src="https://user-images.githubusercontent.com/61085272/187292563-db37bb86-616f-4c97-a95c-463b8d9a3782.jpg" width="33%" /> 

#### LandScape Orientation
<img src="https://user-images.githubusercontent.com/61085272/187267378-2c134d7f-f484-4887-b372-ae97cfa5de32.png" width="33%" /> <img src="https://user-images.githubusercontent.com/61085272/187270133-46c951f2-08ab-4995-81dd-6efecf780b92.png" width="33%" /> <img src="https://user-images.githubusercontent.com/61085272/187294121-e134aef1-1204-4265-92b3-e54cb0f30288.jpg" width="33%" /> 

## Feature
App should show a list of New York Time stories in ` Master View and Detail View`. The master view contains a list of articles and the details of each story will be represented in detail view.

```
The list View contains
-  Small image
-  Title
-  Author
```

```
The detail View contains 
- Large Image
- Title
- See more Button to preview article in web view
- Description
- Author
```

## Design
A master- detail view which i was instructed, is a design concept whereby a list of items(referred to as the master list) is displayed to the user. On selecting 
an item from the list, additional information related to the item is then presented to the user within the detail pane.
On tablet sized Android device displays in landscape orientation, the master list appears in a narrow vertical panel along the left-hand edge of the screen. The remainder of the display is devoted to the detail pane in an arrangement referred to as two-pane mode.

On smaller, phone sized Android devices, the master list takes up the entire screen and the detail pane appears on a separate screen which appears when a selection is made from the master list. 

- Here I leveraged on Sliding pane layout to achieve this. I designed according to the recommended window size class

![expanded](https://user-images.githubusercontent.com/61085272/187313496-7f8acd25-271c-49ab-8076-933160373ff7.png)

- Constraint layouts were also used to prevent nested views and ensure layouts rendered in less than 60 frames per second which prevents UI jank
- Layouts were also created to support landscape mode incase of device rotation


## Architecture

The application follows clean architecture because of the benefits it brings to software which includes scalability, maintainability and testability.
It enforces separation of concerns and dependency inversion, where higher and lower level layers all depend on abstractions. In the project, the layers are separated into different layers namely:

- Data Layer
- Domain Layer
- Presentation Layer


### Data Layer
The data layer contains application data and business logic. The business logic is what gives value to your app—it's made of real-world business rules that determine how application data must be created, stored, and changed.

#### Remote layer
The remote later relies on Retrofit library to fetch data from the API.  The remote layer contains its own data class called ArticleResult which maps to another data class (Article) within domain layer. 

#### Repository
My repository was used to expose data to the rest of the application and also reolving conflicts. Helped in Abstracting sources of data from the rest of the app.


### Presentation
The UI/Presentation layer is the pipeline that converts application data-changes to a form that the UI can present and then displays it. I used a  pattern where state of the application flows down and events flow up called `Unidirectional data flow`. Here the view model holds and exposes the state in an observable data holder called `Stateflow`. This ensures quick retoration of state after configuration changes. Alos the UI can react to any changes made in the state without having to manually pull data directly from the ViewModel.

The UI notifies the ViewModel of user events and data requests.
The ViewModel handles the actions and updates the state.
The updated state is fed back to the UI to render.
The above is repeated for any event that causes a mutation of state.


## Testing
Testing is done with Junit4 testing framework for assertions and Mockito for mocking classes. Each  layer has its own test. 
Viewmodel tests verify that each call to repository produces the correct view state.
Repository Test verify each interaction with server returns the expected result.


## Improvement
- App should be made to operate offline first because network availability is not always guaranteed
-  I feel Paging Library should be used for pagination to allow the app use both network bandwidth and system resources more efficiently
-  I also will be grateful to hear your feedback/criticism so I can improve and make different decisions next time.


## - Built With 🛠
- [Kotlin](https://kotlinlang.org/) - First class and official programming language for Android development.
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) - Collection of libraries that help you design robust, testable, and maintainable apps.
  - [StateFlows](https://developer.android.com/kotlin/flow) -  Flow APIs that enable flows to optimally emit state updates and emit values to multiple consumers.
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes.
  - [LiveData] -Lifecycle aware data holder 
- [Retrofit](https://square.github.io/retrofit/) - A type-safe HTTP client for Android and Java.
- [OkHttp](http://square.github.io/okhttp/) - HTTP client that's efficient by default: HTTP/2 support allows all requests to the same host to share a socket
- [Glide](https://github.com/bumptech/glide) - image loading framework for Android
- [Gson](https://github.com/google/gson) - used to convert Java Objects into their JSON representation and vice versa.
- [Mockito](http://site.mockito.org/) - Most popular mocking framework for Java/kotlin.
