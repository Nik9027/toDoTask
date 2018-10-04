package com.emi.boot.toDoTaskServicAapp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.emirates.toDoTaskServiceApp.models.Task;


@SpringBootTest
@RunWith(SpringRunner.class)
public class IntegrationTest {

	TestRestTemplate restTemplateTest;
	
	@Test
	public void integration_addTask()
	{
		ResponseEntity<Task> response= restTemplateTest.getForEntity("/task/add?taskDescription=firstTask&status=Pending", Task.class);
		//assert
			assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
			assertThat(response.getBody().getStatus()).isEqualToIgnoringCase("Pending");
			assertThat(response.getBody().getTaskDescription()).isEqualTo("firstTask");
	}
}
