# Use Case 3: Track Unique Bogie IDs (Set - HashSet)

This use case demonstrates uniqueness enforcement for bogie IDs using `HashSet`.

## Flow
1. User adds bogie IDs.
2. System inserts IDs into `HashSet`.
3. Duplicate IDs are ignored automatically.
4. Unique IDs are displayed.

## Java File
`src/TrainAppUC3.java`

## Sample Output
```text
=== Train Consist Management App ===
Use Case 3: Track Unique Bogie IDs
Final unique bogie IDs: [BG102, BG103, BG101]
Total unique bogie IDs: 3
```

Note: `HashSet` does not preserve insertion order, so printed ID order may vary.
