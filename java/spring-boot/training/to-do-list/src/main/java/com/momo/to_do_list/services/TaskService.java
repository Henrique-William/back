package com.momo.to_do_list.services;

import com.momo.to_do_list.models.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong ;

@Service
public class TaskService {
    private final List<Task> tasks = new ArrayList<>();
    private final static AtomicLong  counter = new AtomicLong ();

    public List<Task> getAllTasks() { return tasks; }

    public Task addTask(Task task) {
        task.setId(counter.incrementAndGet());
        tasks.add(task);
        return task;
    }

    public Task getTaskById(Long id) {
        return tasks.stream().filter(task -> task.getId().equals(id)).findFirst().orElse(null);
    }

    public Task updateTask(long id, Task task) {
        Task taskToUpdate = getTaskById(id);
        taskToUpdate.setName(task.getName());
        taskToUpdate.setDescription(task.getDescription());
        taskToUpdate.setIsFinalized(task.getIsFinalized());
        taskToUpdate.setPriority(task.getPriority());
        taskToUpdate.setDueDate(task.getDueDate());
        return taskToUpdate;
    }

    public void deleteTask(long id) {
        tasks.removeIf(task -> task.getId().equals(id));
    }
}
