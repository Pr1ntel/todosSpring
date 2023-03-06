package com.example.gototodos.controller;


import com.example.gototodos.model.Todoitem;
import com.example.gototodos.service.TodoItemsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;;import java.util.List;

@RestController
@RequestMapping(path = "/todos")
@AllArgsConstructor
public class TodoItemsController {
    private final TodoItemsService todoItemsService;

    @GetMapping(value = "/getAll")
    public List<Todoitem.TodoItem> getAll() {
        return todoItemsService.getAll();
    }

}
