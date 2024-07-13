package com.grats.pack.service;

import java.util.List;

import com.grats.pack.payLoad.TaskDto;

public interface TaskService  {

	public TaskDto saveTask(int userid, TaskDto taskDto);
	public List<TaskDto> getAllTasks(int userid);
	public TaskDto updateTaskById(int id, TaskDto taskDto);
	
}
