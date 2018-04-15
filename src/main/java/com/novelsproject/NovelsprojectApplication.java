package com.novelsproject;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.novelsproject.domain.Categoria;
import com.novelsproject.domain.Novel;
import com.novelsproject.repositories.CategoriaRepository;
import com.novelsproject.repositories.NovelRepository;

@SpringBootApplication
public class NovelsprojectApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private NovelRepository novelRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(NovelsprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Horror");
		Categoria cat2 = new Categoria(null, "Action");
		
		Novel n1 = new Novel(null, "Against the gods", 2547);
		Novel n2 = new Novel(null, "Sorvereign of the three realms", 850);
		Novel n3 = new Novel(null, "Martial god asura", 4877);
		
		cat1.getNovels().addAll(Arrays.asList(n1,n2,n3));
		cat2.getNovels().addAll(Arrays.asList(n2));
		
		n1.getCategorias().addAll(Arrays.asList(cat1));
		n2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		n3.getCategorias().addAll(Arrays.asList(cat2));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		novelRepository.saveAll(Arrays.asList(n1,n2,n3));
		
		
	}
}
