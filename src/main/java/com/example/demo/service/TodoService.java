package com.example.demo.service;

import com.example.demo.dal.model.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService {
    List<Todo> allTodo();

    Todo addNewTodo(Todo todo);

    boolean changeStatus(Todo todo);


    Todo updateTodo(Todo todo);

    void deleteTodo(Todo todo);

    Optional<Todo> getTodoById(long todoId);
}
