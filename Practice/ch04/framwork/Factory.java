package Practice.ch04.framwork;

public abstract class Factory {
    // 제품 생성 과정(큰 흐름)을 결정 -> Template Method
    // Factory Pattern == Template Pattern을 응용
    public final Product create(String owner) {
        // 제품 생산
        Product p = createProduct(owner);

        //제품 등록
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
