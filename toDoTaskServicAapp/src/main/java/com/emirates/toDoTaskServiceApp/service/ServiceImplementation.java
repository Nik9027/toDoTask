package com.emirates.toDoTaskServiceApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.emirates.toDoTaskServiceApp.models.Task;
import com.emirates.toDoTaskServiceApp.repository.TaskRepository;

@Component
public class ServiceImplementation extends DataService {

	
	@Autowired
	TaskRepository taskRepository;
	
	@Autowired
	public ServiceImplementation(TaskRepository repo)
	{
		this.taskRepository=repo;
	}
	
	
	@Override
	public Task addTask(String taskDescription, String Status) {
		Task task= new Task(taskDescription, Status);
		
		return taskRepository.save(task);
		
	}

	@Override
	public List<Task> getAllTAsk() {
		
		return (List<Task>) taskRepository.findAll();
	}

	@Override
	public Boolean deleteTask(int TaskID) {
		
		taskRepository.deleteById(TaskID);
		
		return !taskRepository.existsById(TaskID);
	}

	@Override
	public Task updateStatus(int TaskID, String Status) {
		if (taskRepository.existsById(TaskID))
		{
			taskRepository.updateStatus(TaskID, Status);
		}
		
		return taskRepository.findById(TaskID).orElse(new Task("NA","NA"));
		
	}

}
