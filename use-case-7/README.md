# Use Case 7: Sort Bogies by Capacity (Comparator)

This use case demonstrates how passenger bogies can be sorted by seating capacity using a custom `Comparator`.

## Flow
1. User creates passenger bogie objects.
2. Bogies are stored in a `List`.
3. System applies a `Comparator` to sort by capacity.
4. Sorted bogies are displayed in order.
5. Program continues.

## Key Concepts Used
- `Comparator` interface for custom sorting logic.
- Custom `Bogie` objects to model bogie details.
- `List<Bogie>` to store multiple passenger bogies.
- `sort()` to rearrange elements by business rule.
- `Comparator.comparingInt()` to sort by `capacity`.
- Lambda-ready functional style supported by Java collections.

## Java Files
`src/Bogie.java`

`src/TrainAppUC7.java`

## Sample Output
```text
=== Train Consist Management App ===
Use Case 7: Sort Bogies by Capacity
Passenger bogies sorted by capacity:
Bogie{bogieName='First Class', capacity=40}
Bogie{bogieName='AC Chair', capacity=56}
Bogie{bogieName='Sleeper', capacity=72}
```
