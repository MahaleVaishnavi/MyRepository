package practice_prm;

public class Largest {
    public static void main(String[]args)
    {
    int[] arr=new int[5];
    arr[0]=1;
    arr[1]=6;
    arr[2]=12;
    arr[3]=99;
    arr[4]=29;
    int large=arr[0];
    for(int i=0;i<arr.length;i++)
    {
        if(large<=arr[i])
        {
            large=arr[i];
        }
    }
    System.out.print(large);

}   
}
