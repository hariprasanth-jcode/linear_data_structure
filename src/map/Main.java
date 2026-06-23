package map;

public class Main {


    public static void main(String[] args) {
        MyHashMap map = new MyHashMap(5);

        map.put("apple", 10);
        map.put("banana", 20);
        map.put("mango", 30);
        map.put("cat", 5);

        map.put("apple", 50);

        map.display();

        System.out.println("Value for apple: " + map.get("apple"));
        System.out.println("Value for orange: " + map.get("orange"));
    }
}
