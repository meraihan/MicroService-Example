package com.meraihan.departmentservice.service;

import com.meraihan.departmentservice.entity.Department;
import com.meraihan.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Sayed Mahmud Raihan
 * @Project department-service
 * @Created 01/07/2021
 */
@Slf4j
@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;


    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside findDepartmentById of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
