import java.util.*;
import java.util.stream.Collectors;
public class EmployeeTask {
  static class Employee {
      private String name;
      private int age;
      private double salary;
      private String department;
      private String city;
      //constructor
      public Employee(String name,int age,double salary,String department,String city) {
          this.name=name;
          this.age=age;
          this.salary=salary;
          this.department=department;
          this.city=city;
      }
      //setters
      public void setAge(int age) {
          this.age = age;
      }
      public void setSalary(double salary) {
          this.salary = salary;
      }
      public void setCity(String city) {
          this.city = city;
      }
      public void setName(String name) {
          this.name = name;
      }
      public void setDepartment(String department) {
          this.department = department;
      }
      //getters
      public String getName() {
          return name;
      }
      public int getAge() {
          return age;
      }
      public double getSalary() {
          return salary;
      }
      public String getDepartment() {
          return department;
      }
      public String getCity() {
          return city;
      }
  }
  public static void main(String[] args){
      List<Employee> employees = List.of(
              new Employee("Alex",34,63000,"Engineering","NewYork"),
              new Employee("Marina",43,100000,"Engineering","NewYork"),
              new Employee("Hasan",23,50000,"Sales","NewYork"),
              new Employee("Elizabeth",22,50000,"Sales","NewYork"),
              new Employee("Kim",60,70000,"Finance","NewYork"),
              new Employee("Safa",56,40000,"HR","NewYork"),
              new Employee("Ahmad",43,60000,"HR","NewYork"),
              new Employee("Merry",32,35000,"Production","SanFransisco"),
              new Employee("Saeed",54,43000,"Production","SanFransisco")
      );
      //Q1
      System.out.println("Employees who work in the Sales department:");
      employees.stream()
              .filter(employee -> employee.getDepartment().equals("Sales"))
              .forEach(employee -> System.out.println(employee.getName() + " - " + employee.getAge()));
      //Q2
      System.out.println("Employees earning more than 50,000:");
      employees.stream()
              .filter(employee -> employee.getSalary() > 50000)
              .forEach(emp -> System.out.println(emp.getName() + " - " + emp.getSalary()));
      //Q3
      System.out.println("list of employees for each city:");
      Map<String, List<Employee>> employeesByCity = employees.stream()
              .collect(Collectors.groupingBy(Employee::getCity));

      employeesByCity.forEach((city, employeeList) -> {
          System.out.println(city + ": ");
          employeeList.forEach(employee -> System.out.println(employee.getName()));
      });
      //Q4
      System.out.println("Top 5 highest-paid employees:");
      employees.stream()
              .sorted((employee1, employee2) -> Double.compare(employee2.getSalary(), employee1.getSalary()))
              .limit(5)
              .forEach(employee -> System.out.println(employee.getName() +"  " + employee.getSalary()));
      //Q5
      System.out.println("Average Salary of Employees in the Engineering Department:");
      double averageSalary = employees.stream()
              .filter(employee -> employee.getDepartment().equals("Engineering"))
              .mapToDouble(Employee::getSalary)
              .average()
              .orElse(0);
      System.out.println("Average Salary in Engineering: " + averageSalary);
  }
}