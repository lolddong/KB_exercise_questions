package ch06.sec07.exam04;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.printf("car1.company: %s\n\n", car1.company);

        Car car2 = new Car("자가용");
        System.out.printf("car2.company: %s\n", car2.company);
        System.out.printf("car2.model: %s\n\n", car2.model);

        Car car3 = new Car("자가용", "빨강");
        System.out.printf("car3.company: %s\n", car3.company);
        System.out.printf("car3.model: %s\n", car3.model);
        System.out.printf("car3.color: %s\n\n", car3.color);

        Car car4 = new Car("택시", "검정", 200);
        System.out.printf("car4.company: %s\n", car4.company);
        System.out.printf("car4.model: %s\n", car4.model);
        System.out.printf("car4.color: %s\n", car4.color);
        System.out.printf("car4.maxSpeed: %s\n", car4.maxSpeed);
    }
}
