package com.erasmo.builder_exercise;

import com.erasmo.builder_exercise.model.Artist;
import com.erasmo.builder_exercise.model.NationalTour;
import com.erasmo.builder_exercise.model.SingerSongwriter;
import com.erasmo.builder_exercise.model.Tour;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderExerciseApplication {

	public static void main(String[] args) {

		SpringApplication.run(BuilderExerciseApplication.class, args);

		Artist gallagher = new Artist.ArtistBuilderNew<>()
									.setNome("Noel Gallagher")
									.setGenere("Pop Rock")
									.setNumeroAlbum(10)
									.setInAttivita(true)
									.build();

		System.out.println(gallagher);

		SingerSongwriter cantautore = new SingerSongwriter.SingerSongwriterBuilder()
				.setNome("Gigi")
				.setGenere("Pop")
				.setInAttivita(true)
				.setStrumento("chitarra")
				.setIsItaliano(true)
				.setCanzoniScritte(5)
				.build();

		System.out.println(cantautore);

		Tour tour = Tour.builder()
				.nome("Gallagher Reunion")
				.artist(gallagher)
				.numeroDate(12)
				.build();

		System.out.println(tour);
	}
}
