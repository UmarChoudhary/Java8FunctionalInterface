package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}

public class Salary {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 3500));
        employees.add(new Employee("Bob", 2500));
        employees.add(new Employee("Charlie", 4000));
        
        
        // Predicate to test if salary is greater than 3000
        Predicate<Employee> salaryPredicate = e -> e.getSalary() > 3000;
        
        
        // Print employees with salary greater than 3000
        for (Employee e : employees) {
            if (salaryPredicate.test(e)) {
                System.out.println(e);
            }
        }
    }
}
		
//		Predicate <String> p= e->e.salary>3000;
//		for (Employee e1: l)
//		{
//			if(p.test(e1)) ->
//			{
//				System.out.println(e1);
//			}
