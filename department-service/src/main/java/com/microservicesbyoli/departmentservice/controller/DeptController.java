package com.microservicesbyoli.departmentservice.controller;

import com.microservicesbyoli.departmentservice.model.Department;
import com.microservicesbyoli.departmentservice.repo.DeptRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DeptController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DeptController.class);
    @Autowired
    private DeptRepo deptRepo;
    @PostMapping("/add")
    public Department add(@RequestBody Department department){
        LOGGER.info("DepartmentAdded :{}",department);
        return deptRepo.addDepartment(department);
    }
    @GetMapping
    public List<Department> all(){
        LOGGER.info("Department Found");
        return deptRepo.findAll();
    }
    @GetMapping("/{id}")
    public Department findById(@PathVariable Long id){
        LOGGER.info("Single department found by Id");
//        System.out.println("idddddddddddd"+id);
        return deptRepo.findById(id);
    }
}
