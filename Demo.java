 class Person
 {
 private String name;
 private int age;
 public Person(String name,int age) {
 this.name=name;
 this.age=age;
 }
 public String getName()
 {
 return name;
 }
 public int getAge()
 {
 return age;
 }
 }
 public class Demo {

 public static void main(String[] args) {
 Person P1= new Person("Swapnali",21);
 Person P2= new Person("Gauri",20);
 System.out.println("persons name is :" + P1.getName() + " and age is:"+ P1.getAge());
 System.out.println("persons name is :" + P2.getName() + " and age is:"+ P2.getAge());
 }
 }