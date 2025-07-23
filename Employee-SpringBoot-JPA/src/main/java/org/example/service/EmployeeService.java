package org.example.service;

import org.example.model.Employee;
import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);
    Employee getById(int id);
    List<Employee> getAll();
    void deleteById(int id);
}
