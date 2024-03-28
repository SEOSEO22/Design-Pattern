package ch05.A2b;

public enum Triple {
    ALPHA, BETA, GAMMA; // 3개의 상수 값

    private Triple() {
        System.out.println("The instance " + this + " is created.");
    }

    public static Triple getInstance(String name) {
        return valueOf(name);
    }
}
