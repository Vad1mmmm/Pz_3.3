package pz_my_linked_list;

public class mainLinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        System.out.println("=== Додавання елементів ===");
        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(5);
        list.addLast(40);
        list.add(2, 15);
        printList(list);

        System.out.println("\n=== Отримання елементів ===");
        System.out.println("Перший елемент: " + list.getFirst());
        System.out.println("Останній елемент: " + list.getLast());
        System.out.println("Елемент з індексом 3: " + list.get(3));

        System.out.println("\n=== Зміна значення елемента ===");
        list.set(2, 99);
        printList(list);

        System.out.println("\n=== Пошук елемента ===");
        System.out.println("Індекс елемента 99: " + list.indexOf(99));
        System.out.println("Індекс елемента 500: " + list.indexOf(500));

        System.out.println("\n=== Видалення елементів ===");
        System.out.println("Видалено з початку: " + list.removeFirst());
        System.out.println("Видалено з кінця: " + list.removeLast());
        System.out.println("Видалено елемент з індексом 2: " + list.remove(2));
        printList(list);

        System.out.println("\nРозмір списку: " + list.size());
    }

    private static void printList(MyLinkedList list) {
        System.out.print("Список: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
