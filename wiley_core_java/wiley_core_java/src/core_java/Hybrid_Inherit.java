package core_java;



 class Vehicle
 {
	 public void tire() {
		 System.out.println("Tire");
	 }
	 public void steering() {
		 System.out.println("steering");
	 }
 }
 
 class Car extends Vehicle
 {
	 public void airbag() {
		 System.out.println("airbag");
	 }
 }
 
 class SmartCar extends Car
 {
	 public void sensor() {
		 System.out.println("sensor");
	 }
 }
 public class Hybrid_Inherit {
	public static void main(String[] args) {
		SmartCar sc= new SmartCar();
		sc.airbag();
		sc.sensor();
		sc.steering();
	}

}
