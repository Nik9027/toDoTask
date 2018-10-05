# toDoTask

The toDoTask application is task management application with help of same you can add, delete, update and view all your task.Angular framework has been used for frontend development and bootstrap for responsive design. Springboot has been used for backend development with H2 in-memory data base. The backend service expose 4 endpoints to add, delete,update and view task. 

FrontEnd: Angular 6.0
BackEnd: Springboot with H2 DB.

It's a complete application with UI and Service at one place and sharing single tomcat server.
H2 in-memory database has been used for this application.

Springboot service provides features:
1. addTask
2. delete Task
3. Update task status
4. Get all task

use below command to run this application:
"java -jar  toDoTaskServicAapp-0.0.1-SNAPSHOT.jar"

find the above jar inside ExecutableJar.zip.

UI: http://localhost:8080/toDoTask

Services Example:

To add:
http://localhost:8080/task/add?taskDescription=firstTask&status=Pending

Delete task:
http://localhost:8080/task/delete?TaskID=1

Status Update
http://localhost:8080/task/update?TaskID=1&status=Complete

ShowAll task:
http://localhost:8080/task/all
