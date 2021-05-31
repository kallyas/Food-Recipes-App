
package com.kally.recipesapp.view.home;

import com.kally.recipesapp.model.Categories;
import com.kally.recipesapp.model.Meals;

import java.util.List;

public interface HomeView {
    void showLoading();
    void hideLoading();
    void setMeal(List<Meals.Meal> meal);
    void setCategory(List<Categories.Category> category);
    void onErrorLoading(String message);
}
