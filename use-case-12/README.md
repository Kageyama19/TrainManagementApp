# Use Case 12: Safety Compliance Check for Goods Bogies

This use case demonstrates goods-bogie safety validation using a functional rule with streams and `allMatch()`.

## Flow
1. User prepares a list of goods bogies.
2. System converts the list into a stream.
3. `allMatch()` checks every bogie against safety rules.
4. Cylindrical bogies are validated to carry only petroleum.
5. The result is displayed as safe or unsafe.

## Key Concepts Used
- Streams API for declarative validation.
- `allMatch()` for whole-collection safety checks.
- `Predicate<GoodsBogie>` as a functional interface.
- Lambda expressions for readable business rules.
- Short-circuit validation when a rule fails.

## Java Files
`src/GoodsBogie.java`

`src/TrainAppUC12.java`

## Sample Output
```text
=== Train Consist Management App ===
Use Case 12: Safety Compliance Check for Goods Bogies
Goods bogies prepared for safety check:
GoodsBogie{bogieId='GB501', bogieType='Cylindrical', cargoType='Petroleum'}
GoodsBogie{bogieId='GB502', bogieType='Open', cargoType='Coal'}
GoodsBogie{bogieId='GB503', bogieType='Box', cargoType='Grain'}
GoodsBogie{bogieId='GB504', bogieType='Cylindrical', cargoType='Petroleum'}
Train safety compliant: true
```
