 class Animal1
 {
 void Move()
 {
 System.out.println("Animal Running");
 }
 }

 public class Cheetah extends Animal1{
 void Move()
 {
 System.out.println("cheetah move safely");
 }
 public static void main(String[] args) {
 Cheetah C= new Cheetah();
 C.Move();
 }
 }