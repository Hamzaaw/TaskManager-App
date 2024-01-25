package com.cs310.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Document(collection = "tasks")
public class Tasks {

    @Id private String id;
    private String title;
    private String description;
//    private LocalDate dueDate;
    private String priority;
    private String status;
//    private LocalDate createdAt;

    // Default constructor
    public Tasks() {
        // Needed by Spring Data
    }

    // Constructor with all fields except id
    public Tasks(String title, String description, LocalDate dueDate, String priority, String status) {
        this.title = title;
        this.description = description;
//        this.dueDate = dueDate;
        this.priority = priority;
        this.status = status;
//        this.createdAt = (LocalDateTime.now()).toLocalDate();
    }

    // Constructor with all fields
    public Tasks(String id, String title, String description, LocalDate dueDate, String priority, String status) {
        this.id = id;
        this.title = title;
        this.description = description;
//        this.dueDate = dueDate;
        this.priority = priority;
        this.status = status;
//        this.createdAt = (LocalDateTime.now()).toLocalDate();
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public LocalDate getDueDate() {
//        return dueDate;
//    }
//
//    public void setDueDate(LocalDate dueDate) {
//        this.dueDate = dueDate;
//    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    public LocalDate getCreatedAt() {
//        return createdAt;
//    }

//    public void setCreatedAt(LocalDate createdAt) {
//        this.createdAt = createdAt;
//    }

    // toString method for debugging and logging
    @Override
    public String toString() {
        return "Tasks [id=" + id + ", title=" + title + ", description=" + description + 
               ", dueDate=" + ", priority=" + priority + ", status=" + status + 
               ", createdAt=" + "]";
    }
    
//    public String toString() {
//        return "Tasks [id=" + id + ", title=" + title + ", description=" + description + 
//               ", dueDate=" + dueDate + ", priority=" + priority + ", status=" + status + 
//               ", createdAt=" + createdAt + "]";
//    }
    
    // Additional methods like equals() and hashCode() can be implemented as needed
}
