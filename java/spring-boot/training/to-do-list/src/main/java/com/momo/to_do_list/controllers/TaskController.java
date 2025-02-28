package com.momo.to_do_list.controllers;

import com.momo.to_do_list.services.TaskService;
import com.momo.to_do_list.models.Task;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public ResponseEntity<List<Task>> getTasks() {
        List<Task> tasks = taskService.getAllTasks();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task){
        Task newTask = taskService.addTask(task);
        return new ResponseEntity<>(newTask, HttpStatus.CREATED);
    }

    @GetMapping("/task")
    public ResponseEntity<Task> getElementById(@RequestParam Long id) {
        Task taskFiltered = taskService.getTaskById(id);
        return new ResponseEntity<>(taskFiltered, HttpStatus.OK);
    }


    @PutMapping("/task")
    public ResponseEntity<Task> updateTask(@RequestParam Long id, @RequestBody Task task) {
        Task taskUpdated = taskService.updateTask(id, task);
        return new ResponseEntity<>(taskUpdated, HttpStatus.OK);
    }

    @DeleteMapping
    public void deleteTask(@RequestParam Long id) {
        taskService.deleteTask(id);
    }
}
