# Spring 11 CRUD Operations with Spring MVC  ---Done 
---------
192  --Error
```
spring5-recipe-app
webjars.org

Update 
https://github.com/springframeworkguru/spring5-recipe-app/blob/webjars-with-spring-boot/pom.xml
https://github.com/springframeworkguru/spring5-recipe-app/blob/webjars-with-spring-boot/src/main/resources/templates/index.html
    add bootstrap
    {revise video}
[Run it]
Issue with 
    <script src="/webjars/jquery/1.11.1/jquery.min.js"></script>
    
```
---------
193 --Done
```
https://github.com/springframeworkguru/spring5-recipe-app/blob/display-a-recipe/src/main/java/guru/springframework/services/RecipeServiceImpl.java

https://github.com/springframeworkguru/spring5-recipe-app/blob/display-a-recipe/src/main/java/guru/springframework/controllers/RecipeController.java

https://github.com/springframeworkguru/spring5-recipe-app/blob/display-a-recipe/src/main/resources/templates/index.html
https://github.com/springframeworkguru/spring5-recipe-app/blob/display-a-recipe/src/main/resources/templates/recipe/show.html
https://github.com/springframeworkguru/spring5-recipe-app/blob/display-a-recipe/src/test/java/guru/springframework/controllers/RecipeControllerTest.java
[Run it]
[Test Run]

```
---------
195 --Done
```

https://github.com/springframeworkguru/spring5-recipe-app/blob/assignment-review-display-all-of-recipe/src/main/resources/templates/recipe/show.html
https://github.com/springframeworkguru/spring5-recipe-app/blob/assignment-review-display-all-of-recipe/src/main/java/guru/springframework/bootstrap/RecipeBootstrap.java
    setUrl
    setServing
[Run it]
 [Test Run]
 
```
---------
197 --Done
```

https://github.com/springframeworkguru/spring5-recipe-app/tree/create-new-recipe/src/main/java/guru/springframework/commands
https://github.com/springframeworkguru/spring5-recipe-app/tree/create-new-recipe/src/main/java/guru/springframework/converters
https://github.com/springframeworkguru/spring5-recipe-app/tree/create-new-recipe/src/test/java/guru/springframework/controllers
https://github.com/springframeworkguru/spring5-recipe-app/blob/create-new-recipe/src/main/java/guru/springframework/services/RecipeService.java
https://github.com/springframeworkguru/spring5-recipe-app/tree/create-new-recipe/src/test/java/guru/springframework/services
https://github.com/springframeworkguru/spring5-recipe-app/tree/create-new-recipe/src/test/java/guru/springframework/repositories

https://github.com/springframeworkguru/spring5-recipe-app/blob/create-new-recipe/src/test/java/guru/springframework/services/RecipeServiceIT.java
https://github.com/springframeworkguru/spring5-recipe-app/tree/create-new-recipe/src/test/java/guru/springframework/converters

[Revise video 15 30 Files are changed]
```
---------
198  --Done
```

https://github.com/springframeworkguru/spring5-recipe-app/blob/create-new-recipe/src/main/resources/templates/index.html
https://github.com/springframeworkguru/spring5-recipe-app/blob/create-new-recipe/src/main/resources/templates/recipe/recipeform.html
https://github.com/springframeworkguru/spring5-recipe-app/blob/create-new-recipe/src/main/java/guru/springframework/controllers/RecipeController.java
[Run it]
localhost/recipe/new
```
---------
199  --Done
```
https://github.com/springframeworkguru/spring5-recipe-app/blob/update-recipe/src/main/java/guru/springframework/controllers/RecipeController.java
    line 24 updateRecipe
https://github.com/springframeworkguru/spring5-recipe-app/blob/update-recipe/src/main/resources/templates/index.html
    line 20 21 53
https://github.com/springframeworkguru/spring5-recipe-app/blob/update-recipe/src/test/java/guru/springframework/controllers/RecipeControllerTest.java
    uncomment 74 75
[Run it]
 [Test Run]
 
 localhost:8080/recipe/1/update
 ```
