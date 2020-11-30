# Spring 25  Using Swagger with Spring Boot  ---Ongoing
---------
397 --Ongoing
```
New Project
https://github.com/springframeworkguru/spring5-mvc-rest/tree/vendor-api


https://github.com/springframeworkguru/spring5-mvc-rest/tree/swagger-config
    add io.spring and io.springfox dependency in POM
[Revise video to extract]    
https://github.com/springframeworkguru/spring5-mvc-rest/blob/swagger-config/src/main/java/guru/springfamework/config/SwaggerConfig.java

[run it]

localhost:8080/v2/api-docs
localhost:8080/swapper-ui.html

```
---------
398

```
[run it]
localhost:8080/swagger-ui.html

try crul command in terminal

https://github.com/springframeworkguru/spring5-mvc-rest/tree/swagger-ui

https://github.com/springframeworkguru/spring5-mvc-rest/blob/swagger-ui/src/main/java/guru/springfamework/config/SwaggerConfig.java
    uncomment addResourceHandlers procedure [No need to write]

```
---------
399

```
https://github.com/springframeworkguru/spring5-mvc-rest/tree/swagger-meta-data
https://github.com/springframeworkguru/spring5-mvc-rest/blob/swagger-meta-data/src/main/java/guru/springfamework/config/SwaggerConfig.java
    api()
    metadata()

[run it]

localhost:8080/swapper-ui.html

```
---------
400

```
https://github.com/springframeworkguru/spring5-mvc-rest/tree/swagger-endpoint-custom
https://github.com/springframeworkguru/spring5-mvc-rest/blob/swagger-endpoint-custom/src/main/java/guru/springfamework/controllers/v1/CustomerController.java
    line 14 @Api(description = "This is my Customer Controller")
    @ApiOperation(value = "This will get a list of customers.", notes = "These are some notes about the API.")
    
localhost:8080/swapper-ui.html    

https://github.com/springframeworkguru/spring5-mvc-rest/blob/swagger-endpoint-custom/src/main/java/guru/springfamework/api/v1/model/CustomerDTO.java
    @ApiModelProperty(value = "This is the first name", required = true)
    @ApiModelProperty(required = true )
```
---------
402

```
https://github.com/springframeworkguru/spring5-mvc-rest/blob/swagger-ep-assn-review/src/main/java/guru/springfamework/controllers/v1/VendorController.java
     @ApiOperation
     
https://github.com/springframeworkguru/spring5-mvc-rest/blob/swagger-ep-assn-review/src/main/java/guru/springfamework/api/v1/model/VendorDTO.java

[run it]
localhost:8080/swapper-ui.html

```
---------
403,404

```
Swagger Editor

[Revise video]
