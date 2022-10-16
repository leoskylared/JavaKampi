package kodlamaIoNLayered.dataAccess;

import kodlamaIoNLayered.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

    @Override
    public void add(Category category) {
        System.out.println("JDBC ile veritabanına eklendi.");
    }
}
