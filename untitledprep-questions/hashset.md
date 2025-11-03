Implementing Hashset in Java
Type: Programming
Skill: Java
Collections
Element Addition
HashSet Implementation
HashSet Operations
Set Difference
Medium
You have to implement the concept of the HashSet class in Java. The final task is to return the difference between two HashSets and the sum of the maximum and minimum elements of the resultant HashSet.



You’ve been provided with a starter code which contains sub-tasks as defined below:





Sub task 1: Create a HashSet of type Integer
Sub task 2: Add elements to that HashSet
Sub task 3: Create another HashSet of type Integer
Sub task 4: Add elements to the second HashSet
Sub task 5: Find the difference between the given HashSets.
Sub task 6: Display the difference between two HashSets and the sum of the maximum and minimum elements of the resultant HashSet.


Notes:



Do not remove the predefined code else your code may not execute as expected.
You have to solve the problem using the HashSet class ONLY. Solving through any alternate method other than the HashSet class may lead to disqualification.


Input Format



The first line of input contains a single integer N denoting the number of elements in both the HashSets.
The subsequent N lines denote the elements of the first HashSet.
The subsequent N lines denote the elements of the second HashSet.


Output Format



A HashSet denoting the difference between two HashSets and the sum of the maximum and minimum elements of the resultant HashSet in separate lines.



Sample Input 1

5
11
78
90
76
56
14
78
45
98
90


Sample Output 1

[56, 11, 76]
87


Sample Explanation 1



The first test case gives [56, 11, 76] as these elements are present only in the first hashset. The sum of the maximum and minimum element of the resultant hashset will be 76+11=87.



Sample Input 2

4
44
87
16
39
16
55
44
87


Sample Output 2

[39]
78


Sample Explanation 2



The second test case gives [39] as this element is present only in the first hashset. The sum of the maximum and minimum element of the resultant hashset will be 39+39=78.

