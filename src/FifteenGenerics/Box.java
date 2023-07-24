package FifteenGenerics;

public class Box <K, V> {

//Генерічні класи

    private K key;
    private V value;

    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }


}
