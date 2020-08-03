Домашняя страница приложения:
```http request
http://localhost:8080/home
```
Документация сервиса:
```http request
http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/
```

Пример конфигурирования документации, используя Open API v3
```java
package org.sayner.sandbox.example.springboot.allspringboot.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

public class BookController {
    private final MockRepo repository= new MockRepo();
    @Operation(summary = "Get a book by its id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the book",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = BookEntity.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Book not found",
                    content = @Content) })
    @GetMapping("/{id}")
    public BookEntity findById(@Parameter(description = "id of book to be searched")
                         @PathVariable int id) {
        return repository.findById(id).orElseThrow(IllegalStateException::new);
    }

    private static class MockRepo{
        Optional<BookEntity> findById(Integer id){
            return Optional.of(new BookEntity(id));
        }
    }
    
    private static class BookEntity {
        public BookEntity(Integer id) {
        }
    }
}
```
Зайти в консоль контейнера Docker 
```shell script
docker exec -ti $(docker ps -a --filter "name=redis_foundation" -q) /bin/sh
```
Открыть консоль управления Redis
```shell script
redis-cli
```
Просмотр всех доступных ключей
```shell script
127.0.0.1:6379> keys *
```
Просмотр содержимого ключа
```shell script
127.0.0.1:6379> HGETALL rulers:5
```
Источники:

Конфигурирование Open Api v3
```http request
https://www.baeldung.com/spring-rest-openapi-documentation
```
Конфигурирование Redis в Spring Boot
```http request
https://otus.ru/nest/post/716/
```

SQL скрипты
```shell script
create table all_spring_boot.user
(
	id serial,
	name varchar,
	email varchar not null,
	password varchar not null
);

create unique index table_name_email_uindex
	on all_spring_boot.user (email);

create unique index table_name_id_uindex
	on all_spring_boot.user (id);

alter table all_spring_boot.user
	add constraint table_name_pk
		primary key (id);
```
