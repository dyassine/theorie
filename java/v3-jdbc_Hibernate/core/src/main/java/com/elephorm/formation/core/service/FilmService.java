package com.elephorm.formation.core.service;
import com.elephorm.formation.core.entity.Film;
import com.elephorm.formation.core.repository.FileFilmDAO;
import com.elephorm.formation.core.repository.JDBCFilmDao;
public class FilmService {

    
 public void registerFilm(Film film){
/*
     System.out.println("film enregistré");
     */
     
     
 /*
     FileFilmDAO dao=new FileFilmDAO();
    dao.save(film);
*/
     
     JDBCFilmDao dao=new JDBCFilmDao();
     dao.save(film);
 }

}