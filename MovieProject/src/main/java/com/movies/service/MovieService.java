package com.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movies.model.Movies;
import com.movies.repositary.MovieRepositary;

@Service
public class MovieService {
	
	@Autowired
	MovieRepositary repo;

	public String insertMovie(int id,String name,int price) {
		
		String result=repo.saveMovie(id, name, price);
		
		return result;
	}
	
	public String updateMovie(int id,String name,int price) {
		
		String result=repo.updateMovie(id,name,price);
		return result;
	}
	
	public String deleteMovie() {
		String result=repo.deleteMovie();
		return result;
	}
	
	public List<Movies> getMovie(){
		return repo.getMovie();
		
	}
}
