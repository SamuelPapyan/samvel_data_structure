package dataStructure;
import java.util.ArrayList;

public class MyHashMap<K, V> {
    private class Bucket<K, V> {
        K key;
        V value;
        Bucket next;

        public Bucket(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private Bucket<K, V>[] bucketArray = new Bucket[16];

    public void put(K key, V value) {
        int hashCoder = key.hashCode();
        int index = (bucketArray.length - 1) & hashCoder;
        if (bucketArray[index] != null) {
            Bucket<K, V> bucket = bucketArray[index];
            while (bucket.next != null) {
                bucket = bucket.next;
            }
            bucket.next = new Bucket(key, value);
        } else {
            bucketArray[index] = new Bucket(key, value);
        }
    }

    public V get(K key) {
        int hashCoder = key.hashCode();
        int index = (bucketArray.length - 1) & hashCoder;
        if (bucketArray[index] != null){
            Bucket<K, V> bucket = bucketArray[index];
            do{
                if (bucket.key.hashCode() == key.hashCode())
                    return bucket.value;
                bucket = bucket.next;
            }while(bucket.key.hashCode() != key.hashCode() && bucket != null);
        }
        return null;
    }
}