package kodlamaIoNLayered.business;

import kodlamaIoNLayered.core.logging.Logger;
import kodlamaIoNLayered.dataAccess.CourseDao;
import kodlamaIoNLayered.entities.Category;
import kodlamaIoNLayered.entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course)throws Exception{
        Course[] courses = new Course[]{
                new Course(1,"Yazılım Geliştirici Yetiştirme Kampı (C# + Angular",0),
                new Course(2,"Yazılım Geliştirici Yetiştirme Kampı",0),
                new Course(3,"Yazılım Geliştirici Yetiştirme Kampı (JavaScript",0),
                new Course(4,"Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)",0),
                new Course(5,"(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA",0),
                new Course(6,"Programlamaya Giriş için Temel Kurs",0)
        };

        for (Course c : courses){
            if(course.getCourseName() == c.getCourseName()){
                throw new Exception("Bu isimde bir kurs zaten mevcut.");
            }
            else if(course.getCoursePrice()<0){
                throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
            }
        }
        courseDao.add(course);

        for(Logger logger : loggers){
            logger.log(course.getCourseName());
        }

    }
}
