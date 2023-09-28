import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) {
        // Создание объекта WeakHashMap
        WeakHashMap<Key, Value> weakHashMap = new WeakHashMap<>();

        // Создание ключей
        Key key1 = new Key("key1");
        Key key2 = new Key("key2");

        // Создание и добавление значений
        Value value1 = new Value("value1");
        Value value2 = new Value("value2");
        weakHashMap.put(key1, value1);
        weakHashMap.put(key2, value2);

        // Вывод содержимого WeakHashMap
        System.out.println("Содержимое WeakHashMap до сборки мусора:");
        System.out.println(weakHashMap);

        // Удаление ссылок на ключи
        key1 = null;
        key2 = null;

        // Принудительная сборка мусора
        System.gc();

        // Небольшая пауза для сборки мусора
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Вывод содержимого WeakHashMap после сборки мусора
        System.out.println("Содержимое WeakHashMap после сборки мусора:");
        System.out.println(weakHashMap);
    }
}
