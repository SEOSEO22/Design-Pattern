package hw.ch04.car;

import java.util.Iterator;
import java.util.Vector;
import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class CarFactory extends Factory {
    private Vector<String> modelNames = new Vector<String>();

    @Override
    protected Product createProduct(String modelName) {
        return new Car_ChaSeoyeon(modelName);
    }

    @Override
    protected void registerProduct(Product product) {
        String modelName = product.getModelName();
        modelNames.add(modelName);
    }

    @Override
    public void printAllModelNames() {
        Iterator<String> it = modelNames.iterator();
        System.out.println("<모델명 리스트>");

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
}
