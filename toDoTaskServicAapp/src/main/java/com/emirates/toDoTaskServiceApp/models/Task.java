package com.emirates.toDoTaskServiceApp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="todotask")
@Component

public class Task {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TaskID")
	private int taskID;
	
	@Column(name="TaskDescription")
	private String taskDescription;
	
	@Column(name="Status")
	private String Status;

	public Task() {
		
	}
	
	public Task(String taskDescription2, String status2) {
		super();
		this.taskDescription=taskDescription2;
		this.Status=status2;
	}

	public int getTaskID() {
		return taskID;
	}

	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	
	
}
