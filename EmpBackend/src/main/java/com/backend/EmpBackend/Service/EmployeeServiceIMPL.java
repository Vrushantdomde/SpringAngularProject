package com.backend.EmpBackend.Service;

import com.backend.EmpBackend.DTO.EmployeeAddDTO;
import com.backend.EmpBackend.DTO.EmployeeDTO;
import com.backend.EmpBackend.EmployeeRepo.EmployeeRepo;
import com.backend.EmpBackend.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeServiceIMPL implements EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public String addEmployee(EmployeeAddDTO employeeAddDTO) {

        Employee employee = new Employee(
                employeeAddDTO.getEmployee_name(),
                employeeAddDTO.getEmployee_email(),
                employeeAddDTO.getEmployee_phone(),
                employeeAddDTO.getEmployee_address(),
                employeeAddDTO.getEmployee_department(),
                employeeAddDTO.getEmployee_jobTitle(),
                employeeAddDTO.getEmployee_manager(),
                employeeAddDTO.getEmployee_hireDate()
        );
        employeeRepo.save(employee);
        return String.valueOf(employee.getEmployee_id());
    }

    @Override
    public List<EmployeeDTO> getAllEmployee() {
        List<Employee> employees = employeeRepo.findAll();
        List<EmployeeDTO> employeeDTOList = new ArrayList<>();

        for (Employee employee : employees){
            EmployeeDTO employeeDTO = new EmployeeDTO(
                    employee.getEmployee_id(),
                    employee.getEmployee_name(),
                    employee.getEmployee_email(),
                    employee.getEmployee_phone(),
                    employee.getEmployee_address(),
                    employee.getEmployee_department(),
                    employee.getEmployee_jobTitle(),
                    employee.getEmployee_manager(),
                    employee.getEmployee_hireDate()
            );
            employeeDTOList.add(employeeDTO);
        }
        return employeeDTOList;
    }

    @Override
    public List<EmployeeDTO> getEmployeesByDept(String dept) {
        List<Employee> employees =  employeeRepo.findAll();
        List<EmployeeDTO> employeeDTOList = new ArrayList<>();
        for (Employee employee : employees){
            String Empdept = employee.getEmployee_department();
            if(dept.equals(Empdept)){
                EmployeeDTO employeeDTO = new EmployeeDTO(
                        employee.getEmployee_id(),
                        employee.getEmployee_name(),
                        employee.getEmployee_email(),
                        employee.getEmployee_phone(),
                        employee.getEmployee_address(),
                        employee.getEmployee_department(),
                        employee.getEmployee_jobTitle(),
                        employee.getEmployee_manager(),
                        employee.getEmployee_hireDate()
                );
                employeeDTOList.add(employeeDTO);
            }
        }
        return employeeDTOList;
    }

    @Override
    public List<EmployeeDTO> getEmployeesByJob(String Job) {
        List<Employee> employees =  employeeRepo.findAll();
        List<EmployeeDTO> employeeDTOList = new ArrayList<>();
        for (Employee employee : employees){
            String EmpJob = employee.getEmployee_jobTitle();
            if(Job.equals(EmpJob)){
                EmployeeDTO employeeDTO = new EmployeeDTO(
                        employee.getEmployee_id(),
                        employee.getEmployee_name(),
                        employee.getEmployee_email(),
                        employee.getEmployee_phone(),
                        employee.getEmployee_address(),
                        employee.getEmployee_department(),
                        employee.getEmployee_jobTitle(),
                        employee.getEmployee_manager(),
                        employee.getEmployee_hireDate()
                );
                employeeDTOList.add(employeeDTO);
            }
        }
        return employeeDTOList;
    }

    @Override
    public List<EmployeeDTO> getEmployeesByManager(String Manager) {
        List<Employee> employees =  employeeRepo.findAll();
        List<EmployeeDTO> employeeDTOList = new ArrayList<>();
        for (Employee employee : employees){
            String EmpManager = employee.getEmployee_manager();
            if(Manager.equals(EmpManager)){
                EmployeeDTO employeeDTO = new EmployeeDTO(
                        employee.getEmployee_id(),
                        employee.getEmployee_name(),
                        employee.getEmployee_email(),
                        employee.getEmployee_phone(),
                        employee.getEmployee_address(),
                        employee.getEmployee_department(),
                        employee.getEmployee_jobTitle(),
                        employee.getEmployee_manager(),
                        employee.getEmployee_hireDate()
                );
                employeeDTOList.add(employeeDTO);
            }
        }
        return employeeDTOList;
    }
}

//    private int employee_id;
//    private String employee_name;
//    private String employee_email;
//    private String employee_phone;
//    private String employee_address;
//    private String employee_department;
//    private String employee_jobTitle;
//    private String employee_manager;
//    private Date employee_hireDate;
