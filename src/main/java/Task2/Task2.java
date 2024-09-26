package Task2;

import java.util.*;

/**
2. Заполните список (тип “ArrayList<Double>”) случайным числами и
отсортируйте его. Метод сортировки выбирается в соответствии с вашим
вариантом. Сортировку необходимо реализовать вручную (не использовать
встроенные возможности Java или сторонних библиотек).

2. Быстрая сортировка (Quick Sort).

Входные данные: количество элементов в формируемом массиве n [0, ∞).
 **/
public class Task2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        fillingList(list);
        System.out.println("До сортировки: " + list);
        quickSort(list, 0, list.size() - 1);
        System.out.println("После сортировки: " + list);
    }



    /**
     * Реализация быстрой сортировки
     *
     * @param list
     * @param low
     * @param high
     */
    public static void quickSort(ArrayList<Integer> list, int low, int high) {
        if(low > high) return;
        int pi = partition(list, low, high);

        quickSort(list, low, pi - 1);
        quickSort(list, pi+1, high);

    }

    /**
     * Реализация разделения списков в быстрой сортировке
     *
     * @param list
     * @param low
     * @param high
     * @return
     */
    private static int partition(ArrayList<Integer> list, int low, int high) {
        int pivot = list.get(high);
        int ptr = low - 1;
        for (int i = low; i < high; i++) {
            if(list.get(i) < pivot){
                ptr++;
                Collections.swap(list, ptr, i);
            }

        }
        Collections.swap(list, ptr + 1, high);
        return ptr + 1;
    }

    /**
     * Инициализация списка
     * @param list
     */
    private static void fillingList(ArrayList<Integer> list) {
        System.out.print("Введите количество элементов в списке: ");
        int countOfElemInList = new Scanner(System.in).nextInt();
        System.out.println("Введите через enter числа для сортировки");
        for (int i = 0; i < countOfElemInList; i++) {
            list.add(new Scanner(System.in).nextInt());
        }
    }

}
