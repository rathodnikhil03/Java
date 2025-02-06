package com.study.jbc;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Scope;
//import org.springframework.context.annotation.Primary;

//import com.study.javabasedconfig.Alien;
//import com.study.javabasedconfig.Computer;
//import com.study.javabasedconfig.Desktop;
//import com.study.javabasedconfig.Laptop;

@Configuration
@ComponentScan("com.study.javabasedconfig")
public class AppConfig{
	
//	@Bean
//	//public Alien alien(@Autowired Computer com)
//	//public Alien alien(@Qualifier("laptop") Computer com)
//	public Alien alien(Computer com){
//		Alien obj = new Alien();
//		obj.setAge(25);
//		obj.setCom(com);
//		return obj;
//		
//	}
//	
//	
//	//@Bean(name = {"com", "demo","desktop"})  it's a bean name in java based configuration
//	@Bean
//	//@Scope("prototype")
//	public Computer desktop() {
//		return new Desktop();
//	}
//
//	@Bean
//	@Primary
//	public Computer laptop() {
//		return new Laptop();
//	}

	}
