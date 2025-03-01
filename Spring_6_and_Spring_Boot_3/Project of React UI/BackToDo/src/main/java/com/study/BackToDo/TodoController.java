package com.study.BackToDo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.BackToDo.model.TodoList;
import com.study.BackToDo.service.TodoService;


@RestController
@RequestMapping("/api/todos")
@CrossOrigin(origins = "http://localhost:3000")
public class TodoController {

	@Autowired
	private TodoService service;
	
	@GetMapping
	public List<TodoList> getAllTodoList(){
		return service.getAllTodoList();
	}
	
	@GetMapping("/{id}")
	public TodoList getTodoById(@PathVariable("id") Long id){
		return service.getTodoById(id).orElse(new TodoList());
	}
	
	@PostMapping
    public Optional<TodoList> createTodo(@RequestBody TodoList list) {
		service.createTodo(list);
		return service.getTodoById(list.getId());
    }

    @PutMapping("/{id}")
    public TodoList updateTodo(@PathVariable Long id,@RequestBody TodoList list) {
    	Optional<TodoList> existingList = service.getTodoById(id);
    	if(existingList.isPresent()) {
    		TodoList newList = existingList.get();
    		newList.setName(list.getName());
    		newList.setDescription(list.getDescription());
    		return service.updateTodo(newList);
    	}
    	else {
    		TodoList blank = new TodoList();
    		return blank;
    	}
    }

    @DeleteMapping("/{id}")
    public String deleteTodo(@PathVariable Long id) {
    	return service.deleteTodo(id);
    }
}
