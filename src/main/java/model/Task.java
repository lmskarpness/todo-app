package main.java.model;

public class Task {

    private static int lastAssignedId = 0;

    private int id;
    private String task;
    private String dueDate;

    public Task(String task, String dueDate) {
        this.task = task;
        this.dueDate = dueDate;
        // temporary solution to unique IDs -- create savefile for last assigned ID
        this.id = getUniqueID();
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public int getId() {
        return id;
    }

    private int getUniqueID() {
        return lastAssignedId++;
    }

    @Override
    public String toString() {
        return "Task ID: " + id + " - " + task + ", due " + dueDate + "\n";
    }
}
