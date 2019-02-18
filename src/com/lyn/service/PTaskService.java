package com.lyn.service;

import java.util.List;

import com.lyn.model.PTask;
/**
 * @author    Yaning Liu
 *
 * @filename  PTaskService.java
 *
 * @date      2019-02-16
 *
 */


public interface PTaskService {

	public void addPTask(PTask ptask);
	
	public PTask findPTask(long id);
	
	public void upadtePTask(PTask ptask);
	
	public void delPTask(PTask ptask);
	
	public List<PTask> getPTaskList();
	
	public List<PTask> getSubPTaskList(int i);

}
