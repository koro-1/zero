import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache {


    private int cap;
    private Map<Integer, Integer> map = new LinkedHashMap<>();  // 保持插入顺序

    public LRUCache(int capacity) {
        this.cap = capacity;
    }

    public int get(int key) {
        if (map.keySet().contains(key)) {
            int value = map.get(key);
            map.remove(key);
            // 保证每次查询后，都在末尾
            map.put(key, value);
            return value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.keySet().contains(key)) {
            map.remove(key);
        } else if (map.size() == cap) {
            Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

            iterator.next();
            iterator.remove();

            // int firstKey = map.e***ySet().iterator().next().getValue();
            // map.remove(firstKey);
        }
        map.put(key, value);
    }

    public static void main(String[] args) {
        LRUCache lruCache=new LRUCache(3);
        lruCache.put(1,1);
        lruCache.put(2,2);
        lruCache.get(1);
        lruCache.put(3,3);
        lruCache.put(4,4);
        System.out.println(lruCache);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */