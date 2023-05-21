public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(10); // Создание экземпляра HashSet с емкостью 10
        set.add("apple"); // Добавление элемента "apple"
        set.add("banana"); // Добавление элемента "banana"
        set.add("orange"); // Добавление элемента "orange"

        System.out.println("Set contains 'apple': " + set.contains("apple")); // Проверка наличия элемента "apple"
        System.out.println("Set contains 'grape': " + set.contains("grape")); // Проверка наличия элемента "grape"

        set.remove("banana"); // Удаление элемента "banana"
        System.out.println("Set contains 'banana': " + set.contains("banana")); // Проверка наличия элемента "banana"

        System.out.println("Set size: " + set.size());
    }
}