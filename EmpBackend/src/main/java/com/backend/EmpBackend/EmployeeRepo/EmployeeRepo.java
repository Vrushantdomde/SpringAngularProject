package com.backend.EmpBackend.EmployeeRepo;

import com.backend.EmpBackend.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo  extends JpaRepository<Employee,Integer> {
}
