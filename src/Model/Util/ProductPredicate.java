package Model.Util;

import Model.Entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        return product.getValue() >= 100;
    }
}
