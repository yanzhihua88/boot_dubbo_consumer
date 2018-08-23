package com.yzh.boot_dubbo_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootDubboConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootDubboConsumerApplication.class, args);
		try {  
            System.in.read();  
        } catch (Exception e) {  
            e.printStackTrace();  
        } 
	}
}
