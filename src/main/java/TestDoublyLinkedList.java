import libraries.DoublyLinkedList;

import java.util.Scanner;

public class TestDoublyLinkedList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("----------------Двусвязный список----------------");
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        System.out.println("Добавьте пять элементов(типа Integer) в список.");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Введите произвольный элемент №" + i + ": ");
            list.add(scan.nextInt());
        }
        System.out.print("Получившийся список:");
        for (Integer value : list) {
            System.out.print(" " + value);
        }
        System.out.println();
        System.out.println();


        System.out.println("Теперь удалим пару элементов из списка (по значению).");
        for (int i = 1; i <= 2; i++) {
            System.out.print("Введите число из списка, которое хотите удалить: ");
            list.remove((Integer)scan.nextInt());
        }
        System.out.print("Получившийся список:");
        for (Integer value : list) {
            System.out.print(" " + value);
        }
        System.out.println();
        System.out.println();


        System.out.println("Теперь удалим пару элементов из списка (по индексу).");
        for (int i = 1; i <= 2; i++) {
            System.out.print("Введите индекс элемента, который хотите удалить: ");
            list.remove(scan.nextInt());
        }
        System.out.print("Получившийся список:");
        for (Integer value : list) {
            System.out.print(" " + value);
        }
        System.out.println();
        System.out.println();


        System.out.println("Теперь заменим оставшийся элемент на какой-либо другой");
        int index;
        System.out.print("Введите индекс элемента, который хотите изменить: ");
        index = scan.nextInt();
        System.out.print("Введите новое значение элемента: ");
        list.set(index, (Integer)scan.nextInt());
        System.out.print("Получившийся список:");
        for (Integer v : list) {
            System.out.print(" " + v);
        }
    }
}
