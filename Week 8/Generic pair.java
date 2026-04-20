class Pair<K, V> {
    private K key;
    private V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }
}

public class Task3 {
    public static void main(String[] args) {
        Pair<Integer, String> student = new Pair<>(1, "Talha");
        System.out.println("ID: " + student.getKey() + ", Name: " + student.getValue());
    }
}
