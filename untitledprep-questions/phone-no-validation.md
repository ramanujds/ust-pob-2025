Check the valid phone number
Type: Programming
Skill: Java
Conditional Statements
Error Handling
Exception Handling
Input Validation
String Manipulation
Medium
You have to implement the concept of Exception Handling in Java. The final task is to check if a given number is a valid mobile phone number.



A number is a valid mobile phone number if it meets the following criteria:



It should contain exactly 10 digits.
Each digit should be in the range of '0' to '9'.
It should not contain any alphabetic characters.
It should not contain any special characters (e.g., '-', '+', '(', ')', etc.).


You’ve been provided with a starter code which contains sub-tasks as defined below:

Task1: Throw IllegalArgumentException with message "You have entered less than 10 digits." if the input matches this scenario.

Task 2: Throw IllegalArgumentException with message "You have entered more than 10 digits." if the input matches this scenario.

Task 3: Throw IllegalArgumentException with message "You have entered a character instead of a digit." if the input matches this scenario.

Task 4: Print "Valid mobile phone number: " if the input is valid



Notes:



Do not remove the predefined code else your code may not execute as expected.
You’ve to solve the problem using the Exception Handling ONLY. Solving through any alternate method other than the Exception Handling may lead to disqualification.


Input Format

A number denoting the mobile phone number that needs to be validated.



Output Format

The output displays the result obtained after checking the validity of the given number based on the criteria described above.

Sample Testcases
Input	Output	Output Description
12345
IllegalArgumentException: You have entered less than 10 digits.
A valid phone number must be exactly 10 digits. Since 12345 is less than 10 digits, an exception is thrown.
1234567
IllegalArgumentException: You have entered less than 10 digits.
A valid phone number must be exactly 10 digits. Since 1234567 is less than 10 digits, an exception is thrown.
wer2345693
IllegalArgumentException: You have entered a character instead of a digit.
A valid phone number should not contain any alphabetic characters. Hence, wer2345693 is invalid and an exception is thrown.
