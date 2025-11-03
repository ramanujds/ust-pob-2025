Java Stream & String Manipulation
Type: Programming
Skill: Java
Functional Programming
Lambda Expressions
Sting Manipulation
Stream API
StringJoiner class usage
Medium
You have to implement the concept of the Stream in Java. The final task is to return a StringJoiner produced after joining the elements of the string list.



You’ve been provided with a starter code which contains sub-tasks as defined below:

Sub task 1: Create a list of string type

Sub task 2: Add elements to the list

Sub task 3: Create a StringJoiner using hyphen as delimiter

Sub task 4: Filter the strings whose length is divisible by either 3 or 4 using stream concept and collect the data as list of string type

Sub task 5: Add the content of the created string list in StringJoiner

Sub task 6: Display the final StringJoiner produced after joining the elements of the string list



Note:

1. Do not remove the predefined code else your code may not execute as expected.

2. You’ve to solve the problem using the Stream ONLY. Solving through any alternate method other than the Stream may lead to disqualification.



Input Format

The first line of input contains a single integer N denoting the number of elements in the list.

The subsequent N lines contains a string denoting the list elements.



Output Format

Output a StringJoiner formed by the strings whose length is divisible by either 3 or 4.



Sample Input 1

5
Ram
Shyama
Radha
Chocolate
Pasta


Sample Output 1

Ram-Shyama-Chocolate


Sample Explanation 1

The first test case contains three strings whose length is divisible either by 3 or 4. The output displays the StringJoiner produced by joining three strings using hyphen.



Sample Input 2

6
Pen
Lake
Cake
PanCake
Mango
Banana


Sample Output 2

Pen-Lake-Cake-Banana


Sample Explanation 2

The second test case contains four strings whose length is divisible either by 3 or 4. The output displays the StringJoiner produced by joining four strings using hyphen.

