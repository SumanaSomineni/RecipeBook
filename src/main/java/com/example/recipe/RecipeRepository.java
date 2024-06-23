package com.example.recipe;

import java.util.*;

public interface RecipeRepository {
    List<Recipe> getRecipes();

    Recipe addRecipe(Recipe recipe);

    Recipe getRecipeById(int recipeId);

    Recipe updateRecipe(int recipeId, Recipe recipe);

    void deleteRecipe(int recipeId);

}