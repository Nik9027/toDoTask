package com.emirates.toDoTaskServiceApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.ApplicationContext;


@SpringBootApplication(scanBasePackages= {"com.emirates.toDoTaskServiceApp.restController","com.emirates.toDoTaskServiceApp.service","com.emirates.toDoTaskServiceApp.repository","com.emirates.toDoTaskServiceApp.models"})
@ComponentScan({"com.emirates.toDoTaskServiceApp.restController","com.emirates.toDoTaskServiceApp.service","com.emirates.toDoTaskServiceApp.repository","com.emirates.toDoTaskServiceApp.models"})
@EnableJpaRepositories
public class ToDoTaskServicAappApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =SpringApplication.run(ToDoTaskServicAappApplication.class, args);
		
	
	}
	

}
