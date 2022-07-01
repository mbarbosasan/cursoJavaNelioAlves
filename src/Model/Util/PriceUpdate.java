package Model.Util;

import Model.Entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {
    @Override
    public void accept(Product product) {
        product.setValue(product.getValue() * 1.1);
    }
}
