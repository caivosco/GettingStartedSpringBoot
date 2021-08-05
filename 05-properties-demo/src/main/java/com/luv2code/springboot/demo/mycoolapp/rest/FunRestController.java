package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	@GetMapping("/")
	public String sayHello() {
		return " Hello my friend, the time on server is  " + LocalDateTime.now();
	}
	
	@GetMapping("/intro")
	public String sayAlert() {
		return "Hey this page does not have any content now ";
	}
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Running a hard 5k";
	}
	
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach: " + coachName + ", Team name " + teamName; 
	}
	

}
