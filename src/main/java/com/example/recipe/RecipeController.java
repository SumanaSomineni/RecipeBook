package com.example.recipe;

import java.util.*;
import org.springframework.web.bind.annotation.*;
import com.example.recipe.RecipeService;

@RestController
public class RecipeController {
    RecipeService recipeService = new RecipeService();

    @GetMapping("/recipes")
    public ArrayList<Recipe> getRecipes() {
        return recipeService.getRecipes();
    }

    @PostMapping("/recipes")
    public Recipe addRecipe(@RequestBody Recipe recipe) {
        return recipeService.addRecipe(recipe);

    }

    @GetMapping("recipes/{recipeId}")

    public Recipe getRecipeBtId(@PathVariable("recipeId") int recipeId) {
        return recipeService.gerRecipeById();

    }

    @PutMapping("/recipes/{recipeId}")
    public Recipe updateRecipe(@PathVariable("recipeId") int recipeId, @RequestBody Recipe recipe) {
        return recipeService.updatRecipe(recipeId, recipe);

    }

    @DeleteMapping("/recipes/{recipeId}")
    public void deleteRecipe(@PathVariable("bookId") int bookId) {
        recipeService.deleteRecipe(recipeId);
    }
}