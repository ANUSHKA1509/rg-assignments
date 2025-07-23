package org.example.service;

import org.example.model.Employee;
import org.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public Employee save(Employee employee) {
        return repo.save(employee);
    }

    public Employee getById(int id) {
        return repo.findById(id).orElse(null);
    }

    public List<Employee> getAll() {
        return repo.findAll();
    }

    public void deleteById(int id) {
        repo.deleteById(id);
    }
}
