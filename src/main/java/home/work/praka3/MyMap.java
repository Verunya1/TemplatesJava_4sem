package home.work.praka3;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyMap implements Map {
    Map map = new HashMap();
    public static final Semaphore semaphore = new Semaphore(1);

    public MyMap(List listone) {
        this.map = new HashMap();
    }
//    try {
// semaphore.acquire();
// buf++;
// semaphore.release();
// } catch (InterruptedException e) {
// e.printStackTrace();
// }

    @Override
    public int size() {
        int size = 0;
        try {
            semaphore.acquire();
            size = map.size();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean emptiness = true;
        try {
            semaphore.acquire();
            emptiness = map.isEmpty();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return emptiness;
    }

    @Override
    public boolean containsKey(Object key) {
        boolean temp = false;
        try {
            semaphore.acquire();
            temp = map.containsKey(key);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return temp;
    }

    @Override
    public boolean containsValue(Object value) {
        boolean temp = false;
        try {
            semaphore.acquire();
            temp = map.containsValue(value);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return temp;
    }

    @Override
    public Object get(Object key) {
        Object object = null;
        try {
            semaphore.acquire();
            object = map.get(key);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return object;
    }

    @Override
    public Object put(Object key, Object value) {
        Object object = null;
        try {
            semaphore.acquire();
            object = map.put(key, value);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return object;
    }

    @Override
    public Object remove(Object key) {
        Object object = null;
        try {
            semaphore.acquire();
            object = map.remove(key);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return object;
    }

    @Override
    public void putAll(Map m) {
        Object object = null;
        try {
            semaphore.acquire();
            map.putAll(m);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
            map.clear();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Set keySet() {
        Set<Key> set = null;
        try {
            semaphore.acquire();
            set = map.keySet();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return set;
    }

    @Override
    public Collection values() {
        Collection<Value> collection = null;
        try {
            semaphore.acquire();
            collection = map.values();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return collection;
    }

    @Override
    public Set<Entry> entrySet() {
        Set<Entry> entrySet = null;
        try {
            semaphore.acquire();
            entrySet = map.entrySet();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return entrySet;
    }
}
