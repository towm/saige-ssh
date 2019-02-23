package com.lyn.dao;

import java.util.List;

import com.lyn.model.Product;
import com.lyn.model.STask;


/**
 * @author    Yaning Liu
 *
 * @filename  STask.java
 *
 * @date      2019-02-22
 *
 */


public interface STaskDao {

	public void addSTask(STask stask);
	
	public STask findSTask(long id);
	
	public void upadteSTask(STask stask);
	
	public void upadteStock(int pid, int quality);
	
	public void delSTask(STask stask);
	
	public List<STask> getSTaskList();
	
	public List<STask> getSubSTaskList(int i);
}

