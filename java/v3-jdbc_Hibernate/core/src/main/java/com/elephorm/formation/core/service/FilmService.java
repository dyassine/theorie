package com.elephorm.formation.core.service;
import com.elephorm.formation.core.entity.Film;
import com.elephorm.formation.core.repository.file.FileFilmDAO;
import com.elephorm.formation.core.repository.FilmDaoInterface;
import com.elephorm.formation.core.repository.hibernate.HibernateFilmDAO;
import com.elephorm.formation.core.repository.jdbc.JDBCFilmDao;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;


@Service
public class FilmService implements FilmServiceInterface{

    public FilmService(){
        
    }
    
    public FilmService(FilmDaoInterface dao){
        this.dao=dao;
    }
    
    @Resource
    private FilmDaoInterface dao;

    public void setDao(FilmDaoInterface dao) {
        this.dao = dao;
    }

    public FilmDaoInterface getDao() {
        return dao;
    }
    
    
 public void registerFilm(Film film){
/*
     System.out.println("film enregistré");
     */
     
     
 /*
     FileFilmDAO dao=new FileFilmDAO();
    dao.save(film);
*/
     
   /*
     JDBCFilmDao dao=new JDBCFilmDao();
     dao.save(film);
 */
    // HibernateFilmDAO  dao=new HibernateFilmDAO();
     dao.save((film));

 }

public Film getFilmADecrire(int id){

//HibernateFilmDAO dao=new HibernateFilmDAO();
return dao.getById(id);
}


public List<Film> getListeFilms(){
//HibernateFilmDAO dao= new HibernateFilmDAO();
return dao.list();
}

       
}
