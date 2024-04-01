package hw.ch04.car;

import hw.ch04.framework.Product;

public class Car_ChaSeoyeon extends Product {
    private String modelName;

    Car_ChaSeoyeon(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public void use() {
        System.out.println("모델명이 " + this.modelName + "인 Car를 사용합니다.");
    }

    @Override
    public String getModelName() {
        return modelName;
    }
}
