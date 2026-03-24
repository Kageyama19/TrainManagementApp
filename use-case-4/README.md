# Use Case 4: Maintain Ordered Bogie IDs (LinkedList)

This use case demonstrates ordered train chaining behavior using `LinkedList`.

## Flow
1. User adds bogies to the consist.
2. System inserts a Pantry Car in the middle.
3. System removes the first and last bogies.
4. Final ordered consist is displayed.

## Java File
`src/TrainAppUC4.java`

## Sample Output
```text
=== Train Consist Management App ===
Use Case 4: Maintain Ordered Bogie IDs
Removed first bogie: Engine
Removed last bogie: Guard
Final ordered train consist: [Sleeper, Pantry Car, AC, Cargo]
```
