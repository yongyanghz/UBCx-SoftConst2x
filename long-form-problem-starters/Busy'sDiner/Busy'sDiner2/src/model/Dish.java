package model;

import java.util.ArrayList;
import java.util.List;

public class Dish {

    // Ingredients, recipe

    private String name;
    private String description;
    private List<String> ingredients;
    private String recipe;

    public Dish(String name){
        this.ingredients = new ArrayList<>();
        this.name = name;
    }

    public Dish(String  name, String des, List<String> ingredients, String recipe){
        this.ingredients = new ArrayList<>();
        this.name = name;
        this.description = des;
        this.ingredients = ingredients;
        this.recipe = recipe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }
}
