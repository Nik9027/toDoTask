package com.emirates.toDoTaskServiceApp.repository;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.emirates.toDoTaskServiceApp.models.Task;

@Repository
@Component
public interface TaskRepository extends CrudRepository<Task, Integer> {

	@Transactional
	@Modifying(clearAutomatically = true)
    @Query("UPDATE Task t SET t.Status = :status WHERE t.taskID = :taskid")
    int updateStatus(@Param("taskid") int taskid, @Param("status") String status);
}
