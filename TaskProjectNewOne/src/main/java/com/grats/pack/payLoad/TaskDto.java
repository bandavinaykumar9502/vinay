package com.grats.pack.payLoad;


public class TaskDto {

	
	private int id;
	
	private String taskname;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	public TaskDto(int id, String taskname) {
		super();
		this.id = id;
		this.taskname = taskname;
	}
	public TaskDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
