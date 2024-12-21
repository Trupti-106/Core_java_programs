 class Animal
 { public void sound()
 {
 System.out.println("Animal makes genaric sound");
 }
 }
 class Cat extends Animal
 {
 public void sound()
 {
 System.out.println("meow meow");
 }
 }
 class Bird extends Animal {
 public void sound()
 {
 System.out.println("chirps");
 }
 }
 public class ADT {
 public static void main(String[] args) {
 Cat C = new Cat();
 Bird B= new Bird();
 C.sound();
 B.sound();
 }

 }

