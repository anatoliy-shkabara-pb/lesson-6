package s02object;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("bmw", 260);
        Car car2 = new Car("kia", 230);
        Car car3 = new Car("bmw", 260);

//        Object o1 = car1;
//        Object o2 = car3;
//        o1.equals(o2);

        System.out.println("eq 1 3: " + car1.equals(car3));
        System.out.println("eq 1 2: " + car1.equals(car2));

        System.out.println("hashCode 1: " + car1.hashCode());
        System.out.println("hashCode 2: " + car2.hashCode());
        System.out.println("hashCode 3: " + car3.hashCode());

        System.out.println(car1);
    }
}
