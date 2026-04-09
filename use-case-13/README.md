# Use Case 13: Performance Comparison (Loops vs Streams)

This use case demonstrates timing comparison between loop-based filtering and stream-based filtering using `System.nanoTime()`.

## Flow
1. User prepares a collection of bogies.
2. System records start time with `System.nanoTime()`.
3. Filtering is performed using loops and streams.
4. System records end time.
5. Elapsed execution time is displayed.

## Key Concepts Used
- `System.nanoTime()` for high-resolution benchmarking.
- Loop-based processing with traditional iteration.
- Stream-based processing with `filter()` and `collect()`.
- Performance benchmarking based on measured execution time.
- Evidence-driven comparison between two implementation styles.

## Java Files
`src/TrainAppUC13.java`

## Sample Output
```text
=== Train Consist Management App ===
Use Case 13: Performance Comparison (Loops vs Streams)
Loop-based filtered bogies count: 5800
Stream-based filtered bogies count: 5800
Loop-based execution time (ns): 1234567
Stream-based execution time (ns): 2345678
Both approaches returned same result size: true
```
