package com.example.recipe;

import java.util.*;
import org.springframework.web.bind.annotation.*;
import com.example.recipe.RecipeService;
import com.example.recipe.Recipe;

@RestController
public class RecipeController {
    RecipeService recipeService = new RecipeService();

    @GetMapping("/recipes")
    public List<Recipe> getRecipes() {
        return recipeService.getRecipes();
    }

    @PostMapping("/recipes")
    public Recipe addRecipe(@RequestBody Recipe recipe) {
        return recipeService.addRecipe(recipe);

    }

    @GetMapping("recipes/{recipeId}")

    public Recipe getRecipeById(@PathVariable("recipeId") int recipeId) {
        return recipeService.getRecipeById(recipeId);

    }

    @PutMapping("/recipes/{recipeId}")
    public Recipe updateRecipe(@PathVariable("recipeId") int recipeId, @RequestBody Recipe recipe) {
        return recipeService.updateRecipe(recipeId, recipe);

    }

    @DeleteMapping("/recipes/{recipeId}")
    public void deleteRecipe(@PathVariable("recipeId") int recipeId) {
        recipeService.deleteRecipe(recipeId);
    }
}