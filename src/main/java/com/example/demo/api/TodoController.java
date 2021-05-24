package com.example.demo.api;

import com.example.demo.dal.model.Todo;
import com.example.demo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/todo/")
public class TodoController {

    private final TodoService todoService;

    @GetMapping()
    public List<Todo> allTodo() {
        return this.todoService.allTodo();
    }

    @PostMapping()
    public Todo addNew(@RequestBody Todo todo) {
        return this.todoService.addNewTodo(todo);
    }

    @DeleteMapping("/todo_id={todoId}")
    public void deleteTodo(@PathVariable long todoId) {
        this.todoService.getTodoById(todoId).ifPresent(this.todoService::deleteTodo);
    }
}
