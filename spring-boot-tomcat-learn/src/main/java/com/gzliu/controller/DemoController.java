package com.gzliu.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.gzliu.service.DemoService;

/**   
 * @ClassName:  DemoController   
 * @Description: controller
 * @author: Guzman liu
 * @date:   2017年4月8日 下午5:10:02   
 *      
 */  
@Controller
//@RequestMapping("/")
public class DemoController {
	@Value("${application.message:Hello World}")
	private String message = "Hello World";
	
	@Autowired
	private  DemoService demoService;
	
	@GetMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", this.message);
		demoService.findAllStu();
		return "main/home";   
	} 
	@GetMapping("/update")
	public String update(){
		
		return "main/index";
	}
	@GetMapping("/login")
	public String login(Map<String, Object> model){
//		model.put("message", "login");
		return "main/login";
	}
}
