package com.todoapp.ToDo.App.Repository;

import com.todoapp.ToDo.App.Model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo ,Long> {
}
