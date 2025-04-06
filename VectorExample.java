package practice_prm;
import java.util.Vector;
public class VectorExample {
    public static void main(String[]args)
    {
        Vector<Integer>vector=new Vector<Integer>();
        vector.add(1);
        vector.add(2);
        vector.add(20);
        vector.add(11);
        System.out.println(vector);
        int element=vector.get(2);
        System.out.println(element);
        vector.remove(1);
        System.out.println(vector);
        System.out.println(vector.size());
        System.out.println(vector.isEmpty());
        System.out.println(vector.contains(20));
        vector.add(34);  //By default 1st index
        System.out.prinln(vector);
        vector.add(1,43); //with help of specific location
        System.out.println(vector);
    }

    
}
