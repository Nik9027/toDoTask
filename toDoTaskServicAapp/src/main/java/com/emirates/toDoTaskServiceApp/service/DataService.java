package com.emirates.toDoTaskServiceApp.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.emirates.toDoTaskServiceApp.models.Task;
import com.emirates.toDoTaskServiceApp.repository.TaskRepository;

@Service
@Component
public class DataService {

	@Autowired
	TaskRepository taskRepository;
	
	public DataService(TaskRepository repo)
	{
		this.taskRepository=repo;
	}
	
	public Task addTask(String taskDescription, String Status)
	{
		Task task= new Task(taskDescription, Status);
		
		return taskRepository.save(task);
		
	}
	
	public List<Task> getAllTAsk(){
		
		return (List<Task>) taskRepository.findAll();
	}
	
	public Boolean deleteTask(int TaskID) {
		
		taskRepository.deleteById(TaskID);
		
		return !taskRepository.existsById(TaskID);
	}
	
	public Task updateStatus(int TaskID, String Status ) {
		if (taskRepository.existsById(TaskID))
		{
			taskRepository.updateStatus(TaskID, Status);
		}
		
		return taskRepository.findById(TaskID).orElse(new Task("NA","NA"));
		
	}
	
}
