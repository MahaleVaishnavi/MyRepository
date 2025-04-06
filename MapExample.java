package practice_prm;
import java.util.HashMap;
public class MapExample {
    public static void main(String[] args) {
        {
        HashMap<Integer,String>map=new HashMap<>();
    map.put(1,"Vaishnavi");
    map.put(2,"Raj");
    map.put(3,"rani");
    System.out.println(map);
    System.out.println(map.containsKey(2));
    System.out.println(map.containsValue("rani"));
    System.out.println(map.get(2));
    System.out.println(map.size());
    map.put(3,"Swati");
    //for (map.Entery<Integer,String>e:map.entrySet());
    System.out.println(map.get(3));
    
       
}
    }
    
}
