package dataAcces.concretes;

import dataAcces.abstracts.CategoryDAO;
import dataAcces.abstracts.CourseDAO;
import dataAcces.abstracts.InstructorDAO;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class JdbcDAO implements CategoryDAO, CourseDAO, InstructorDAO {
    @Override
    public void add(Category category) {
        System.out.println(" Kategori JDBC ile veritabanına eklendi.");
    }

    @Override
    public void add(Course course) {
        System.out.println("Kurs JDBC ile veritabanına eklendi.");
    }

    @Override
    public void add(Instructor instructor) {
        System.out.println("Eğitmen JDBC ile veritabanına eklendi.");
    }
}
