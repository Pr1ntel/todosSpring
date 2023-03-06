package com.example.gototodos.service;

import com.example.gototodos.controller.TodoItemsController;
import com.example.gototodos.model.Todoitem;
import com.example.gototodos.repository.TodoItemsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TodoItemsService {
    private final TodoItemsRepository todoItemsRepository;

    public List<Todoitem.TodoItem> getAll(){
        return todoItemsRepository.findAll();
    }
}
