package com.microservicesbyoli.departmentservice.repo;

import com.microservicesbyoli.departmentservice.model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DeptRepo {

    //we can fetch data from database as well
    private List<Department> departments = new ArrayList<>();
    public Department addDepartment(Department department){
        departments.add(department);
        return department;
    }
 public Department findById(Long id){
   return departments.stream().
           filter(department -> department.getId().equals(id)).
           findFirst().
           orElseThrow();
 }

 public List<Department> findAll(){
        return departments;
 }


}
