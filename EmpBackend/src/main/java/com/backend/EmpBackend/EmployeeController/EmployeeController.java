package com.backend.EmpBackend.EmployeeController;


import com.backend.EmpBackend.DTO.EmployeeAddDTO;
import com.backend.EmpBackend.DTO.EmployeeDTO;
import com.backend.EmpBackend.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/employee")
public class    EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(path = "/add")
    public String addEmployee(@RequestBody EmployeeAddDTO employeeAddDTO){
        String id= employeeService.addEmployee(employeeAddDTO);
        return id;
    }

    @GetMapping(path = "/getAllEmployee")
    public List<EmployeeDTO> getAllEmployee(){
        List<EmployeeDTO> employees= employeeService.getAllEmployee();
        return employees;
    }

    @GetMapping(path="/getEmployeeByDept/{dept}")
    public List<EmployeeDTO> getEmployeeByDept(@PathVariable(value = "dept") String dept){
        System.out.println(dept);
        List<EmployeeDTO> employees = employeeService.getEmployeesByDept(dept);
        return employees;
    }

    @GetMapping(path="/getEmployeeByManager/{manager}")
    public List<EmployeeDTO> getEmployeeByManager(@PathVariable(value = "manager") String manager){
        System.out.println(manager);
        List<EmployeeDTO> employees = employeeService.getEmployeesByManager(manager);
        return employees;
    }

    @GetMapping(path="/getEmployeeByJob/{job}")
    public List<EmployeeDTO> getEmployeeByJob(@PathVariable(value = "job") String job){
        System.out.println(job);
        List<EmployeeDTO> employees = employeeService.getEmployeesByJob(job);
        return employees;
    }
}
