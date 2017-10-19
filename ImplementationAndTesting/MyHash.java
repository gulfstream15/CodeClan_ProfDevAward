import java.util.*;

public class MyHash {

  public static void main(String args[]) {

    MyHash myhash = new MyHash();  
    HashMap<String,Integer> hashMap = new HashMap<>();

    hashMap.put("John", new Integer(10));
    hashMap.put("Mike", new Integer(22));
    hashMap.put("Pete", new Integer(44));
    hashMap.put("Kieran", new Integer(121));
    hashMap.put("Sam", new Integer(34));
    hashMap.put("Les", new Integer(33));

    myhash.printHashMap(hashMap);

  }

  public static void printHashMap(HashMap myHashMap) {

    Set set = myHashMap.entrySet();
    Iterator i = set.iterator();
    
    while(i.hasNext()) {
       Map.Entry me = (Map.Entry)i.next();
       System.out.print(me.getKey() + ": ");
       System.out.println(me.getValue());
    }
    System.out.println();
  }

}
