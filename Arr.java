package practice_prm;

public class Arr {
    public static void main(String[]args)
    {
        int[] arr={1,6,3,1,7,2,6,3};
        for(int i =1;i<arr.length;i++)
        {
            if( i==0||arr[i]==arr[i-1])
            {
                System.out.println(arr[i]);
            }
        }
    }
    
}
