package com.skuknuraknu.eventapp;

import com.skuknuraknu.eventapp.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class EventappApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(EventappApplication.class);
	private final OrganizersRepository organizersRepository;
	private final CategoriesRepository categoriesRepository;

	private final ImagesRepository imagesRepository;

	public EventappApplication(OrganizersRepository organizersRepository, CategoriesRepository categoriesRepository, ImagesRepository imagesRepository){
		this.organizersRepository = organizersRepository;
		this.categoriesRepository = categoriesRepository;
		this.imagesRepository = imagesRepository;

	}

	public static void main(String[] args) {
		// testing comments
		SpringApplication.run(EventappApplication.class, args);
		logger.info("Application Started");
	}

	@Override
	public void run(String... args) throws Exception {
		Organizers org1 = new Organizers("Haeriskal Kamil");
		Organizers org2 = new Organizers("Mary Robinson");

		organizersRepository.saveAll(Arrays.asList(org1, org2));
		categoriesRepository.save(new Categories("Konser", org1));
		categoriesRepository.save(new Categories("Seminar", org1));
		categoriesRepository.save(new Categories("Pameran", org2));

		imagesRepository.save(new Images("Avatar.png"));

		for( Organizers org : organizersRepository.findAll()){
			logger.info("Name", org.getName());
		}
	}
}
