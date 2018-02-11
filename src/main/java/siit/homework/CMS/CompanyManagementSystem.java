package siit.homework.CMS;

import siit.homework.PersonSortNameAge.*;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CompanyManagementSystem {


    public static void main(String[] args) {

        Set<Employee> employeesSet = new TreeSet<Employee>(new EmployeeNameComparator());

        employeesSet.add(new Employee("Sebastian Prodan", "Manager", 8, true));
        employeesSet.add(new Employee("Bianca Prodan", "junior software developer", 2, false));
        employeesSet.add(new Employee("Victor Dumitrescu", "junior software developer", 0.5, false));
        employeesSet.add(new Employee("Filip Paunovici", "expert software developer", 11, false));
        employeesSet.add(new Employee("Victor Prodan", "expert software developer", 8, false));

        Set<Employee> noParking = new TreeSet<Employee>(new SeniorityComparator());
        for (Employee employee : employeesSet) {
            if (employee.parking == false) {
                noParking.add(employee);
            }
        }
        for (Employee employee : noParking) {
            System.out.println(employee);
        }
        System.out.println("*******************************************************");


        Set<Employee> juniorDevelopers = new TreeSet<Employee>(new EmployeeNameComparator());
        Set<Employee> expertDevelopers = new TreeSet<Employee>(new EmployeeNameComparator());
        Set<Employee> managers = new TreeSet<Employee>(new EmployeeNameComparator());

        for (Employee employee : employeesSet) {
            if (employee.role == "junior software developer") {
                juniorDevelopers.add(employee);
            } else if (employee.role == "expert software developer") {
                expertDevelopers.add(employee);
            } else if (employee.role == "Manager") {
                managers.add(employee);
            }
        }

            for (Employee employee : juniorDevelopers) {
                System.out.println(employee);
            }
            System.out.println("*******************************************************");

            for (Employee employee : expertDevelopers) {
                System.out.println(employee);
            }
            System.out.println("*******************************************************");

            for (Employee employee : managers) {
                System.out.println(employee);
            }
            System.out.println("*******************************************************");
        }
    }
