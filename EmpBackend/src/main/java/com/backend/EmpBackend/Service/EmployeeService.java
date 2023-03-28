package com.backend.EmpBackend.Service;

import com.backend.EmpBackend.DTO.EmployeeAddDTO;
import com.backend.EmpBackend.DTO.EmployeeDTO;

import java.util.List;


public interface EmployeeService {
    String addEmployee(EmployeeAddDTO employeeAddDTO) ;

    List<EmployeeDTO> getAllEmployee();

    List<EmployeeDTO> getEmployeesByDept(String dept);

    List<EmployeeDTO> getEmployeesByJob(String Job);

    List<EmployeeDTO> getEmployeesByManager(String manager);
}
