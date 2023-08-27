package com.movies;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.movies","com.movies.model","com.movies.repositary","com.movies.service","com.movies.controller"})
public class MovieConfig {

}
