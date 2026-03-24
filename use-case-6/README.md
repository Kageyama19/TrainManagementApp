# Use Case 6: Map Bogie to Capacity (HashMap)

This use case demonstrates bogie-to-capacity mapping using `HashMap<String, Integer>`.

## Flow
1. User creates bogie-capacity mapping.
2. System inserts key-value pairs with `put()`.
3. System iterates over entries using `entrySet()`.
4. Bogie and capacity values are displayed.

## Java File
`src/TrainAppUC6.java`

## Sample Output
```text
=== Train Consist Management App ===
Use Case 6: Map Bogie to Capacity
Bogie Capacity Details:
AC Chair -> 78
Sleeper -> 72
First Class -> 24
```

Note: `HashMap` does not guarantee display order of entries.
