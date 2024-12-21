interface Playable
 {
 void play();
 }
 class Football implements Playable{
 public void play()
 {
 System.out.println("playing Football");
 }
 }
 class Vollyball implements Playable
 {
 public void play()
 {
 System.out.println("Playing Vollyball");
 }
}
 class Basketball implements Playable
 {
 public void play()
 {
 System.out.println("Playing Basketball");
 }
 }
 public class Demo1 {
 public static void main(String[] args) {
 Football F=new Football();
 Vollyball V= new Vollyball();
 Basketball B= new Basketball();
 F.play();
 V.play();
 B.play();
 }

 }