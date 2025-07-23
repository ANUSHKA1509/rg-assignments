package org.example.controller;

import org.example.model.Employee;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    public Employee save(@RequestBody Employee emp) {
        return service.save(emp);
    }

    @GetMapping("/{id}")
    public Employee get(@PathVariable int id) {
        return service.getById(id);
    }

    @GetMapping
    public List<Employee> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.deleteById(id);
    }
}
