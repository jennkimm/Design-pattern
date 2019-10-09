package ch04.hw.framework;

public abstract class Factory {
    public final Product create(String model) {
        Product p = createProduct(model);
        registerProduct(p);
        return p;
    }
    
    protected abstract Product createProduct(String model);
    protected abstract void registerProduct(Product product);
}
