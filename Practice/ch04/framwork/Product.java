package Practice.ch04.framwork;

public abstract class Product {
    public abstract void use();

    // 생성자는 abstract 키워드를 사용할 수 없기 때문에 오류가 난다.
    // 생성자는 상속되지 않는다.
    // public abstract Product(String name);
}
