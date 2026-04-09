# Use Case 11: Validate Train ID & Cargo Codes (Regex)

This use case demonstrates validation of Train ID and Cargo Code formats using regular expressions with `Pattern` and `Matcher`.

## Flow
1. The user enters the Train ID and Cargo Code.
2. The system compiles regex patterns.
3. `Matcher` checks the inputs against the patterns.
4. Valid inputs are accepted.
5. Invalid inputs are rejected with a validation message.

## Key Concepts Used
- Regular expressions to define valid text formats.
- `Pattern` to compile reusable regex rules.
- `Matcher` to apply patterns to input values.
- `matches()` to validate the entire input.
- Format enforcement for reliable downstream processing.

## Java Files
`src/TrainAppUC11.java`

## Sample Output
```text
=== Train Consist Management App ===
Use Case 11: Validate Train ID & Cargo Codes
Train ID TRN-1234 is valid
Train ID TRAIN12 is invalid
Cargo Code PET-AB is valid
Cargo Code PET-ab is invalid
```
