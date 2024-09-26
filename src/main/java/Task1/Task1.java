package Task1;

import java.util.*;


/**
Задание No1. Работа с массивом.
Заполните массив (тип элементов “int”) случайными числами и
выполните задание в соответствии со своим вариантом.
Варианты задания.

2. Найти минимальное значение по модулю в массиве.

Входные данные: количество элементов в формируемом массиве n [0, ∞)
 **/
public class Task1 {
    public static void main(String[] args) {

        int sizeOfArray = getSizeOfArray();

        int[] array = fillArrayWithRandomInts(sizeOfArray);

        printArray(array);

        int min = new MinimumCalculator().getMinimumNumber(array);
        System.out.println("\nМинимальное число по модулю: " + min);
    }

    /**
    Вывод содержания массива в консоль
     **/
    private static void printArray(int[] array) {
        System.out.print("Массив: [");
        for(int number : array){
            System.out.print(number + " ");
        }
        System.out.print("]");
    }
    /**
     Заполнение массива
    **/
    private static int[] fillArrayWithRandomInts(int sizeOfArray) {
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = new Random().nextInt(200) - 100;
        }
        return array;
    }
    /**
     считываем с консоли количество элементов в массиве
     **/
    private static int getSizeOfArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов, которым рандомно заполнится массив: ");
        return scanner.nextInt();
    }
}
