package practice_prm;
import java .util.HashSet;
import java .util.Iterator;
public class HashSetExample {
    public static void main(String[]args)
    {
    HashSet<Integer> set=new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(2);// not print,dublicate not allow
    set.add(6);
    System.out.println(set);
    System.out.println(set.contains(2));
    System.out.println(set.size());
    set.remove(1);
    Iterator it=set.iterator();
        while(it.hasNext())
        {
        System.out.println(it.next());
        }
    }
}
