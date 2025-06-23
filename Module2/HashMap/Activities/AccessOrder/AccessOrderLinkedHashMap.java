package Module2.HashMap.Activities.AccessOrder;

import java.util.LinkedHashMap;
import java.util.Map;

public class AccessOrderLinkedHashMap extends LinkedHashMap<Integer,Student> {
    private final int capacity;
    AccessOrderLinkedHashMap(int capacity){
        super(capacity,0.75f,true);
        this.capacity= capacity;
    }
    //Working it will push the leat recently used element at the end of the map
    // will return true if the size of map > capacity -> remove the element at the first entry

    @Override
    protected boolean removeEldestEntry(@SuppressWarnings("rawtypes") Map.Entry eldest){
        return size()>capacity;
    }
}
