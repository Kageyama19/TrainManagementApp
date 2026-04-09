# Use Case 9: Group Bogies by Type (Collectors.groupingBy)

This use case demonstrates how bogies can be grouped into categories using `Collectors.groupingBy()`.

## Flow
1. User creates a list of bogies.
2. System converts the list into a stream.
3. `groupingBy()` collector is applied.
4. Bogies are grouped into a `Map`.
5. Grouped result is displayed.

## Key Concepts Used
- `Collectors.groupingBy()` to classify bogies into groups.
- Stream pipeline to transform a flat list into a grouped structure.
- `Map<String, List<Bogie>>` as the grouped result format.
- Lambda and method reference based classification logic.
- Data aggregation for reporting and analysis.

## Java Files
`src/Bogie.java`

`src/TrainAppUC9.java`

## Sample Output
```text
=== Train Consist Management App ===
Use Case 9: Group Bogies by Type
Original bogie list:
Bogie{bogieId='BG301', bogieType='Sleeper', capacity=72}
Bogie{bogieId='BG302', bogieType='AC Chair', capacity=56}
Bogie{bogieId='BG303', bogieType='Sleeper', capacity=72}
Bogie{bogieId='BG304', bogieType='First Class', capacity=40}
Bogie{bogieId='BG305', bogieType='AC Chair', capacity=56}
Grouped bogies by type:
Sleeper -> [Bogie{bogieId='BG301', bogieType='Sleeper', capacity=72}, Bogie{bogieId='BG303', bogieType='Sleeper', capacity=72}]
AC Chair -> [Bogie{bogieId='BG302', bogieType='AC Chair', capacity=56}, Bogie{bogieId='BG305', bogieType='AC Chair', capacity=56}]
First Class -> [Bogie{bogieId='BG304', bogieType='First Class', capacity=40}]
Original list remains unchanged: 5 bogies
Total groups formed: 3
```
