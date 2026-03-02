import java.util.*;
public class Hashmapprac {
    public static void main(String[] aw){
    int arr[]={1,2,3,4,3,2,1,2,3,4,3,2,1,4,5,6,9};
    Map<Integer,Integer> map= new HashMap<>();
    //Map<Integer,Integer> map1= new HashMap<>();
    for(int i: arr){
        map.put(i,map.getOrDefault(i,0)+1);

    }
    
    for(int i:map.keySet()){
        System.out.print(i);
    }
      System.out.println("\n");
    for(int i:map.values()){
        System.out.print(i);
    }
    System.out.println("\n");
    for(Map.Entry<Integer,Integer> i:map.entrySet()){
        System.out.println(i.getKey()+"--"+i.getValue());
    }
    }   




}
