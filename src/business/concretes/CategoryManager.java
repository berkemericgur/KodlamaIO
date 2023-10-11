package business.concretes;

import business.abstracs.CategoryService;
import core.logging.Logger;
import dataAcces.abstracts.CategoryDAO;
import entities.Category;

import java.util.List;

public class CategoryManager implements CategoryService {
    CategoryDAO categoryDAO;
    List<Logger> loggerList;

    public CategoryManager(CategoryDAO categoryDAO, List<Logger> loggerList) {
        this.categoryDAO = categoryDAO;
        this.loggerList = loggerList;
    }

    @Override
    public void add(Category category) throws Exception {
        System.out.println("Kategori eklendi : " + category.getName());

        categoryDAO.add(category);

        for (Logger logger1 : loggerList) {
            logger1.log(category.getName());

        }
    }
}
