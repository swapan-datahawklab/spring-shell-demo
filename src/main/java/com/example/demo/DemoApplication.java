package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.command.annotation.CommandScan;

@SpringBootApplication
@CommandScan
public class DemoApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication application = new SpringApplication(DemoApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}

}
