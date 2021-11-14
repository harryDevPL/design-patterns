package pl.wojcik.patterns.structural.decorator.coffee;

import java.util.List;

public class CoffeeWithMilk extends CoffeeDecorator {

    private static final double MILK_COST = 1.5;
    private static final String MILK_INGREDIENT = "MILK";

    public CoffeeWithMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + MILK_COST;
    }

    @Override
    public List<String> getIngredients() {
        super.getIngredients().add(MILK_INGREDIENT);
        return super.getIngredients();
    }
}
