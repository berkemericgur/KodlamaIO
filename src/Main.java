import business.concretes.CategoryManager;
import business.concretes.CourseManager;
import business.concretes.InstructorManager;
import core.logging.DbLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAcces.concretes.HibernateDAO;
import dataAcces.concretes.JdbcDAO;
import entities.Category;
import entities.Course;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Logger> loggerList = new ArrayList<>();

        loggerList.add(new DbLogger());
        loggerList.add(new MailLogger());
        loggerList.add(new FileLogger());

        InstructorManager instructorManager = new InstructorManager(new HibernateDAO(), loggerList);
        instructorManager.add(new Instructor(1, "Engin Demiroğ"));

        CategoryManager categoryManager = new CategoryManager(new HibernateDAO(), loggerList);
        categoryManager.add(new Category(1, "Java"));

        CourseManager courseManager = new CourseManager(new HibernateDAO(), loggerList);
        courseManager.add(new Course(1, "Yazılım Geliştirme Kampı Java", new Instructor(
                1, "Engin Demiroğ"), new Category(1, "Java Kursu"), 130));


    }
}
