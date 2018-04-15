package com.novelsproject;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.novelsproject.domain.Categoria;
import com.novelsproject.repositories.CategoriaRepository;

@SpringBootApplication
public class NovelsprojectApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(NovelsprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Horror");
		Categoria cat2 = new Categoria(null, "Action");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}
}
