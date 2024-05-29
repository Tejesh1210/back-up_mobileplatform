package April17thAssignments;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
       
        int salaryComparison = Double.compare(e1.getSalary(), e2.getSalary());
        
        if (salaryComparison == 0) {
            return e1.getName().compareTo(e2.getName());
        }
        
        return salaryComparison;
    }
}


public class EmployeeComparatorSorting {
    public static void main(String[] args) {
        List<Employee> e = new ArrayList<>();
        e.add(new Employee("narine", 450000));
        e.add(new Employee("shreyas", 40000));
        e.add(new Employee("jaya", 59000));
        e.add(new Employee("max", 52000)); 
        
       
        Collections.sort(e, new EmployeeComparator());
        
        
        for (Employee emp : e) {
            System.out.println(emp);
        }
    }
}