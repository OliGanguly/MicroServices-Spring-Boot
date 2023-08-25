package com.microservicesbyoli.employeeservice.controller;

import com.microservicesbyoli.employeeservice.model.Employee;
import com.microservicesbyoli.employeeservice.repo.EmpRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmpRepo empRepo;
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @PostMapping("/add")
    public Employee add(@RequestBody Employee employee){
        LOGGER.info("Employee : add {} "+employee);
        empRepo.addEmployee(employee);
        return employee;

    }
    @GetMapping
    public List<Employee> findAll(){
        LOGGER.info("Found ALL EMP");
        return empRepo.findAllEmp();
    }
    @GetMapping("/{id}")
    public Employee findOne(@PathVariable("id") Long id)
    {
        LOGGER.info("get by id");
        return empRepo.findById(id);
    }
    @GetMapping("/department/{departmentId}")
    public List<Employee> findDeptWise(@PathVariable("departmentId") Long departmentId){
        LOGGER.info("Employee: find :by departmentId");
        return empRepo.findByDept(departmentId);
    }
}
