package practice_prm;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[]args)
    {
      Scanner sc =new Scanner(System.in);
      System.out.println("Entr the number");
      int num=sc.nextInt();
       int result=0;
       int temp=num;
       while(temp!=0)
       {
        int reverse=temp%10;
        result=result*10+reverse;
        temp /=10;
       }
       if(result==num)
       {
        System.out.println("Is a polindrome");
       }
       else{
        System.out.println("Is not polindrome");
       }
    }
    
}
