# Exception handling in calculator using Java

- Type: Programming  
- Skill: Java  
- Topics: Arithmetic Operations, Exception Handling, Switch Cases, Java Programming  
- Difficulty: Medium

## Problem statement

Implement a simple calculator in Java that performs a binary arithmetic operation (two operands and one operator) provided as a space-separated expression. The goal is to demonstrate correct Exception Handling — throw and catch the appropriate exceptions and print the exact messages required.

You are provided with starter code. Do not remove or alter predefined scaffolding unless instructed; otherwise your solution may not execute as expected.

## Requirements / Tasks

Follow these tasks exactly and use Java Exception Handling mechanisms (throw, try-catch-finally) to meet the behavior requirements.

1. Task 1  
   - If the input consists of more than three characters (as per the starter code's interpretation of input length), throw an `IllegalArgumentException` with the message:
     - "Invalid operation"

2. Task 2  
   - Use a `switch` statement to perform the calculator operations for supported operators.
   - For unsupported operations, throw an `IllegalArgumentException` with the message:
     - "Invalid operation"

3. Task 3  
   - For division-by-zero attempts, throw an `ArithmeticException` with the message:
     - "Division by zero is not allowed"

4. Task 4 (handled in exceptions printing)  
   - When an `ArithmeticException` is caught, print:
     - `ArithmeticException: Division by zero is not allowed.`

5. Task 5 (handled in exceptions printing)  
   - When an `IllegalArgumentException` is caught for invalid operations, print:
     - `IllegalArgumentException: Invalid operation.`

6. Task 6  
   - Use a `finally` block to close the `Scanner` object (or other resources as provided in the starter code) to ensure resources are released.

## Input Format

A single string expression in space-separated format:

- Examples:
  - `10 / 2`
  - `5 * 3`
  - `8 - 4`

(Starter code may parse the input into tokens — follow the expected parsing in the provided template.)

## Output Format

- If the operation is valid and no exceptions occur, print the numeric result (as produced by the starter code).
- If an `ArithmeticException` occurs due to division by zero, print:
  - `ArithmeticException: Division by zero is not allowed.`
- If an `IllegalArgumentException` occurs because of an invalid operation or invalid input format/length, print:
  - `IllegalArgumentException: Invalid operation.`

Ensure the printed messages match exactly (including punctuation and capitalization).

## Notes and Constraints

- Solve this problem using Exception Handling ONLY. Alternative approaches may lead to disqualification.
- Do not modify the predefined starter scaffolding unless explicitly allowed in the instructions.
- Make sure to throw the exact exception types and messages specified above.
- Use `finally` to close the `Scanner`.

## Examples

Example 1
- Input:
  - `10 / 2`
- Output:
  - `5`

Example 2 (division by zero)
- Input:
  - `10 / 0`
- Output:
  - `ArithmeticException: Division by zero is not allowed.`

Example 3 (invalid operator)
- Input:
  - `5 ^ 3`
- Output:
  - `IllegalArgumentException: Invalid operation.`

## Hints

- Parse input carefully (split on spaces) and validate token count/length according to the starter code rules before performing operations.
- Use try-catch-finally: catch `ArithmeticException` first (if needed), then `IllegalArgumentException`, and always close resources in `finally`.
