package practice_prm;
import java .util.Scanner;
public class Sum_digits {
    public static void main(String[]args)
    {
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the number");
       int num = sc.nextInt();
       int result=0;
       while(num!=0)
       {
          int digit=num%10;
          result=result+digit;
          num/=10;
       }
       System.out.println("sumof digits is "+(result));

    }
    
}
