package com.example.department;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    void saveDepartment(@RequestBody Department department) {
        log.info("inside the save department controller");
        departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    Department getDepartmentById(@PathVariable String id) {
        log.info("inside the get department controller");
        return departmentService.getDepartmentById(id);
    }
}
