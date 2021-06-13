package com.jackiedecodes.employeemanager.repo;

import com.jackiedecodes.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