---------
200  --Done
```
 
 https://github.com/springframeworkguru/spring5-recipe-app/blob/delete-recipe/src/main/resources/application.properties
 https://github.com/springframeworkguru/spring5-recipe-app/blob/delete-recipe/src/test/java/guru/springframework/controllers/RecipeControllerTest.java
    line 95
https://github.com/springframeworkguru/spring5-recipe-app/blob/delete-recipe/src/test/java/guru/springframework/controllers/RecipeControllerTest.java
  88  97

 
https://github.com/springframeworkguru/spring5-recipe-app/blob/delete-recipe/src/main/java/guru/springframework/controllers/RecipeController.java
    Refactor revise code
    72
https://github.com/springframeworkguru/spring5-recipe-app/blob/delete-recipe/src/main/java/guru/springframework/services/RecipeServiceImpl.java
    71
https://github.com/springframeworkguru/spring5-recipe-app/blob/delete-recipe/src/main/java/guru/springframework/services/RecipeService.java
[Run it]
 [Test Run]
localhost: click on delete
 ```
---------
201 --Done
```
https://github.com/springframeworkguru/spring5-recipe-app/blob/view-ingredients/src/test/java/guru/springframework/controllers/IngredientControllerTest.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/view-ingredients/src/main/resources/templates/recipe/ingredient/list.html
https://github.com/springframeworkguru/spring5-recipe-app/blob/view-ingredients/src/main/java/guru/springframework/controllers/IngredientController.java


[Run it]
 [Test Run]
localhost: view
 ```
---------
202  --Done
```
https://github.com/springframeworkguru/spring5-recipe-app/blob/show-ingredient/src/main/java/guru/springframework/converters/IngredientToIngredientCommand.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/show-ingredient/src/main/java/guru/springframework/services/IngredientService.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/show-ingredient/src/main/java/guru/springframework/services/IngredientServiceImpl.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/show-ingredient/src/main/java/guru/springframework/commands/IngredientCommand.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/show-ingredient/src/main/java/guru/springframework/controllers/IngredientController.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/show-ingredient/src/test/java/guru/springframework/controllers/IngredientControllerTest.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/show-ingredient/src/test/java/guru/springframework/services/IngredientServiceImplTest.java


[Run it]
 [Test Run]
localhost: recipe/1/ingredient/8/show 

 ```
---------
203  --Done
```
https://github.com/springframeworkguru/spring5-recipe-app/blob/add-new-ingredient/src/main/java/guru/springframework/services/IngredientService.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/add-new-ingredient/src/main/java/guru/springframework/services/IngredientServiceImpl.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/update-existing-ingredient/src/main/java/guru/springframework/controllers/IngredientController.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/update-existing-ingredient/src/main/java/guru/springframework/services/IngredientServiceImpl.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/update-existing-ingredient/src/main/java/guru/springframework/services/UnitOfMeasureService.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/update-existing-ingredient/src/main/java/guru/springframework/services/UnitOfMeasureServiceImpl.java

https://github.com/springframeworkguru/spring5-recipe-app/blob/update-existing-ingredient/src/main/resources/templates/recipe/ingredient/ingredientform.html
https://github.com/springframeworkguru/spring5-recipe-app/blob/update-existing-ingredient/src/main/resources/templates/recipe/ingredient/show.html
https://github.com/springframeworkguru/spring5-recipe-app/blob/update-existing-ingredient/src/main/resources/templates/recipe/ingredient/list.html

https://github.com/springframeworkguru/spring5-recipe-app/blob/update-existing-ingredient/src/test/java/guru/springframework/services/IngredientServiceImplTest.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/update-existing-ingredient/src/main/java/guru/springframework/controllers/IngredientController.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/update-existing-ingredient/src/test/java/guru/springframework/services/UnitOfMeasureServiceImplTest.java



[Run it]
 [Test Run]
localhost: recipe/1/ingredient/8/update

 ```
