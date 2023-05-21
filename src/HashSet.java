import java.util.ArrayList;
import java.util.List;

public class HashSet<T> {
    private List<T>[] buckets;
    private int capacity;
    private int size;

    @SuppressWarnings("unchecked")
    public HashSet(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.buckets = new ArrayList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    private int getBucketIndex(T element) {
        int hashCode = element.hashCode();
        return Math.abs(hashCode % capacity);
    }

    public void add(T element) {
        int bucketIndex = getBucketIndex(element);
        List<T> bucket = buckets[bucketIndex];
        if (!bucket.contains(element)) {
            bucket.add(element);
            size++;
        }
    }

    public void remove(T element) {
        int bucketIndex = getBucketIndex(element);
        List<T> bucket = buckets[bucketIndex];
        if (bucket.contains(element)) {
            bucket.remove(element);
            size--;
        }
    }

    public int size() {
        return size;
    }

    public boolean contains(T element) {
        int bucketIndex = getBucketIndex(element);
        List<T> bucket = buckets[bucketIndex];
        return bucket.contains(element);
    }
}
