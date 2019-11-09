package com.lambdaschool.demo.controllers;


import com.lambdaschool.demo.models.Todo;
import com.lambdaschool.demo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
public class TodoController {


    @Autowired
    TodoService todoService;



    //PUT http://localhost:2019/todos/tod0/{todoid} updates tod0
    @PutMapping(value = "/todos/todo/{todoid}", consumes = {"application/json"})
    public ResponseEntity<?> updateTodo(@RequestBody Todo updateTodo, @PathVariable long todoid){

        todoService.updateTodo(updateTodo, todoid);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
