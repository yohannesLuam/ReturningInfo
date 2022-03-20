public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Corolla", "Toyota", 1966, 1500, "Red", 10);
        System.out.println(car1.toString());
        System.out.println(car1.getColor());
        car1.sell(2);
        car1.delivery(3);
        int year = car1.getYear();
        car1.setColor("Yellow");
        System.out.println(car1.toString());
    }
}
