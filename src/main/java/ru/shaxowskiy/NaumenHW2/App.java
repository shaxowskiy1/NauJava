package ru.shaxowskiy.NaumenHW2;

import Task1.Task1;
import Task2.Task2;
import Task3.Task3;
import Task4.Task4;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException {
        System.out.println("Задание 1");
        Task1.main(args);

        System.out.println("Задание 2");
        Task2.main(args);

        System.out.println("Задание 3");
        Task3.main(args);

        System.out.println("Задание 4");
        Task4.main(args);
    }
}
