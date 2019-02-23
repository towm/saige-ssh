package com.lyn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyn.dao.STaskDao;
import com.lyn.model.STask;
import com.lyn.service.STaskService;

/**
 * @author    Yaning Liu
 *
 * @filename  STaskServiceImpl.java
 *
 * @date      2019-02-23
 *
 */
@Service("sTaskService")
public class STaskServiceImpl implements STaskService{
	
	@Autowired
	private STaskDao staskDao;
	
	public void addSTask(STask stask) {
		System.out.println("**********STaskService.addSTask***********");
		staskDao.addSTask(stask);
	}

	public STask findSTask(long id) {
		return staskDao.findSTask(id);
	}

	public void upadteSTask(STask stask) {
		staskDao.upadteSTask(stask);		
	}
    
	public void delSTask(STask stask) {
		staskDao.delSTask(stask);
	}
	
	public List<STask> getSTaskList(){
		return this.staskDao.getSTaskList();
	}

	/* (non-Javadoc)
	 * @see com.lyn.service.STaskService#getSubSTaskList(int)
	 */
	@Override
	public List<STask> getSubSTaskList(int i) {
		// TODO Auto-generated method stub
		return this.staskDao.getSubSTaskList(i);
	}

	/* (non-Javadoc)
	 * @see com.lyn.service.STaskService#updateStock()
	 */
	@Override
	public void updateStock(int pid, int quality) {
		this.staskDao.upadteStock(pid, quality);
		
	}

}
