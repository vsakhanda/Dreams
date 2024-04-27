package l30Threads2.NewThread.concurrentCollection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        
        map.put("one", 1);
        map.put("two", 2);
        
        int value = map.get("one");
        System.out.println("Value for one: " + value);
        
    }
    
}
