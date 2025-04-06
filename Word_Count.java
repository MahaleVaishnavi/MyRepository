package practice_prm;
import java.util.Scanner;
public class Word_Count {
    public static void main(String[]args)
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the statement :");
       String statement=sc.nextLine();
       String[] arr=statement.split(" ");
       System.out.println("word count is :"+arr.length);

    }
    
}
