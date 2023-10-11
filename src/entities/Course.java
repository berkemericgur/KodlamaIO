package entities;

import business.concretes.CategoryManager;
import business.concretes.InstructorManager;

public class Course {
    private int id;
    private String name;
    private Instructor instructor;
    private Category category;
    private double price;

    public Course() {
    }

    public Course(int id, String name, Instructor instructor, Category category, double price) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
