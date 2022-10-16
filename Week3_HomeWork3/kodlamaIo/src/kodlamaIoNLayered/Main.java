package kodlamaIoNLayered;

import kodlamaIoNLayered.business.CategoryManager;
import kodlamaIoNLayered.business.CourseManager;
import kodlamaIoNLayered.business.InstructorManager;
import kodlamaIoNLayered.core.logging.DatabaseLogger;
import kodlamaIoNLayered.core.logging.FileLogger;
import kodlamaIoNLayered.core.logging.Logger;
import kodlamaIoNLayered.core.logging.MailLogger;
import kodlamaIoNLayered.dataAccess.HibernateCategoryDao;
import kodlamaIoNLayered.dataAccess.HibernateCourseDao;
import kodlamaIoNLayered.dataAccess.HibernateInstructorDao;
import kodlamaIoNLayered.entities.Category;
import kodlamaIoNLayered.entities.Course;
import kodlamaIoNLayered.entities.Instructor;


public class Main {
    public static void main(String[] args) throws Exception {

        Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};

        Category category = new Category(1,"Deneme");
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
        categoryManager.add(category);

        Course course = new Course(7,"Python geliştirici kampı",0);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(course);

        for(Logger logger : loggers){

            logger.log(course.getCourseName());

            Instructor instructor = new Instructor(1,"Doğukan","Başaran");

            InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),loggers);
            instructorManager.add(instructor);

        }

    }
}