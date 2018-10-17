package com.emirates.toDoTaskServiceApp.service;

import static org.hamcrest.CoreMatchers.any;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.emirates.toDoTaskServiceApp.ToDoTaskServicAappApplication;
import com.emirates.toDoTaskServiceApp.models.Task;
import com.emirates.toDoTaskServiceApp.repository.TaskRepository;


@RunWith(MockitoJUnitRunner.class)
public class DataServiceTest {

	@Mock
	public TaskRepository taskRepository;
	
	
	public DataService service;
	
	@Before
	public void setup() {
		service= new ServiceImplementation(taskRepository);
	}
	
	@Test
	public void addTaskTest()
	{
		Task task = new Task();
		task.setTaskID(234);
		task.setStatus("Pending");
		task.setTaskDescription("description");
		when(taskRepository.save(Mockito.any(Task.class))).thenReturn(task);
		Task t= service.addTask("TaskDescription", "Pending");
		
		assertEquals("Pending", t.getStatus());
	}
	
	@Test
	public void deleteTaskTest()
	{
		
		when(taskRepository.existsById(ArgumentMatchers.anyInt())).thenReturn(Boolean.FALSE);
		Boolean t= service.deleteTask(123);
		
		assertEquals(Boolean.TRUE, t);
	}
}
