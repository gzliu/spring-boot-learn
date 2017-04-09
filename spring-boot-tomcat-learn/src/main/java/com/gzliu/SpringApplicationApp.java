package com.gzliu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**   
 * @ClassName:  SpringApplicationApp   
 * @Description:TODO
 * @author: Guzman liu
 * @date:   2017年4月8日 下午5:11:45   
 *      
 */  
//@SpringBootApplication

public class SpringApplicationApp extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringApplicationApp.class, args);
	}

	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		return builder.sources(SpringApplicationApp.class);
	}
	
}
