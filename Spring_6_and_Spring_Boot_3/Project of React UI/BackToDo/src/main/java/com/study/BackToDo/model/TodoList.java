package com.study.BackToDo.model;




import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
public class TodoList {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String description;

	
	public TodoList(Long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	
	public TodoList() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "TodoList [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
}
