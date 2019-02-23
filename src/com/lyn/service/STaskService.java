package com.lyn.service;

import java.util.List;

import com.lyn.model.STask;

/**
 * @author    Yaning Liu
 *
 * @filename  Stask.java
 *
 * @date      2019-02-23
 *
 */

public interface STaskService {

	public void addSTask(STask stask);
	
	public STask findSTask(long id);
	
	public void upadteSTask(STask stask);
	
	public void delSTask(STask stask);
	
	public List<STask> getSTaskList();
	
	public void updateStock(int pid, int quality);
	
	public List<STask> getSubSTaskList(int i);

}
