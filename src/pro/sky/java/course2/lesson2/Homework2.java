package pro.sky.java.course2.lesson2;

public class Homework2 {
    public static void main(String[] args) {
        ServiceStation station = new ServiceStation();
        Transport[] allTransports = new Transport[]{
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck("truck1", 6),
                new Truck("truck2", 8),
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),
        };

        for (Transport transport : allTransports) {
            station.check(transport);
        }
    }
}
