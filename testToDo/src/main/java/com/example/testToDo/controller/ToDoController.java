package com.example.testToDo.controller;

import com.example.testToDo.data.ToDo;
import com.example.testToDo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/todo")
public class ToDoController {
    @Autowired
    private ToDoService toDoService;

    @GetMapping
    public List<ToDo> findAll(){
        return toDoService.findAll();
    }

    @GetMapping("/{id}")
    public ToDo findById(@PathVariable String id){
        return toDoService.findById(id);
    }

    @PutMapping("/{id}")
    public ToDo updateById(@RequestBody ToDo toDo){
        return toDoService.save(toDo);
    }

    @PostMapping
    public ToDo create(@RequestBody ToDo toDo){
        return toDoService.save(toDo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
         toDoService.deleteById(id);
    }
}
