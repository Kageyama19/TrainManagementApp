# Use Case 8: Filter Passenger Bogies Using Streams

This use case demonstrates filtering passenger bogies using the Java Stream API.

## Flow
1. User creates a list of passenger bogies.
2. The list is converted into a stream using `stream()`.
3. `filter()` is applied with the condition `b -> b.getCapacity() > 60`.
4. Matching bogies are collected into a new list.
5. Filtered bogies are displayed.

## Key Concepts Used
- `Stream API` for declarative collection processing.
- `stream()` to create a stream pipeline from the bogie list.
- `filter()` to select only matching bogies.
- Lambda expressions to express the filtering rule concisely.
- `collect(Collectors.toList())` to create a new filtered list.

## Java Files
`src/Bogie.java`

`src/TrainAppUC8.java`

## Sample Output
```text
=== Train Consist Management App ===
Use Case 8: Filter Passenger Bogies Using Streams
Original passenger bogies:
Bogie{bogieId='BG201', bogieType='Sleeper', capacity=72}
Bogie{bogieId='BG202', bogieType='AC Chair Car', capacity=60}
Bogie{bogieId='BG203', bogieType='General', capacity=90}
Bogie{bogieId='BG204', bogieType='First Class', capacity=48}
Bogie{bogieId='BG205', bogieType='Double Decker', capacity=120}
Filtered passenger bogies with capacity greater than 60:
Bogie{bogieId='BG201', bogieType='Sleeper', capacity=72}
Bogie{bogieId='BG203', bogieType='General', capacity=90}
Bogie{bogieId='BG205', bogieType='Double Decker', capacity=120}
Original list remains unchanged: 5 bogies
Filtered list size: 3
```
