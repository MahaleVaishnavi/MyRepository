package practice_prm;
import java.util.Scanner;
public class Amstrong {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num =sc.nextInt();
        int tamp=num,arm=0;
        while(num>0)
        {
          int res=num%10;
          arm=res*res*res+arm;
          num=num/10;  
        }
        if(tamp==arm)
        {
            System.out.println("it is amstrong number");
        }
        else{
            System.out.println("not amstrong");
        }
    }
    
}
