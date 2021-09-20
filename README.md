# JavaFoundation
All about Java &amp; Kotlin

Запуск проекта через docker-compose:
```shell script
$ docker-compose build && docker-compose up 
```
Сервис займёт следующие порты:
+ ***4859***
+ ***6389***  
+ ***8080*** 
+ ***8091***
+ ***8443***
+ ***8454***

Чтобы назначить другие потры, необходимо скорректировать параметры ***ports*** в файле ***docker-compose.yml*** 

Чтобы перезапустить сервис:
```shell script
$ docker-compose up --build --force-recreate 
```

Сервисы:

+ *maven-easy* - простейсшее приложение на maven
+ *maven-servlet* - использование технологий Java EE и Thymeleaf, деплой на Tomcat
+ *glassfish-easy* - деплой простейшего приложения Java EE на сервер GlassFish4
+ *gradle-boot* - исследование фреймворка Spring Boot

Быстрая проверка работоспособности приложений:
```http request
https://localhost:8443/maven-servlet-1.0-SNAPSHOT/ui/home
```
```http request
http://localhost:8091/glassfish-easy-1.0-SNAPSHOT
```
```http request
http://localhost:8092/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/
```
```http request
http://localhost:9080/
```
