# Spring 12 Validation and Constraints with Spring MVC --Ongoing
---------
226  --Done
```
https://github.com/springframeworkguru/spring5-recipe-app/blob/response-status/src/main/java/guru/springframework/exceptions/NotFoundException.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/response-status/src/main/java/guru/springframework/services/RecipeServiceImpl.java
    throw new NotFoundException("Recipe Not Found");

https://github.com/springframeworkguru/spring5-recipe-app/blob/response-status/src/test/java/guru/springframework/services/RecipeServiceImplTest.java
    @Test(expected = NotFoundException.class)
https://github.com/springframeworkguru/spring5-recipe-app/blob/response-status/src/test/java/guru/springframework/controllers/RecipeControllerTest.java
    testGetRecipeNotFound()
[Run it]
 [Test Run]
 localhost/recipe/4/show
 [developer tools/network]
    
```
---------
227 --Done
```
https://github.com/springframeworkguru/spring5-recipe-app/blob/exception-handler/src/main/java/guru/springframework/controllers/RecipeController.java
    ModelAndView handleNotFound(){
    
https://github.com/springframeworkguru/spring5-recipe-app/blob/exception-handler/src/main/resources/templates/404error.html

https://github.com/springframeworkguru/spring5-recipe-app/blob/exception-handler/src/test/java/guru/springframework/controllers/RecipeControllerTest.java
    404error
{revise video for exception last part}

[Run it]
 [Test Run]
 localhost/recipe/4/show
 [developer tools/network]
   
```
---------
228  ---Done
```   
https://github.com/springframeworkguru/spring5-recipe-app/blob/display-error-data/src/main/java/guru/springframework/services/RecipeServiceImpl.java
     throw new NotFoundException("Recipe Not Found. For ID value: " + l.toString() );
https://github.com/springframeworkguru/spring5-recipe-app/blob/display-error-data/src/main/java/guru/springframework/controllers/RecipeController.java
     public ModelAndView handleNotFound(Exception exception)
https://github.com/springframeworkguru/spring5-recipe-app/blob/display-error-data/src/main/resources/templates/404error.html
    
[Run it]
 [Test Run]
 localhost/recipe/4/show    
 
 ```
---------
230  --Done
```   
https://github.com/springframeworkguru/spring5-recipe-app/blob/assign-number-format-exception/src/main/java/guru/springframework/controllers/RecipeController.java

https://github.com/springframeworkguru/spring5-recipe-app/blob/assign-number-format-exception/src/main/resources/templates/400error.html


https://github.com/springframeworkguru/spring5-recipe-app/blob/assign-number-format-exception/src/test/java/guru/springframework/controllers/RecipeControllerTest.java

[Run it]
 [Test Run]
 localhost/recipe/asd/show
 
  ```
---------
231  --Done
```   
Refactor 
https://github.com/springframeworkguru/spring5-recipe-app/blob/controller-advice/src/main/java/guru/springframework/controllers/RecipeController.java
    delete last method
https://github.com/springframeworkguru/spring5-recipe-app/blob/controller-advice/src/main/java/guru/springframework/controllers/ControllerExceptionHandler.java

https://github.com/springframeworkguru/spring5-recipe-app/blob/controller-advice/src/test/java/guru/springframework/controllers/ImageControllerTest.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/controller-advice/src/test/java/guru/springframework/controllers/RecipeControllerTest.java

[Run it]
 [Test Run]
 localhost/recipe/asd/show
 
  
  ```
---------
233  --Done
```   
https://github.com/springframeworkguru/spring5-recipe-app/blob/data-validation-with-springmvc/src/main/java/guru/springframework/commands/RecipeCommand.java
https://github.com/springframeworkguru/spring5-recipe-app/blob/data-validation-with-springmvc/src/main/java/guru/springframework/controllers/RecipeController.java
    savedOrUpdate @Valid
    24
    
https://github.com/springframeworkguru/spring5-recipe-app/blob/data-validation-with-springmvc/src/test/java/guru/springframework/controllers/RecipeControllerTest.java
    testPostReci..
    
  ```
---------
234 ---Done
```
https://github.com/springframeworkguru/spring5-recipe-app/blob/displaying-validation-error-msgs/src/main/resources/templates/recipe/recipeform.html
    25 38 42 44 other..
    err
[Run it]
 [Test Run]
 localhost/recipe/1/update
 
```
---------
235  --Done
```
https://github.com/springframeworkguru/spring5-recipe-app/blob/message-source/src/main/resources/messages.properties

https://github.com/springframeworkguru/spring5-recipe-app/blob/message-source/src/main/java/guru/springframework/controllers/RecipeController.java
    VALIDATION
    {revise video}
    
[Run it]
 [Test Run]
 localhost/recipe/1/update
  
```
---------
237
```
https://github.com/springframeworkguru/spring5-recipe-app/tree/spring-mvc-i18n/src/main/resources
    add missing properties
https://github.com/springframeworkguru/spring5-recipe-app/blob/spring-mvc-i18n/src/main/resources/templates/recipe/recipeform.html
    40 

{devloper tools / network/ headersaccept-language} 
    