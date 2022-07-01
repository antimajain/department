package com.example.department;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    void saveDepartment(Department department) {

        log.info("inside the save department method");
        departmentRepository.save(department);
    }

    Department getDepartmentById(String id) {
        log.info("inside the get department method");
        return departmentRepository.findById(id).orElse(null);
    }

}
