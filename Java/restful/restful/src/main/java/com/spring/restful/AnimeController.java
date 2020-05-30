package com.spring.restful;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimeController {
	
	@Autowired
	public AnimeService service;
	
	@GetMapping("")
	public String welcomeScreen() {
		return "Welcome to Anime List Spring Boot Web Application";
	}
	
	@GetMapping("/anime/list")
	public List<Anime> fetchAnimeList() {
		return service.getAnimeList();
	}

}
