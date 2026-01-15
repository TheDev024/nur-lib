package com.andersenlab.nurlib;

import org.springframework.boot.SpringApplication;

public class TestNurLibApplication {

	public static void main(String[] args) {
		SpringApplication.from(NurLibApp::main).with(TestcontainersConfiguration.class).run(args);
	}

}
