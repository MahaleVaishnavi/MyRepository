package practice_prm;
import java.util.LinkedList;
public class Link
{
    public static void main(String[]args)
    {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(12);
        list.add(15);
        list.add(30);
        list.add(10);
        list.add(11);
        System.out.println(list); 
        System.out.println(list.get(2)); 
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.addFirst(2);
        System.out.println(list);
        list.addLast(1);
        System.out.println(8);
        list.remove(1);
        System.out.println(list);

    } 
    }          
