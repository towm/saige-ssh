package com.lyn.controller;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lyn.model.PTask;
import com.lyn.model.Product;
import com.lyn.model.STask;
import com.lyn.model.Task;
import com.lyn.model.User;
import com.lyn.service.PTaskService;
import com.lyn.service.ProductService;
import com.lyn.service.STaskService;

import org.springframework.ui.ModelMap;

/**
 * @author    Yaning Liu
 *
 * @filename  StockController.java
 *
 * @date      2019-02-24
 *
 */
@Controller
@RequestMapping("/jsp/stock")
public class StockController {
	
	@Resource(name="pTaskService")
	private PTaskService pTaskService;
	
	@Resource(name="sTaskService")
	private STaskService sTaskService;
	
	@Resource(name="productService")
	private ProductService productService;
	
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, value = "oldStock")  
    public ModelAndView stock(HttpServletRequest request,HttpServletResponse response, @ModelAttribute("stask")STask stask){
		ModelAndView model = new ModelAndView("redirect:stockList.do");
		
		Product p = this.productService.findById(Long.parseLong(request.getParameter("product2").split(":")[0]));
		
		stask.setProduct(p);
		this.sTaskService.addSTask(stask);
        return model;
    }
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, value = "newStock")  
    public ModelAndView stock2(HttpServletRequest request,HttpServletResponse response, @ModelAttribute("stask")STask stask){
		ModelAndView model = new ModelAndView("redirect:stockList.do");
		Product p = new Product();
		p.setName(request.getParameter("product3"));
		
		stask.setProduct(p);
		this.productService.addProduct(p);
//		Product p = this.productService.findById(Integer.parseInt(request.getParameter("product").split(":")[0]));
		this.sTaskService.addSTask(stask);
        return model;
    }
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "index")  
    public ModelAndView stockIndex(User user){
		ModelAndView model = new ModelAndView("forward:stock_index.jsp");
		List<STask> stasks = this.sTaskService.getSTaskList();
		List<Product> products = this.productService.getProductList();
	    model.addObject("stasks",stasks);
//	    List<ProgressBar> progress_bars = new ArrayList<ProgressBar>();
//	    for(STask t:stasks) {
//	    	progress_bars.add(new ProgressBar(t));
//	    }
//	    
//	    model.addObject("bars",progress_bars);
//	    model.addObject("bars_len",progress_bars.size());
	    model.addObject("products",products);
        return model;
    }
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "insert")  
    public ModelAndView stockInsertion(User user){
		ModelAndView model = new ModelAndView("forward:stock_insert.jsp");
		List<STask> stasks = this.sTaskService.getSTaskList();
		List<Product> products = this.productService.getProductList();
	    model.addObject("stasks",stasks);
	    model.addObject("products",products);
        return model;
    }
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "completed")  
    public ModelAndView addProduct(int id){
		ModelAndView model = new ModelAndView("redirect:stockList.do");
		STask stask = this.sTaskService.findSTask(id);
		if(stask.getProgress()=="Completed") {
			model.addObject("errorMessage","Do not re-submit!");
			return model;
		}
			
		int quality = 0;
		Product p = this.productService.findById(stask.getProduct().getId());
		if(stask.getType()=="Out")
			quality = 0 - stask.getQuality();
		else
			quality = stask.getQuality();
		p.setQuality(quality+p.getQuality());
		this.productService.upadteProduct(p);
		this.sTaskService.addSTask(stask);
        return model;
    }
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "stockList")  
    public ModelAndView taskList(STask stask){
		ModelAndView model = new ModelAndView("forward:stock_task_list.jsp");
		List<STask> stasks = sTaskService.getSTaskList();
	    model.addObject("stasks",stasks);
	    List<Product> products = this.productService.getProductList();
	    model.addObject("products",products);
        return model;
    }
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "updateStatus")  
    public ModelAndView updateStatus(int id, int status){
		ModelAndView model = new ModelAndView("redirect:stockList.do");
		STask t = this.sTaskService.findSTask(id);
		switch(status) {
			case 0:t.setProgress("Not Started");break;
			case 2:t.setProgress("In Progress 50%");break;
			case 3:t.setProgress("In Progress 80%");break;
			case 4:t.setProgress("Completed");
			 		 model = new ModelAndView("forward:completed.do");
				     break;
			case 1:t.setProgress("In Progress 20%");break;
		}
		
		this.sTaskService.upadteSTask(t);
        return model;
    }
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "subTaskList")  
    public ModelAndView subTaskList(int listid){
		ModelAndView model = new ModelAndView("forward:stock_task_list.jsp");
		List<STask> subtasks = sTaskService.getSubSTaskList(listid);
	    model.addObject("stasks",subtasks);
        return model;
    }
}
