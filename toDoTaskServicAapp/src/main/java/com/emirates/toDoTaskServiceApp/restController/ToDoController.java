package com.emirates.toDoTaskServiceApp.restController;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emirates.toDoTaskServiceApp.models.Task;
import com.emirates.toDoTaskServiceApp.service.DataService;

@CrossOrigin
@RestController
@RequestMapping("/task")
public class ToDoController {

	@Autowired
	DataService service;
	
		
	
	@RequestMapping(value="/add", method=RequestMethod.GET )
	public ResponseEntity<Task> addTask(@RequestParam("taskDescription") String taskDescription, @RequestParam ("status") String Status) throws Exception {
		
		Task t= service.addTask(taskDescription, Status);
		return new ResponseEntity<Task>(t, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="all", method=RequestMethod.GET)
	public ResponseEntity<List<Task>> getAllTask() throws Exception
	{
		
		return new ResponseEntity<List<Task>>(service.getAllTAsk(), HttpStatus.OK);
	}
	
	@RequestMapping(value="delete", method=RequestMethod.GET)
	public ResponseEntity<Boolean> deleteTask(@RequestParam("TaskID") int TaskID) throws Exception
	{
		Boolean b= service.deleteTask(TaskID);
		return new ResponseEntity<Boolean>(b, HttpStatus.OK);
	}
	
	@RequestMapping(value="update", method=RequestMethod.GET)
	public ResponseEntity<Task> updateTask(@RequestParam("TaskID") int TaskID, @RequestParam ("status") String Status) throws Exception{
	
		return new ResponseEntity<Task>(service.updateStatus(TaskID, Status), HttpStatus.OK);
	}
	
	
}
