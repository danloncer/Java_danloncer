package pro.sky.java.course2.lesson2;

public class Car extends SchemeTransport implements Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("У машины нет прицепа");
    }
}