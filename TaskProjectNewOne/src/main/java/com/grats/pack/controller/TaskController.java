package com.grats.pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grats.pack.payLoad.TaskDto;
import com.grats.pack.service.TaskService;

@RestController
@RequestMapping("/insert")
public class TaskController {
	
	
	@Autowired
	private TaskService taskService;
	
	@PostMapping("/tasks/{userid}")
	public ResponseEntity<TaskDto> saveTask(
			@RequestBody TaskDto taskDto,@PathVariable(name = "userid") int userid
			) {
		
		return new ResponseEntity<TaskDto>(taskService.saveTask(userid, taskDto),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getAllTasks/{userid}")
	public ResponseEntity<List<TaskDto>> getAllTasks(@PathVariable int userid){
		return new ResponseEntity<List<TaskDto>>(taskService.getAllTasks(userid),HttpStatus.FOUND);
	}
	
	@PutMapping("/updateTask/{id}")
	public ResponseEntity<TaskDto> updateTask(
		@PathVariable int id, @RequestBody TaskDto taskDto) {
		return new ResponseEntity<TaskDto>(taskService.updateTaskById(id, taskDto),HttpStatus.CREATED) ;
		
	}
	
}
