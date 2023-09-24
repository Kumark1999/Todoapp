package com.todoapp.ToDo.App.Exceptions;

public class ToDoNotFoundException  extends RuntimeException{
    public ToDoNotFoundException(Long id){
        super("Could not found the employee with id "+id);
    }

}
