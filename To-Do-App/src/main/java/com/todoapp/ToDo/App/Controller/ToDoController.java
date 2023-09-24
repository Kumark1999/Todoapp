package com.todoapp.ToDo.App.Controller;
import com.todoapp.ToDo.App.Exceptions.ToDoNotFoundException;
import com.todoapp.ToDo.App.Model.ToDo;
import com.todoapp.ToDo.App.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/todo")
@CrossOrigin("http://localhost:3000")
public class ToDoController {
    @Autowired
    private ToDoRepository toDoRepository;
    //Get Details
    @GetMapping("/getDetails")
    List<ToDo> getDetails(){
        return toDoRepository.findAll();
    }
    //Add Employee details
    @PostMapping("/saveTask")
    ToDo newToDoTask(@RequestBody ToDo newToDo){
        return toDoRepository.save(newToDo);
    }
    //Delete Task
    @DeleteMapping("/delete/{id}")
    String deleteEmployee(@PathVariable Long id){
        if(!toDoRepository.existsById(id)){
            throw new ToDoNotFoundException(id);
        }else if (toDoRepository.existsById(id))
            toDoRepository.deleteById(id);
        return "Task with id "+id+" has been deleted successfully..!";
    }
}
