package com.example.h2zoo;

import com.example.h2zoo.model.Birds;
import com.example.h2zoo.model.Mammals;
import com.example.h2zoo.model.Reptile;
import com.example.h2zoo.repository.BirdsRepository;
import com.example.h2zoo.repository.MammalsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.h2zoo.repository.ReptileRepository;

import java.util.List;

@SpringBootApplication
public class H2ZooApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
		SpringApplication.run(H2ZooApplication.class, args);
		ReptileRepository reptileRepository =
				configurableApplicationContext.getBean(ReptileRepository.class);
		Reptile KingCobra = new Reptile("Slither","Snake","Black & Yellow", "Carnivore");
		Reptile KomodoDragon = new Reptile("Dennis","Lizard", "Brown", "Carnivore");
		Reptile Turtle = new Reptile("mike","Turtle", "Green","Herbivore");
		reptileRepository.saveAll(List.of(KingCobra, KomodoDragon, Turtle));



		BirdsRepository birdsRepository = configurableApplicationContext.getBean(BirdsRepository.class);
		Birds BarnOwl = new Birds("winnie","Bird","Brown & White","Mice");
		Birds Hawk = new Birds("Bernard", "Bird","Grey","Snakes");
		Birds Crane = new Birds("James","Bird","Blue & Grey", "Frogs");
		birdsRepository.saveAll(List.of(BarnOwl, Hawk, Crane));

		MammalsRepository mammalsRepository = configurableApplicationContext.getBean(MammalsRepository.class);
		Mammals Wolf = new Mammals("Scooby","Canis","Grey", "Bison");
		Mammals Tiger = new Mammals("Willis","Cat","Orange & Black","Birds");
		Mammals KoalaBear = new Mammals("Judy","Marsupials","Grey","Vegetation");
		mammalsRepository.saveAll(List.of(Wolf, Tiger, KoalaBear));
	}

}
