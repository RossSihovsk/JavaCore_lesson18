import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Map <K,V> extends MyEntry<K,V> {

    private HashMap<K,V> map;

    public Map(K k, V v) {
        super(k, v);
        this.map = new HashMap<K, V>();
        this.map.put(k, v);
    }

    public void addEntry(K k, V v) {
        map.put(k, v);
    }

    public void removeEntry(K k) {
        map.remove(k);
    }

    public void removeByKey(K k) {

        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Entry<K, V> next = (Entry<K, V>) iterator.next();

            if (next.getKey().equals(k)) {
                next.setValue((V)"");
            }
        }
    }

    public void viewKeys() {

        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Entry<K, V> next = (Entry<K, V>) iterator.next();

            System.out.println(next.getKey().toString());
        }

        System.out.println();
    }

    public void viewValuesList() {

        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Entry<K, V> next = (Entry<K, V>) iterator.next();

            System.out.println(next.getValue().toString());
        }

        System.out.println();
    }

    public void viewMap() {

        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Entry<K, V> next = (Entry<K, V>) iterator.next();

            System.out.println(next.getKey().toString() + " " + next.getValue().toString());
        }

        System.out.println();
    }

    @Override
    public String toString() {
        return "Map{" +
                "map=" + map +
                '}';
    }
}
