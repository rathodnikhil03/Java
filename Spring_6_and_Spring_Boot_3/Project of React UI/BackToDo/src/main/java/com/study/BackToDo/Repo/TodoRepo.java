package com.study.BackToDo.Repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.BackToDo.model.TodoList;

@Repository
public interface TodoRepo extends JpaRepository<TodoList,Long>{

}
