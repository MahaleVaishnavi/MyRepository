package practice_prm;
import java.util.Scanner;
public class Array {
    public static void main(String[]args)
    {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter the size of array");
      int size =sc.nextInt();
      int[] num=new int[size];
      System.out.println("Enter array element");
      for(int i=0;i<size;i++)
      {
       num[i]=sc.nextInt();
      }
       int largest=0;
       int Smallest=0;
       int sum=0;
       for(int i=0;i<size;i++)
       {
       if(num[i]>largest)
       {
       largest=num[i];
       }
       if(num[i]>Smallest)
       {
        Smallest=num[i];
       }
       sum+=num[i];
    }
    
       System.out.println(sum);


    }
    
}
