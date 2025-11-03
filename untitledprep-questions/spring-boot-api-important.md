Create a simple RESTful API using Spring Boot
Type: Projects
Skill: Spring Framework
Authentication
CRUD Operations
RESTful API
Spring Boot
Spring Security
Medium
You are required to create a simple RESTful API using Spring Boot, which will be secured using Spring Security. The API will manage a list of books, allowing CRUD operations. However, these operations should be secured so that only authenticated users can perform them.



Tasks:





Model Creation:
Create a Book entity with attributes: id (primary key), title, and author.





Repository Layer:
Implement a repository interface for the Book entity using Spring Data JPA.





Service Layer:
Create a service class that implements business logic for handling CRUD operations on books.
This service class will use the repository to interact with the database.




Controller Layer:
Develop a REST controller to expose CRUD operations as HTTP endpoints.





API Endpoints: Create the following API endpoints
GET /books: To get all books.
GET /books/{id}: To get book by its id.
POST /books: To create a new book.
PUT /books/{id}: To update the details of an existing book.
DELETE /books/{id}: To delete a book by its id.




Security Configuration:
Configure Spring Security to secure your API endpoints. Use HTTP Basic Authentication for simplicity.
Define two roles: USER and ADMIN. USER can only read books, whereas ADMIN can perform all CRUD operations.
Configure an in-memory authentication with at least one user for each role.


Your task is to complete the following files:



1. ./src/main/java/com/wecp/booksmanagementsystem/config/SecurityConfig.java

2. ./src/main/java/com/wecp/booksmanagementsystem/controller/BookController.java

3. ./src/main/java/com/wecp/booksmanagementsystem/entity/Book.java

4. ./src/main/java/com/wecp/booksmanagementsystem/repository/BookRepository.java

5. ./src/main/java/com/wecp/booksmanagementsystem/service/BookService.java



Test Cases:



Authenticated requests with the USER role can only access read operations.
Authenticated requests with the ADMIN role can perform all operations.


Testing and submitting the code:



Step 1: Click on the WeCP Projects button.



Step 2: Click on the Run app button to run the application.

Step 3: You can test your code by clicking on Test and Submit button. You will get a congratulations message upon successful completion of the task.

Step 4: Click on Show testing url button to get the url to perform testing using thunderclient.

