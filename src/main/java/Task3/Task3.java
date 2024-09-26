package Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * Необходимо обработать список с использованием Stream API.
 * Задание состоит из нескольких этапов.
 * 1. . Необходимо реализовать java-класс сотрудник (код “Employee”).
 * Приватные поля класса: ФИО (“fullName” тип “String”), Возраст (“age”
 * тип “Integer”), Отдел (“department” тип “String”), З/П (“salary” тип
 * “Double”). Класс должен содержать геттеры и сеттеры для доступа к
 * полям.
 * 2. Необходимо реализовать предзаполненный список (тип
 * “ArrayList<Employee>”) с объектами класса “Employee”, по которым будем
 * выполняться задание. Необходимо создать не менее 5 элементов списка.
 * 3. Выполнить задание в соответствии с вашим вариантом. При
 * выполнении задания необходимо использовать возможности Stream API!
 * Варианты заданий.
 *
 * 2. Найти среднюю зарплату всех сотрудников отдела в указанном
 * департаменте.
 *
 * Выходные данные: в консоль напечатан результат выполнения задания.
 * Объекты должны быть напечатаны в читаемом виде
 */
public class Task3 {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        Stream.of(

                new Employee("Иван Иванов", 30, "Инженерия", 60000),
                new Employee("Мария Петрова", 28, "Маркетинг", 55000),
                new Employee("Сергей Смирнов", 35, "Разработка", 75000),
                new Employee("Алена Сидорова", 25, "HR", 48000),
                new Employee("Дмитрий Федоров", 40, "Финансы", 80000)
    ).forEach(employees::add);

    Double ave = employees.stream()
            .mapToDouble(Employee::getSalary)
            .average()
            .orElse(0);

        System.out.println(ave);

    }


}
