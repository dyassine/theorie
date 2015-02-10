package com.elephorm.formation.core.controller;

import com.elephorm.formation.core.entity.Film;
import com.elephorm.formation.core.service.FilmService;
import java.util.Scanner;

public class DefaultFilmController {
    public void registerFilmFromConsoleInput(){
    Scanner sc=new Scanner(System.in);
    System.out.println("titre=");
    String titre= sc.nextLine();
    System.out.println("genre=");
    String genre= sc.nextLine();


System.out.println("nbexemplaire=");
int nb= sc.nextInt();



Film film=new Film();
film.setTitre(titre);
film.setGenre(genre);
film.setNbExemplaires(nb);

    
    FilmService service=new FilmService();
    service.registerFilm(film);
    }
}
    

    

