package ch04.A2.framework;

public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    
    //하위클래스(구체적인 공장)에서 구현하는 메소드들
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
   
}
