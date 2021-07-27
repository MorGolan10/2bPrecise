package com.bPrecise.organizationstructure.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection="task")
public class Task {

    private String employeeId;
    private String managerId;
    private String taskText;
    private Date assignDate;
    private Date dueDate;

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTaskText() {
        return taskText;
    }

    public void setTaskText(String taskText) {
        this.taskText = taskText;
    }

    public Date getAssignDate() {
        return assignDate;
    }

    public void setAssignDate(Date assignDate) {
        this.assignDate = assignDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "employeeId='" + employeeId + '\'' +
                ", managerId='" + managerId + '\'' +
                ", taskText='" + taskText + '\'' +
                ", assignDate='" + assignDate + '\'' +
                ", dueDate='" + dueDate + '\'' +
                '}';
    }
}
