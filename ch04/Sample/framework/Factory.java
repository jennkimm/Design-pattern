package ch04.Sample.framework;

public abstract class Factory {
	// ���� �����, ����ϴ� ���� �ϴ� �޼ҵ� (���ø��޼ҵ��̴�)
<<<<<<< HEAD
	// ���� ������ ���� ū �帧�� �����Ѵ�. => factory method
=======
>>>>>>> 84c953f
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

	// ���� Ŭ����(��ü���� ����)���� �����ϴ� �޼ҵ��
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
