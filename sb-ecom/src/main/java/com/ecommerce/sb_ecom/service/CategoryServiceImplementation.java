package com.ecommerce.sb_ecom.service;

import com.ecommerce.sb_ecom.model.Category;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class CategoryServiceImplementation implements CategoryService {
    private List<Category> categoryList=new ArrayList<>();
    private Long nextId=1L;

    @Override
    public List<Category> getAllCategories() {
        return categoryList;
    }

    @Override
    public void createCategory(Category category) {
        category.setCategoryId(nextId++);
        categoryList.add(category);
    }

    @Override
    public String deleteCategory(Long categoryId) {
        Category category=categoryList.stream()
                .filter(c->c.getCategoryId().equals(categoryId))
                .findFirst()
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Resource Not Found"));



        categoryList.remove(category);
        return "category with categoryId: "+categoryId+" deleted successfully";
    }

    @Override
    public Category updateCategory(Category category, Long categoryId) {
        Optional<Category> optionalCategory=categoryList.stream()
                .filter(c->c.getCategoryId().equals(categoryId))
                .findFirst();
        if(optionalCategory.isPresent()){
            Category existingCategory =optionalCategory.get();
            existingCategory.setCategoryName(category.getCategoryName());
            return existingCategory;

        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Resource Not Found");
        }
    }


}
