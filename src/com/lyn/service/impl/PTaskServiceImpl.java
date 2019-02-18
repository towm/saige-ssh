package com.lyn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyn.dao.PTaskDao;
import com.lyn.model.PTask;
import com.lyn.service.PTaskService;

/**
 * @author    Yaning Liu
 *
 * @filename  PTaskServiceImpl.java
 *
 * @date      2019-02-16
 *
 */

@Service("pTaskService")
public class PTaskServiceImpl implements PTaskService{
	
	@Autowired
	private PTaskDao ptaskDao;
	
	public void addPTask(PTask ptask) {
		System.out.println("**********PTaskService.addPTask***********");
		ptaskDao.addPTask(ptask);
	}

	public PTask findPTask(long id) {
		return ptaskDao.findPTask(id);
	}

	public void upadtePTask(PTask ptask) {
		ptaskDao.upadtePTask(ptask);		
	}
    
	public void delPTask(PTask ptask) {
		ptaskDao.delPTask(ptask);
	}
	
	public List<PTask> getPTaskList(){
		return this.ptaskDao.getPTaskList();
	}

	/* (non-Javadoc)
	 * @see com.lyn.service.PTaskService#getSubPTaskList(int)
	 */
	@Override
	public List<PTask> getSubPTaskList(int i) {
		// TODO Auto-generated method stub
		return this.ptaskDao.getSubPTaskList(i);
	}

}
