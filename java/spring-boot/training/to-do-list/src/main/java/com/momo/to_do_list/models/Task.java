package com.momo.to_do_list.models;

import java.util.Date;

public class Task {
    private Long id;
    private String name;
    private String description;
    private boolean isFinalized;
    private int priority;
    private Date dueDate;

    public Task(Long id, String name, String description, boolean isFinalized, int priority, Date dueDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isFinalized = isFinalized;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public boolean getFinalized() {
        return isFinalized;
    }
    public int getPriority() {
        return priority;
    }
    public Date getDueDate() {
        return dueDate;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setFinalized(boolean finalized) {
        this.isFinalized = finalized;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
