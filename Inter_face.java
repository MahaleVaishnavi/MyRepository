package practice_prm;

interface Vehical  {
    void speed();  
}
interface Car{
    void speed();
}
class BMW implements Vehical,Car{
 public void speed()
 {
    System.out.println("Speed is Avarage");
 }
 public void color()
 {
    System.out.println("color is White");
 }
} 
 public class Inter_face
{
    public static void main(String[] args) {
        BMW b1=new BMW();
        b1.speed();
        b1.color();
    }
}