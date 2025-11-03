You are developing a Spring Boot application for "FarmRetailConnect", a food distribution company that links farmers with retailers.



The company wants an efficient way to track the distinct food items sourced from farmers and the retailers they are delivered to.

Each food item is procured from one farmer and given to one retailer.





The application must fulfill the following requirements:




Entities


    a. FoodItem Entity:

            Attributes: itemId, itemName, type, and retailer (type Retailer).

            Relationship: ManyToOne with Retailer.



    b. Retailer Entity:

                Attributes: retailerId, retailerName, storeLocation, and foodItems (List of FoodItem).

                Relationship: OneToMany with FoodItem.





Repositories


            1. FoodItemRepository: Should extend JpaRepository.

            2. RetailerRepository: Should extend JpaRepository.





Services


    1. FoodItemService: Offers methods to:

        a. addFoodItem(FoodItem foodItem): Adds a food item to the database.

        b. getFoodItemById(Long itemId): Retrieves a food item by its ID.

        c. getAllFoodItems(): Returns a list of all food items.



    2. RetailerService: Provides methods to:

        a. addRetailer(Retailer retailer): Adds a retailer to the database.

        b. getRetailerById(Long retailerId): Retrieves a retailer by its ID.

        c. getAllRetailers(): Returns a list of all retailers.




Controllers

1. FoodItemController: Manages HTTP requests related to FoodItem:



    a. POST /food-items: Calls FoodItemService.addFoodItem(FoodItem foodItem) to add a new food item. Details are provided in the request body.

    b. GET /food-items/{itemId}: Calls FoodItemService.getFoodItemById(Long itemId) to fetch a food item by its ID.

    c. GET /food-items: Calls FoodItemService.getAllFoodItems() to retrieve a list of all food items.



2. RetailerController: Manages HTTP requests for the Retailer entity:



    a. POST /retailers: Calls RetailerService.addRetailer(Retailer retailer) to add a new retailer. Details are provided in the request body.

    b. GET /retailers/{retailerId}: Calls RetailerService.getRetailerById(Long retailerId) to get a retailer by its ID.

    c. GET /retailers: Calls RetailerService.getAllRetailers() to retrieve all retailers.



To complete this task, you need to implement Entities and the CRUD methods in the Services classes and the HTTP endpoints in the Controller classes.



Note: Make sure to handle the relationship between entities.