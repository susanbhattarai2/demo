package com.example.demo.service;

import com.example.demo.dal.model.Todo;
import com.example.demo.dal.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DatabaseTodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    @Override
    public List<Todo> allTodo() {
        return this.todoRepository.findAll();
    }

    @Override
    public Todo addNewTodo(Todo todo) {
        return this.todoRepository.save(todo);
    }

    @Override
    public boolean changeStatus(Todo todo) {
        return false;
    }

    @Override
    public boolean deleteTodo(Todo todo) {
        return false;
    }
}
