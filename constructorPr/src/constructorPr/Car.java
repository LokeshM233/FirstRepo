package constructorPr;

public class Car {
	private String color;
	private String model;
	private int year;
	private String make;
	// Default constructor
	public Car(String color, String model, int year, String make) {
		this.color = color;
		this.model = model;
		this.year = year;
		this.make = make;
	}
	// implementing parameterized constructor
	public Car(String color, String model) {
		this.color = color;
		this.model = model;
		this.year = 2020; // default year
		this.make = "Unknown"; // default make
	}
	
	public static void main(String[] args) {
		// Creating an object using the default constructor
		Car car1 = new Car("Red", "Model S", 2021, "Tesla");
		// printing the details of car1
		System.out.println("Car 1: " + car1.color + ", " + car1.model + ", " + car1.year + ", " + car1.make);
		Car car2 = new Car("Blue", "Model 3");
		System.out.println("Car 2: " + car2.color + ", " + car2.model + ", " + car2.year + ", " + car2.make);
	}

}
