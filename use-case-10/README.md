# Use Case 10: Count Total Seats in Train (reduce)

This use case demonstrates how to aggregate bogie seating capacities into a single total using `map()` and `reduce()`.

## Flow
1. User creates a list of bogies.
2. System converts the list into a stream.
3. `map()` extracts capacity values.
4. `reduce()` sums the capacities.
5. Total seating capacity is displayed.

## Key Concepts Used
- `map()` to extract numeric capacity values from bogie objects.
- `reduce()` to combine all capacities into a single total.
- `Integer::sum` as a method reference for aggregation.
- Functional aggregation using a stream pipeline.
- Numeric analytics for capacity planning.

## Java Files
`src/TrainAppUC10.java`

## Sample Output
```text
=== Train Consist Management App ===
Use Case 10: Count Total Seats in Train
Passenger bogies in the train:
Bogie{bogieId='BG401', bogieType='Sleeper', capacity=72}
Bogie{bogieId='BG402', bogieType='AC Chair', capacity=56}
Bogie{bogieId='BG403', bogieType='First Class', capacity=40}
Bogie{bogieId='BG404', bogieType='Sleeper', capacity=72}
Total seating capacity of the train: 240
Original list remains unchanged: 4 bogies
```
