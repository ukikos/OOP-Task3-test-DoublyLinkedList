import libraries.CycleList;

import java.util.Scanner;

public class TestCycleList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("----------------Циклический список----------------");
        CycleList<String> list = new CycleList<>();
        System.out.println("Добавьте пять элементов(типа String) в список.");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Введите произвольный элемент №" + i + ": ");
            list.add(scan.next());
        }
        System.out.print("Получившийся список:");
        for (String value : list) {
            System.out.print(" " + value);
        }
        System.out.println();
        System.out.println();


        System.out.println("Теперь удалим пару элементов из списка (по значению).");
        for (int i = 1; i <= 2; i++) {
            System.out.print("Введите число из списка, которое хотите удалить: ");
            list.remove(scan.next());
        }
        System.out.print("Получившийся список:");
        for (String value : list) {
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
        for (String value : list) {
            System.out.print(" " + value);
        }
        System.out.println();
        System.out.println();


        System.out.println("Теперь заменим оставшийся элемент на какой-либо другой");
        int index;
        System.out.print("Введите индекс элемента, который хотите изменить: ");
        index = scan.nextInt();
        System.out.print("Введите новое значение элемента: ");
        list.set(index, scan.next());
        System.out.print("Получившийся список:");
        for (String value : list) {
            System.out.print(" " + value);
        }
    }
}
