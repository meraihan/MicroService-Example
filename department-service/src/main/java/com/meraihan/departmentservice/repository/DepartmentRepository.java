package com.meraihan.departmentservice.repository;

import com.meraihan.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Sayed Mahmud Raihan
 * @Project department-service
 * @Created 01/07/2021
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findByDepartmentId(Long departmentId);
}
