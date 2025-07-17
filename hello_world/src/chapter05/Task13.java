package chapter05;


public class Task13 {
    // create an instance of the class Car
    public static void main(String[] args) {
        Car car1 = new Car("Ford", "Everest", 2013, 5);
        car1.displayDetails();
    }
}

//  create base class called Vehicle with the stated attributes
class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        super();
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

//  create a derived class
class Car extends Vehicle {
    int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {

        System.out.print("Car Details:\n" +
                "Make: " + this.make +"\n"
                +"Model: "+ this.model +"\n"
                +"Year: "+ this.year +"\n"
                +"Number of Doors: "+ this.numberOfDoors);
    }
}

