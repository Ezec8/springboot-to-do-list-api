package com.example.demo.service;

import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    // inject repo into service
    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    // get all tasks
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // get task by ID
    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    // add or update a task
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    // delete a task by id
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    // get list of completed tasks
    public List<Task> getCompletedTasks() {
        return taskRepository.findByCompleted(true);
    }



}
