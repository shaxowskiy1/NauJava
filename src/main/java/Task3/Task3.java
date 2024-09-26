package Task3;

import java.util.ArrayList;
import java.util.Collections;

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

        Employee em1 = new Employee("Иван Иванов", 30, "Инженерия", 60000);
        Employee em2 = new Employee("Мария Петрова", 28, "Маркетинг", 55000);
        Employee em3 = new Employee("Сергей Смирнов", 35, "Разработка", 75000);
        Employee em4 = new Employee("Алена Сидорова", 25, "HR", 48000);
        Employee em5 = new Employee("Дмитрий Федоров", 40, "Финансы", 80000);

        Collections.addAll(employees, em1, em2, em3, em4, em5);

    Double sum = employees.stream()
            .mapToDouble(Employee::getSalary)
            .reduce(0.0, Double::sum);

        System.out.println(sum);
    }


}
