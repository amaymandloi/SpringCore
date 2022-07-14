package com.yash.Vowel_6;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.yash.Vowel_6")
public class Config {
	
	@Bean
	public Name name()
	{
		Name n=new Name();
	//	System.out.println("Bean class");
		n.setName1("Amay");
		n.setName2("kanjus");
		n.setName3("kytrs");
		n.setName4("Amit");
		n.setName5("Gurvinder");
		return n;
	}

}
