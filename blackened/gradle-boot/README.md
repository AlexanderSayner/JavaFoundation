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
