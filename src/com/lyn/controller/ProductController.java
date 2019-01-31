package com.lyn.controller;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

import com.lyn.model.Product;
import com.lyn.service.ProductService;

/**
 * @author    Yaning Liu
 *
 * @filename  ProductController.java
 *
 * @date      2019-01-30
 *
 */


@Controller
@RequestMapping("/product")
public class ProductController {
	
	///ProductService接口，当只有一个实现类继承接口时，可以使用@Autowired，接口实现类@Service注解即可。
    //For Multiple implement classes, use @Resource(name="productService2") to invoke that specific child interface such as @Service("productService2").
//	@Autowired
//	private ProductService productService;
//	
//	// http://localhost:8080/lyn-ssh/product/addProduct.do
//	@ResponseBody
//	@RequestMapping(method = RequestMethod.POST, value = "addProduct")  
//    public ModelAndView addProduct(Product product){
//		ModelAndView model = new ModelAndView("forward:/common/jsp/product/add_product_succ.jsp");
//		this.productService.addProduct(product);
//	    model.addObject("product",product);
//        return model;
//    }
//	
//	@RequestMapping(method = RequestMethod.GET)
//	   public String printHello(ModelMap model) {
//	      model.addAttribute("message", "Hello Spring MVC Framework!");
//	      return "hello";
//	   }
}
