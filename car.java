 class Vehicle
 {
 void Drive()
 {
 System.out.println("drive Safely");
 }
 }
 public class car extends Vehicle{
 void Drive()
 {
 System.out.println("Repairing a car");
 }
 public static void main(String[] args) {
 car c = new car();
 c.Drive();
 }

 }
