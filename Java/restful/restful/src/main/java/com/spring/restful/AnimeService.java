package com.spring.restful;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AnimeService {
	
	public static List<Anime> animeList = new ArrayList<Anime>();
	
	static {
		animeList.add(new Anime("DBZ","Action",8));
		animeList.add(new Anime("OPM","Comedy",9));
		animeList.add(new Anime("Gantz","Mystery",10));
	}
	
	public List<Anime> getAnimeList() {
		return animeList;
	}
	
}
