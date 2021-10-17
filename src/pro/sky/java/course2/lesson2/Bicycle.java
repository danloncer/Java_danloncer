package pro.sky.java.course2.lesson2;

public class Bicycle extends SchemeTransport implements AllTransports {

    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    //press F to my Refactoring code
}
