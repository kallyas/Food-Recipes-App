package com.kally.recipesapp.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.annotation.NonNull;

@Entity(tableName = "favorite")
public class MealFavorite {

    @PrimaryKey @NonNull public String idMeal;
    public String strMeal;
    public String strMealThumb;

}