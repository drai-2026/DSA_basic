import java.util.*;
public class hashmap {
    public static void main(String[] args) {
    HashMap<String, Integer> hmap = new HashMap<>();//unOrdered key-value pairs
    hmap.put("INDIA",100);
    hmap.put("USA",1);
    hmap.put("NEPAL",160);
    hmap.put("NEPAL",200);//UPDATES the value of the same key vaule used again
    System.out.println(hmap);
    if(hmap.containsKey("INDIA")){System.out.println("INDIA EXIST ON THE MAP");}//does the key exist
    System.out.println(hmap.get("USA"));//get the value of the key
    
    
    
    //a new of iterating any loop
    /* 
    int[] nums = {12,324,543,65,76,435};
    for(int value : nums){
        System.out.println(value);
    }*/
    //loop through hashmap


   for (String key : hmap.keySet()){
    System.out.println(key+"->"+hmap.get(key));
          }
}
}
