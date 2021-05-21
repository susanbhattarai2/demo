package com.example.demo.service;

import com.example.demo.dal.model.Todo;

import java.util.List;

public interface TodoService {
    public List<Todo> allTodo();
    public Todo addNewTodo(Todo todo);
    public boolean changeStatus(Todo todo);
    public boolean deleteTodo(Todo todo);
}
