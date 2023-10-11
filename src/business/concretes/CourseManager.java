package business.concretes;

import business.abstracs.CourseService;
import core.logging.Logger;
import dataAcces.abstracts.CourseDAO;
import entities.Course;

import java.util.List;

public class CourseManager implements CourseService {
    CourseDAO courseDAO;
    List<Logger> loggerList;

    public CourseManager(CourseDAO courseDAO, List<Logger> loggerList) {
        this.courseDAO = courseDAO;
        this.loggerList = loggerList;
    }

    @Override
    public void add(Course course) throws Exception {
        if(course.getPrice() < 10){
            throw new Exception("Kurs fiyatı 10' dan düşük olamaz.");
        }
        System.out.println("Kurs eklendi : " + course.getName());
        courseDAO.add(course);

        for(Logger logger1:loggerList){
            logger1.log(course.getName());
        }
    }


}
