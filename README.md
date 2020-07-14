# JavaFoundation
All about Java &amp; Kotlin

Запуск проекта через docker-compose:
```shell script
$ docker-compose build && docker-compose up 
```
Сервис займёт следующие порты:
+ ***8080*** 
+ ***8443***

Чтобы перезапустить сервис:
```shell script
$ docker-compose up --build --force-recreate 
```