---------
204 --Done
```
https://github.com/springframeworkguru/spring5-recipe-app/blob/add-new-ingredient/src/main/java/guru/springframework/controllers/IngredientController.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/add-new-ingredient/src/main/java/guru/springframework/domain/Ingredient.java


https://github.com/springframeworkguru/spring5-recipe-app/blob/add-new-ingredient/src/test/java/guru/springframework/controllers/IndexControllerTest.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/add-new-ingredient/src/test/java/guru/springframework/services/IngredientServiceImplTest.java


[Run it]
 [Test Run]
localhost: recipe/1/ingredient/8/update
add new ingredients
 ```
---------
206  --Done
```
https://github.com/springframeworkguru/spring5-recipe-app/blob/delete-ingredient/src/main/java/guru/springframework/controllers/IngredientController.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/delete-ingredient/src/main/resources/templates/recipe/ingredient/ingredientform.html

https://github.com/springframeworkguru/spring5-recipe-app/blob/delete-ingredient/src/main/resources/templates/recipe/ingredient/list.html

https://github.com/springframeworkguru/spring5-recipe-app/blob/delete-ingredient/src/test/java/guru/springframework/controllers/IngredientControllerTest.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/delete-ingredient/src/test/java/guru/springframework/services/IngredientServiceImplTest.java


[Run it]
 [Test Run]
localhost: recipe/1/ingredient/8/delete

 ```
---------
207  --Done
```
https://github.com/springframeworkguru/spring5-recipe-app/blob/display-enum-list/src/main/java/guru/springframework/controllers/RecipeController.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/display-enum-list/src/main/java/guru/springframework/controllers/IngredientController.java

https://github.com/springframeworkguru/spring5-recipe-app/blob/display-enum-list/src/main/resources/templates/recipe/recipeform.html
    Difficulty
    method="post"


[Run it]
 [Test Run]
localhost: recipe/1/ingredient/8/update
add new ingredients
 ```
---------

208
```
[Revise video]

 ```
---------

209 --DOne
```
https://github.com/springframeworkguru/spring5-recipe-app/tree/upload-images/src/main/resources/static/images
https://github.com/springframeworkguru/spring5-recipe-app/blob/upload-images/src/main/java/guru/springframework/controllers/ImageController.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/upload-images/src/test/java/guru/springframework/controllers/ImageControllerTest.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/upload-images/src/main/java/guru/springframework/services/ImageService.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/upload-images/src/main/java/guru/springframework/services/ImageServiceImpl.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/upload-images/src/main/resources/templates/recipe/imageuploadform.html
https://github.com/springframeworkguru/spring5-recipe-app/blob/upload-images/src/main/resources/templates/recipe/show.html
 ```
---------

210 --Done
```
https://github.com/springframeworkguru/spring5-recipe-app/blob/save-image-to-db/src/main/java/guru/springframework/services/ImageServiceImpl.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/save-image-to-db/src/main/java/guru/springframework/domain/Recipe.java

https://github.com/springframeworkguru/spring5-recipe-app/blob/save-image-to-db/src/test/java/guru/springframework/services/ImageServiceImplTest.java



[Run it]
 [Test Run]
 check image
 check in database
 ```
---------

211  --Done
```
https://github.com/springframeworkguru/spring5-recipe-app/blob/display-image-from-db/src/main/java/guru/springframework/controllers/ImageController.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/display-image-from-db/src/main/java/guru/springframework/converters/RecipeToRecipeCommand.java
    45
https://github.com/springframeworkguru/spring5-recipe-app/blob/display-image-from-db/src/main/java/guru/springframework/converters/RecipeToRecipeCommand.java

https://github.com/springframeworkguru/spring5-recipe-app/blob/display-image-from-db/src/test/java/guru/springframework/controllers/ImageControllerTest.java

[Run it]
 [Test Run]
 check image
 check in database
 

