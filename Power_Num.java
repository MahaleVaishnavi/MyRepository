package practice_prm;
import java.util.Scanner;
public class Power_Num {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base number :");
        int base=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the power of the Number :");
        int power=sc1.nextInt();
        int result=1;
        for(int i=0;i<=power;i++)
        {
             result=result*base;
        }
        System.out.println("power of the number is:"+result);

    }

    
    
}
