package business.concretes;
import java.util.List;
import business.abstracs.InstructorService;
import core.logging.Logger;
import dataAcces.abstracts.InstructorDAO;
import entities.Instructor;

public class InstructorManager implements InstructorService {
    InstructorDAO instructorDAO;
    List<Logger> loggerList;

    public InstructorManager(InstructorDAO instructorDAO, List<Logger> loggerList) {
        this.instructorDAO = instructorDAO;
        this.loggerList = loggerList;
    }

    @Override
    public void add(Instructor instructor) {
        System.out.println("Eğitmen eklendi : " + instructor.getName());

        for(Logger logger1 : loggerList){
            logger1.log(instructor.getName());
        }
    }

}
