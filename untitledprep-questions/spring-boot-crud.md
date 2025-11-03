Implement CRUD using collections in Spring Boot for Real Estate Property Management System
Type: Projects
Skill: Spring Framework
API Development
CRUD Operations
Collections
Entity Creation
Spring Boot
Medium
Create a basic system for property management using Spring Boot, with property details stored in an ArrayList collection.



Tasks:



Entity: Create a single entity, Property, with the following fields:



id: A unique identifier for the property.
address: The address of the property.
description: A description of the property.


Storage: Use an ArrayList collection to store the property entities.



CRUD Operations: Implement two CRUD operations:



Create: An endpoint to add a new property listing into the ArrayList.
Retrieve: An endpoint to fetch a list of all property listings from the ArrayList.


API Endpoints: Develop the subsequent API endpoints:



POST /properties: To add a new property listing.
GET /properties: To fetch a list of all property listings.


﻿Test Cases:



Add a new property listing by sending a POST request to /properties with the property details in the request body. The API should return the added property with a unique id.
Fetch a list of all property listings by sending a GET request to /properties. The API should return a list of all property listings.


Testing & Submitting your code:



Step 1: Click on the WeCP Projects Button.



Step 2: Click on Test & Submit app button to test your code. You will receive a congratulations message upon successful completion of the task.

Step 3: Click on Run App button to start the server.

Step 4: Click on show testing url button to get testing url for thunderclient.

