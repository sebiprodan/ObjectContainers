package siit.homework.CMS;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CompanyManagementSystem {

    public static void main(String[] args) {

        Set<Employee> employeesSet = new TreeSet<Employee>(new SeniorityComparator());

        employeesSet.add(new Employee("Sebastian", "Manager", 8, true));
        employeesSet.add(new Employee("Bianca", "junior software developer", 1.5, false));
        employeesSet.add(new Employee("Victor", "junior software developer", 2, false));
        employeesSet.add(new Employee("Filip", "expert software developer", 12, false));

        for (Employee employee : employeesSet) {
            System.out.println(employee);
        }
    }
}
