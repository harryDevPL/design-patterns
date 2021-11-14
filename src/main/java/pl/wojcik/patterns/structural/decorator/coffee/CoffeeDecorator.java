package pl.wojcik.patterns.structural.decorator.coffee;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public abstract class CoffeeDecorator implements Coffee {

    private final Coffee decoratedCoffee;

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }

    @Override
    public List<String> getIngredients() {
        return decoratedCoffee.getIngredients();
    }
}
