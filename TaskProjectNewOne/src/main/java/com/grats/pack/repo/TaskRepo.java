package com.grats.pack.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grats.pack.entity.Task;

public interface TaskRepo extends JpaRepository<Task, Integer> {

	 List<Task> findAllByuserId(int userid);


}
