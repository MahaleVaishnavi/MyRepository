package practice_prm;
import java.util.ArrayList;
public class Array_List {
    public static void main(String[]args)
    {
       ArrayList<Integer>number=new ArrayList<>();
       number.add(10);
       number.add(12);
       number.add(5);
       number.add(16);
       System.out.println(number);
       System.out.println(number.get(2));
       number.remove(3);
       System.out.println(number);
       number.add(1,15);
       System.out.println(number);
       System.out.println(number.contains(10));
       System.out.println(number.size());
       number.set(2,22);
       System.out.println(number);
       //System.out.println(number);

    }
    
}

