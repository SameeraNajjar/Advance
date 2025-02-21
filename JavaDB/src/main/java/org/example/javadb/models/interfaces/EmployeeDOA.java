package org.example.javadb.models.interfaces;

import org.example.javadb.models.Employee;

public interface EmployeeDOA {
    public void save(Employee employee);
    public void update(Employee employee);
    public void delete (Employee employee);
    public <List> java.util.List<Employee> getAll();
    public void findEmployee(Employee employee);

}
