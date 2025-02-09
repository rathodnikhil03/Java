package com.study.project;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {

	public void complier() {
		System.out.print("Desktop is using..");
		
		}
}
