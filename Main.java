import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Alice", 70000));
        employees.add(new Employee(1, "Bob", 50000));
        employees.add(new Employee(2, "Charlie", 60000));

        System.out.println("Original List:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sort by ID (using Comparable)
        Collections.sort(employees);
        System.out.println("\nSorted by ID:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sort by Name (using Comparator)
        Collections.sort(employees, new NameComparator());
        System.out.println("\nSorted by Name:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sort by Salary (using Comparator)
        Collections.sort(employees, new SalaryComparator());
        System.out.println("\nSorted by Salary:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
