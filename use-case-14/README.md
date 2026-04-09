# Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)

This use case demonstrates fail-fast validation of passenger bogie capacity using a custom checked exception.

## Flow
1. User attempts to create a passenger bogie.
2. System validates the capacity value.
3. If capacity is less than or equal to zero, a custom exception is thrown.
4. Valid bogies are created successfully.
5. Program continues safely after handling errors.

## Key Concepts Used
- Custom exception for domain-specific validation failures.
- Exception inheritance by extending `Exception`.
- `throw` to raise a business-rule violation.
- `throws` in the constructor signature.
- Fail-fast validation during object creation.

## Java Files
`src/InvalidCapacityException.java`

`src/PassengerBogieUC14.java`

`src/TrainAppUC14.java`

## Sample Output
```text
=== Train Consist Management App ===
Use Case 14: Handle Invalid Bogie Capacity
Passenger bogie created successfully: PassengerBogieUC14{bogieType='Sleeper', capacity=72}
Failed to create passenger bogie: Capacity must be greater than zero
Program continues safely after validation.
```
