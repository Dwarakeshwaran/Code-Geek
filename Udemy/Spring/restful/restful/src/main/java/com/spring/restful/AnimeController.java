package com.spring.restful;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/anime/list/{name}")
	public Anime fetchAnimeListDBZ(@PathVariable("name") String aniName){
		List<Anime> animeObject = service.getAnimeList();
		
		Anime animeName = new Anime();
		
		for(int i=0 ; i<animeObject.size(); i++) {
			if(animeObject.get(i).name == aniName)
				animeName = animeObject.get(i);
		}
		
		return animeName;
	}

}
