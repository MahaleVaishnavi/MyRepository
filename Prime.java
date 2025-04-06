package practice_prm;
import java.util.Scanner;
public class Prime {
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter range of number numbers");
        int num=sc.nextInt();
        int result=0;
        for(int i=2;i<=num;i++)
        {
           boolean prime=true;
           for(int j=2;j<i;j++)
           {
            if(i%j==0)
            {
                prime=false;
            }
           }
        if(prime)
        {
            result+=i;
        }    
        }
        System.out.println( "sum of prime number is: "+result);    

    }    
}
