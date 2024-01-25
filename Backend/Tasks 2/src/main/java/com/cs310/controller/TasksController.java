package com.cs310.controller;

import com.cs310.model.Tasks;
import com.cs310.dao.TasksDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TasksController {

    @Autowired
    private TasksDAO tasksDAO;

    private static final Logger logger = LoggerFactory.getLogger(TasksController.class);

    @GetMapping("/all")
    public List<Tasks> getAllTasks() {
        logger.info("Fetching all tasks");
        return tasksDAO.findAll();
    }

    @PostMapping("/add")
    public Tasks addTask(@RequestBody Tasks task) {
        logger.info("Adding new task");
        return tasksDAO.save(task);
    }

    @GetMapping("/{id}")
    public Tasks getTaskById(@PathVariable String id) {
        logger.info("Fetching task with ID: {}", id);
        Optional<Tasks> task = tasksDAO.findById(id);
        return task.orElse(null);
    }

    @PutMapping("/{id}")
    public Tasks updateTask(@PathVariable String id, @RequestBody Tasks task) {
        logger.info("Updating task with ID: {}", id);
        task.setId(id);
        return tasksDAO.save(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable String id) {
        logger.info("Deleting task with ID: {}", id);
        tasksDAO.deleteById(id);
    }

    // Additional methods to add

}
