package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/todos")
public class TodoController {

@Autowired
private TodoService todoService;

@PostMapping
public Todo createTodo (@RequestBody Todo todo) {
	return todoservice.create(todo);
}

@GetMapping
public List<Todo> getAll() {
	return todoService.getList();
}
}