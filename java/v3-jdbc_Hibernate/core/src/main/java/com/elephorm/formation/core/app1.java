package com.elephorm.formation.core;

import com.elephorm.formation.core.controller.DefaultFilmController;
import com.elephorm.formation.core.entity.Film;
import com.elephorm.formation.core.service.FilmService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app1 {

    public static void main(String[] arg){
    /*
    Film film=new Film();
    film.setTitre("T1");
    film.setGenre("g1");
    film.setNbExemplaires(2);
    FilmService  service= new FilmService();
    service.registerFilm(film);
    */
        
//     DefaultFilmController controller=new DefaultFilmController();
  
     ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
     DefaultFilmController controller=(DefaultFilmController)context.getBean("filmController");
        
        
        
        
        
    }

}
    
    
    

