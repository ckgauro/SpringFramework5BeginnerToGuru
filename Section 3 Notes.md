## Section 3 Dependecy Injection with Spring  --Ongoing

Lect 31 --done

https://github.com/springframeworkguru/sfg-di/tree/add-spring-project

Create new Project


Core
 lombok
 modify .ignore
 
Preference project SDK incase

run the project
remove exclusion Junit to support Junit 4

-------------

Lect 32  --Done
https://github.com/springframeworkguru/sfg-di/tree/spring-context

guru.springframework.sfgdi.controllers
guru.springframework.sfgdi

Run the project

try renmaing controller Name in @Controller("tryit")

------

Lect 34  --Done
https://github.com/springframeworkguru/sfg-di/tree/manual-di

guru.springframework.sfgdi.services
guru.springframework.sfgdi.controllers

Create Test Case
guru.springframework.sfgdi.controllers


Run the test
guru.springframework.sfgdi.controllers
guru.springframework.sfgdi.controllers.setterInjected

[Revise video]

--------

Lect 35 --Done
https://github.com/springframeworkguru/sfg-di/tree/spring-di

guru.springframework.sfgdi

Now Run it
https://github.com/springframeworkguru/sfg-di/blob/spring-di/src/main/java/guru/springframework/sfgdi/controllers/PropertyInjectedController.java

Debug it
line 15 return

now add @Autworied
Run it
[Error]
*****
https://github.com/springframeworkguru/sfg-di/blob/spring-di/src/main/java/guru/springframework/sfgdi/services/GreetingServiceImpl.java

now run it
https://github.com/springframeworkguru/sfg-di/blob/spring-di/src/main/java/guru/springframework/sfgdi/controllers/SetterInjectedController.java
[Run it]

https://github.com/springframeworkguru/sfg-di/blob/spring-di/src/main/java/guru/springframework/sfgdi/controllers/ConstructorInjectedController.java

--------------

Lect 36  --Ongoing

https://github.com/springframeworkguru/sfg-di/tree/using-qualifiers

Refacting
https://github.com/springframeworkguru/sfg-di/blob/using-qualifiers/src/main/java/guru/springframework/sfgdi/services/ConstructorGreetingService.java

Rename Greeting service to ConstructorGreetingService

now run  it

---

https://github.com/springframeworkguru/sfg-di/blob/using-qualifiers/src/main/java/guru/springframework/sfgdi/services/PropertyInjectedGreetingService.java
https://github.com/springframeworkguru/sfg-di/blob/using-qualifiers/src/main/java/guru/springframework/sfgdi/services/SetterInjectedGreetingService.java
https://github.com/springframeworkguru/sfg-di/blob/using-qualifiers/src/main/java/guru/springframework/sfgdi/services/ConstructorGreetingService.java


https://github.com/springframeworkguru/sfg-di/blob/using-qualifiers/src/main/java/guru/springframework/sfgdi/controllers/ConstructorInjectedController.java
https://github.com/springframeworkguru/sfg-di/blob/using-qualifiers/src/main/java/guru/springframework/sfgdi/controllers/PropertyInjectedController.java
https://github.com/springframeworkguru/sfg-di/blob/using-qualifiers/src/main/java/guru/springframework/sfgdi/controllers/SetterInjectedController.java

Now run it

-------------

Lect 37

https://github.com/springframeworkguru/sfg-di/tree/primary-bean
https://github.com/springframeworkguru/sfg-di/blob/primary-bean/src/main/java/guru/springframework/sfgdi/services/PrimaryGreetingService.java
https://github.com/springframeworkguru/sfg-di/blob/primary-bean/src/main/java/guru/springframework/sfgdi/controllers/MyController.java

https://github.com/springframeworkguru/sfg-di/blob/primary-bean/src/main/java/guru/springframework/sfgdi/SfgDiApplication.java

[Now run it]


https://github.com/springframeworkguru/sfg-di/blob/using-qualifiers/src/main/java/guru/springframework/sfgdi/services/ConstructorGreetingService.java
remove quiler
and undo  again

----------------

Lect 38
https://github.com/springframeworkguru/sfg-di/tree/profiles

https://github.com/springframeworkguru/sfg-di/blob/profiles/src/main/resources/application.properties

https://github.com/springframeworkguru/sfg-di/blob/profiles/src/main/java/guru/springframework/sfgdi/controllers/I18nController.java
https://github.com/springframeworkguru/sfg-di/blob/profiles/src/main/java/guru/springframework/sfgdi/services/I18NSpanishService.java
https://github.com/springframeworkguru/sfg-di/blob/profiles/src/main/java/guru/springframework/sfgdi/services/I18nEnglishGreetingService.java
https://github.com/springframeworkguru/sfg-di/blob/profiles/src/main/java/guru/springframework/sfgdi/SfgDiApplication.java

[run it]
---------

Lect 39

https://github.com/springframeworkguru/sfg-di/tree/default-profile
https://github.com/springframeworkguru/sfg-di/blob/default-profile/src/main/java/guru/springframework/sfgdi/services/I18NSpanishService.java
Comment in properties
-----
assignement
https://www.udemy.com/course/spring-framework-5-beginner-to-guru/learn/practice/1162512/introduction#overview

Start --> https://github.com/springframeworkguru/sfg-di/tree/di-assignment
End --> https://github.com/springframeworkguru/sfg-di/tree/di-assignment-review


----------
Lect 40
Spring Bean Life Cycle
Bean Post Processors
'Aware' Interfaces

--------
Lect 41
https://github.com/springframeworkguru/sfg-di/tree/life-cycle-demo

Add missing class
https://github.com/springframeworkguru/sfg-di/tree/life-cycle-demo/src/main/java/guru/springframework/sfgdi/services
[Revise Videos]

LifeCycleDemoBean
CustomBeanPostPrecssor


-------------

Lect 47
https://github.com/springframeworkguru/sfg-pet-clinic

https://github.com/springframeworkguru/sfg-pet-clinic/tree/master/pet-clinic-data/src/main/java/guru/springframework/sfgpetclinic/model
[Revise according to video]





























