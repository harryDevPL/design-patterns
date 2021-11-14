package pl.wojcik.patterns.structural.decorator.coffee;

import java.util.List;

public class DarkCoffee implements Coffee {

    private static final double DARK_COST = 0.5;
    private static final String DARK_COFFEE_INGREDIENT = "COFFEE!";

    @Override
    public double getCost() {
        return DARK_COST;
    }

    @Override
    public List<String> getIngredients() {
        return List.of(DARK_COFFEE_INGREDIENT);
    }
}
