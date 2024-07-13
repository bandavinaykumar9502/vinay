package com.grats.pack.service;


import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grats.pack.entity.Task;
import com.grats.pack.entity.User;
import com.grats.pack.exception.TaskNotFound;
import com.grats.pack.exception.UserException;
import com.grats.pack.payLoad.TaskDto;
import com.grats.pack.repo.TaskRepo;
import com.grats.pack.repo.UserRepo;

@Service
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private TaskRepo taskRepo;
	
	@Autowired
	private UserRepo userRepo;
	

	
	public TaskDto saveTask(int userid, TaskDto taskDto) {
		 User user = userRepo.findById(userid).orElseThrow(
				 () -> new UserException(String.format("Userid %d is not found", userid))
				 );
		 
		 
		Task task= modelMapper.map(taskDto, Task.class);
		task.setUser(user);
		Task savedtask = taskRepo.save(task);
		return modelMapper.map(savedtask, TaskDto.class);
	}

	public List<TaskDto> getAllTasks(int userid) {
			userRepo.findById(userid).orElseThrow(
					() -> new UserException(String.format("the userid %d you entered is not found", userid))
					);
				List<Task> tasks = taskRepo.findAllByuserId(userid);
				List<TaskDto> dtoTasks= tasks.stream().map(task -> modelMapper.map(task, TaskDto.class)).collect(Collectors.toList());
			return dtoTasks;
		
	}

	public TaskDto updateTaskById(int id, TaskDto taskDto) {
//		userRepo.findById(userid).orElseThrow(
//				() -> new UserException(String.format("the userid %d you entered is not found", userid))
//				);
		
		Task existedTask = taskRepo.findById(id).orElseThrow(
				() -> new TaskNotFound(String.format("The id  %d you entered is not found", id))
				);
		
		modelMapper.map(taskDto, existedTask);
		Task savedTask = taskRepo.save(existedTask);
		
		return modelMapper.map(savedTask, TaskDto.class);
	}
	
	
	
	
}
