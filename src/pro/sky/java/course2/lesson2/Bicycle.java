package pro.sky.java.course2.lesson2;

public class Bicycle extends SchemeTransport implements Transport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("У велосипеда нет двигателя");
    }

    public void checkTrailer() {
        System.out.println("У велосипеда нет прицепа");
    }
    //press F to my Refactoring code
}
