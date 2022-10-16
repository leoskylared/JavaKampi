package kodlamaIoNLayered.business;

import kodlamaIoNLayered.core.logging.Logger;
import kodlamaIoNLayered.dataAccess.InstructorDao;
import kodlamaIoNLayered.entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor){
        instructorDao.add(instructor);
        for(Logger logger : loggers){
            logger.log(instructor.getFirstName() + " "+ instructor.getLastName());
        }
    }


}
