package main.java.model;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    // Create a new task
    public Task createTask(String taskName, String dueDate) {
        Task newTask = new Task(taskName, dueDate);
        tasks.add(newTask);
        return newTask;
    }

    // Read all tasks
    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);
    }

    // Read a specific task by ID
    public Task getTaskById(int taskId) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                return task;
            }
        }
        return null; // Task not found
    }

    // Update a task description
    public void updateTaskDescription(int taskId, String newTaskDescription) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.setTask(newTaskDescription);
                break;
            }
        }
    }

    // Update a task due-date
    public void updateTaskDueDate(int taskId, String newDueDate) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.setDueDate(newDueDate);
                break;
            }
        }
    }

    // Delete a task by ID
    public void deleteTask(int taskId) {
        tasks.removeIf(task -> task.getId() == taskId);
    }
}
