Implement CRUD using collections in Spring Boot for Online Transaction Management System
Type: Projects
Skill: Spring Framework
API Endpoint Design
CRUD Operations
Entity Creation
Spring Boot
Testing
Medium
Develop a basic system for managing transactions using Spring Boot, with transaction details stored in an ArrayList collection.



Tasks:



Entity: Create a single entity, Transaction, with the following fields:



id: A unique identifier for the transaction.
amount: The amount transferred in the transaction.
status: The status of the transaction (e.g., PENDING, COMPLETED, FAILED).


Storage: Use an ArrayList collection to store the transaction entities.



CRUD Operations: Implement two CRUD operations:



Create: An endpoint to add a new transaction into the ArrayList.
Retrieve: An endpoint to fetch a specific transaction from the ArrayList using its ID.


API Endpoints: Design the subsequent API endpoints:



POST /transactions: To add a new transaction.
GET /transactions/{id}: To fetch a specific transaction using its ID.


Test Cases:



Add a new transaction by sending a POST request to /transactions with the transaction details in the request body. The API should return the added transaction with a unique id.
Fetch a specific transaction by sending a GET request to /transactions/{id} using the unique transaction ID. The API should return the specific transaction details.


Testing & Submitting your code:



Step 1: Click on the WeCP Projects Button shown below.



Step 2: Click on Test & Submit app button to test your code. You will receive a congratulations message upon successful completion of the task.

Step 3: Click on Run App button to start the server.

Step 4: Click on show testing url button to get testing url for thunderclient.

