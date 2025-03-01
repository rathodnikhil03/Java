package com.study.BackToDo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.BackToDo.Repo.TodoRepo;
import com.study.BackToDo.model.TodoList;

@Service
public class TodoService {

	@Autowired
	private TodoRepo repo;

	public List<TodoList> getAllTodoList() {
		
		return repo.findAll();
	}

	public Optional<TodoList> getTodoById(Long id) {
		
		return repo.findById(id);
	}

	

	public TodoList updateTodo(TodoList list) {
		
		return repo.save(list);
	}

	public String deleteTodo(Long id) {
		 repo.deleteById(id);
		 return "deleted";
		
	}

	public void createTodo(TodoList list) {
		repo.save(list);
		
	}	
	
}
