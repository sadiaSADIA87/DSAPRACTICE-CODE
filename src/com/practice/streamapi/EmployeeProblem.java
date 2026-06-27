package com.practice.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    double salary;
    String department;


   public
   Employee(int id, String name, double salary,String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;

    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
    public class EmployeeProblem {

public  static  void main (String[] args){
    List<Employee> employees = Arrays.asList(new Employee(1,"a" ,5000, "IT"),
            new Employee(2,"b" ,6000,"HR"),
            new Employee(3,"c" ,7000,"IT"));
    //1 highest salary
    Employee highest = employees.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);
System.out.println(highest);
   // 2 secondHighestsalary
    Employee secondHoghest = employees.stream().sorted(Comparator.comparing(Employee::getSalary)
            .reversed()).skip(1).findFirst().orElse(null);
    System.out.println(secondHoghest);
    // 3 group by department
    Map<String , List<Employee>> EmpByDept = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment));
    System.out.println(EmpByDept);
    // 4 count by dept
    Map<String ,Long> countEmpByDept = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
    System.out.println(countEmpByDept);

   // 5 sort by salary asc
    List<Employee> ascSalary = employees.stream()
            .sorted(Comparator.comparingDouble(Employee::getSalary))
            .collect(Collectors.toList());
    System.out.println(ascSalary);
   // 6. sort salary in desc
    List<Employee> descSalary = employees.stream()
            .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
            .collect(Collectors.toList());
    System.out.println(descSalary);
    //7.salary >5000

    List<Employee> highEarn = employees.stream().filter(e->e.getSalary()>5000)
            .collect(Collectors.toList());
    System.out.println(highEarn);



}

    }
