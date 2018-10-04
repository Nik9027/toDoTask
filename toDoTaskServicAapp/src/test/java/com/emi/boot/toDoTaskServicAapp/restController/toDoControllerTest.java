package com.emi.boot.toDoTaskServicAapp.restController;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.emirates.toDoTaskServiceApp.models.Task;
import com.emirates.toDoTaskServiceApp.restController.ToDoController;
import com.emirates.toDoTaskServiceApp.service.DataService;




@RunWith(SpringRunner.class)
@WebMvcTest(ToDoController.class)

public class toDoControllerTest {

	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	DataService service;
	
	@Test
	public void testADDController() throws Exception
	{
		BDDMockito.given(service.addTask(ArgumentMatchers.anyString(), ArgumentMatchers.anyString())).willReturn(new Task("GetData","Pending"));
		
		mockMvc.perform(MockMvcRequestBuilders.get("/task/add?taskDescription=GetData&status=Pending"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("taskDescription").value("GetData"))
		.andExpect(jsonPath("status").value("Pending"));
		

	}
}
