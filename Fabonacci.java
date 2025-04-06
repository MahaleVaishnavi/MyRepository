
package practice_prm;
import java . util.Scanner;
public class Fabonacci {
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER RANGE YOU WANT TO IN FABONNCI SERIES");
        int num =sc.nextInt();
        int first_num=0,Next_num,second_num=-1;
        for(int i=0;i<=num;i++)
        {
          Next_num=first_num+second_num;
          System.out.print(Next_num);
          first_num=second_num;
          second_num=Next_num; 
        }

    }
}
