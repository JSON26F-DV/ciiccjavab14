public class Task13 {
    public static void main(String[] args) {
        Car car1 = new Car("TOYOTA", "Camry", 2022, 4);

        System.out.println("Car Details: \n" + car1.displayDetails());

    }
}

class Vehicle {
    String make;
    String model;
    int year;
}

class Car extends Vehicle {
    int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.numberOfDoors = numberOfDoors;

    }

    public String displayDetails() {
        return String.format("Make: %s\nModel: %s\nYear: %d\nNumber of Door: %d\n",
                make, model, year, numberOfDoors);
    }
}
