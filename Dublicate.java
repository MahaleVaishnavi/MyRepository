package practice_prm;
import java.util.Arrays;
public class Dublicate {
    public static void main(String[]args)
    {
        int[] num={2,8,6,4,2,8,3,4,1};
        Arrays.sort(num);
        //printArray(num[]);
        //System.out.println(num);
        for(int i=0;i<num.length;i++)
        {
            System.out.print(num[i]+" ");
        }

        System.out.println();
        for(int i=0;i<num.length;i++)
        {
            if(i==0||num[i]!=num[i-1])
            {
                System.out.print(num[i]+" ");
            }
            //System.out.println()
            }
        }
    }
    

