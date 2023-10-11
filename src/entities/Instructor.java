package entities;

public class Instructor {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Instructor() {
    }

    public Instructor(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
