import vehicles.Car;

public class VehiclesMain {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car("BMW", "e46");
        cars[1] = new Car("Ford", "Focus");
        cars[2] = new Car("Fiat", "Bravo");
        cars[3] = new Car("Audi", "a4");
        cars[4] = new Car("Mercedes", "AMG");
        System.out.println(cars[0]);

        // cars[2].setModel("Punto");
        Car thirdCar = cars[2];
        thirdCar.setModel("Punto");
        for (Car car : cars) {
            car.show();
        }

    }
}
