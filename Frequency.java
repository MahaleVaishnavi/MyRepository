package practice_prm;
import java .util.Scanner;
public class Frequency {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String inputString=sc.nextLine();
        //inputString=charAt(0);
        System.out.println("Enter the character");
        String charecter=sc.nextLine();//charAt(0);
        int frequency=0;
        for(int i=0;i<inputString.length();i++)
        {
            if(inputString.charAt(i)==charecter.charAt(0))
            {
                frequency++;
            }
        }
        System.out.println("frequncy of charecter is " +frequency);


    }
    
}
