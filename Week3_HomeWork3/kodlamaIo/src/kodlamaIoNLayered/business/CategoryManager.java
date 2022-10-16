package kodlamaIoNLayered.business;

import kodlamaIoNLayered.core.logging.Logger;
import kodlamaIoNLayered.dataAccess.CategoryDao;
import kodlamaIoNLayered.entities.Category;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception{
        Category[] categories = new Category[]{
                new Category(1,"Tümü"),
                new Category(2,"Programlama")
        };
        for(Category c :categories) {
            if(category.getName() == c.getName()){
                throw new Exception("Bu isimde bir kategori zaten mevcut.");
            }
        }
        for(Logger logger : loggers){
            logger.log(category.getName());

        }

    }
}
