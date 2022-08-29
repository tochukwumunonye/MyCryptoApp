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
A master- detail view which i was instructed is a design concept whereby a list of items(referred to as the master list) is displayed to the user. On selecting 
an item from the list, additional information related to the item is then presented to the user within the detail pane.
On tablet sized Android device displays in landscape orientation, the master list appears in a narrow vertical panel along the left-hand edge of the screen. The remainder of the display is devoted to the detail pane in an arrangement referred to as two-pane mode.


On smaller, phone sized Android devices, the master list takes up the entire screen and the detail pane appears on a separate screen which appears when a selection is made from the master list. 

- Here I leveraged on Sliding pane layout to achieve this.
- Constraint layouts were used to prevent nested views and ensure layouts rendered in less than 60 frames per second which prevents UI jank
- Layouts were also created to support landscape mode incase of device rotation


The Master/Detail Flow

On tablet sized Android device displays in landscape orientation, the master list appears in a narrow vertical panel along the left-hand edge of the screen. The remainder of the display is devoted to the detail pane in an arrangement referred to as two-pane mode﻿. Figure 51-1, for example, shows the master/detail, two-pane arrangement with master items listed and the content of item one displayed in the detail pane:


As3.0 master detail tablet.png


On smaller, phone sized Android devices, the master list takes up the entire screen and the detail pane appears on a separate screen which appears when a selection is made from the master list. In this mode, the detail screen includes an action bar entry to return to the master list. Figure 51-2 for example, illustrates both the master and detail screens for the same item list on a 4” phone screen:

