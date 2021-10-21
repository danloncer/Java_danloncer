package pro.sky.java.course2.lesson2;

public abstract class SchemeTransport implements Transport {

    private final String modelName;
    private final int wheelsCount;

    public SchemeTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        if (getWheelsCount() > 2 && getWheelsCount() <= 4) {
            checkEngine();
        }
        if (getWheelsCount() > 4) {
            checkTrailer();
        }

    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

}
