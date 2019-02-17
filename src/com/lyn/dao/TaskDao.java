package com.lyn.dao;

import java.util.List;

import com.lyn.model.Task;



/**
 * @author    Yaning Liu
 *
 * @filename  TaskDao.java
 *
 * @date      2019-02-16
 *
 */


public interface TaskDao {

	public void addTask(Task task);
	
	public Task findTask(long id);
	
	public void upadteTask(Task user);
	
	public void delTask(Task user);
	
	public List<Task> getTaskList();
}
