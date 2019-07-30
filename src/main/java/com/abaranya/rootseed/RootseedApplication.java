package com.abaranya.rootseed;

import com.abaranya.rootseed.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RootseedApplication {
	@Autowired
	QuoteRepository quoteRepository;

	public static void main(String[] args) {
		SpringApplication.run(RootseedApplication.class, args);
	}

}
