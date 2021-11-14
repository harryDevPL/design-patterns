package pl.wojcik.patterns.structural.decorator.coffee;

import java.util.List;

public class CoffeeWithSprinkles extends CoffeeDecorator {

    private static final double SPRINKLE_COST = 1.0;
    private static final String SPRINKLE_INGREDIENT = "SPRINKLES";

    public CoffeeWithSprinkles(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + SPRINKLE_COST;
    }

    @Override
    public List<String> getIngredients() {
        super.getIngredients().add(SPRINKLE_INGREDIENT);
        return super.getIngredients();
    }
}
