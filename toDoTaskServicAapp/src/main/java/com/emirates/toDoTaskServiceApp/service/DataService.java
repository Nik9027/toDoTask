package com.emirates.toDoTaskServiceApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emirates.toDoTaskServiceApp.models.Task;

@Service
public abstract class DataService {

	public abstract Task addTask(String taskDescription, String Status);
	
	public abstract  List<Task> getAllTAsk();
	
	public abstract Boolean deleteTask(int TaskID);
	
	public abstract Task updateStatus(int TaskID, String Status);
	
}
