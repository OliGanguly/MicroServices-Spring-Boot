package com.microservicesbyoli.employeeservice.repo;

import com.microservicesbyoli.employeeservice.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpRepo {
    private List<Employee> employees = new ArrayList<>();
     public Employee addEmployee(Employee employee){
        employees.add(employee);
        return employee;
     }
      public List<Employee> findAllEmp(){
         return employees;
      }
      public Employee findById(Long id){
         return employees.stream().filter(a->a.id().equals(id))
                 .findFirst()
                 .orElseThrow();
      }
      //filetr based on dept
     public List<Employee> findByDept(Long department){
         return  employees.stream().
                 filter(a->a.departmentId().equals(department)).
                 toList();
     }
}
