package com.backend.EmpBackend.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="Employee")
public class Employee {

    @Id
    @Column(name = "employee_id",length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employee_id;
    @Column(name = "employee_name",length = 50)
    private String employee_name;
    @Column(name = "employee_email",length = 50)
    private String employee_email;
    @Column(name = "employee_phone",length = 12)
    private String employee_phone;
    @Column(name = "employee_address",length = 75)
    private String employee_address;
    @Column(name = "employee_department",length = 50)
    private String employee_department;
    @Column(name = "employee_jobTitle",length = 50)
    private String employee_jobTitle;
    @Column(name = "employee_manager",length = 50)
    private String employee_manager;
    @Column(name = "employee_hireDate",length = 50)
    private String employee_hireDate;

    public Employee(int employee_id, String employee_name, String employee_email, String employee_phone, String employee_address, String employee_department, String employee_jobTitle, String employee_manager, String employee_hireDate) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_email = employee_email;
        this.employee_phone = employee_phone;
        this.employee_address = employee_address;
        this.employee_department = employee_department;
        this.employee_jobTitle = employee_jobTitle;
        this.employee_manager = employee_manager;
        this.employee_hireDate = employee_hireDate;
    }

    public Employee(String employee_name, String employee_email, String employee_phone, String employee_address, String employee_department, String employee_jobTitle, String employee_manager, String employee_hireDate) {
        this.employee_name = employee_name;
        this.employee_email = employee_email;
        this.employee_phone = employee_phone;
        this.employee_address = employee_address;
        this.employee_department = employee_department;
        this.employee_jobTitle = employee_jobTitle;
        this.employee_manager = employee_manager;
        this.employee_hireDate = employee_hireDate;
    }

    public Employee() {
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_email() {
        return employee_email;
    }

    public void setEmployee_email(String employee_email) {
        this.employee_email = employee_email;
    }

    public String getEmployee_phone() {
        return employee_phone;
    }

    public void setEmployee_phone(String employee_phone) {
        this.employee_phone = employee_phone;
    }

    public String getEmployee_address() {
        return employee_address;
    }

    public void setEmployee_address(String employee_address) {
        this.employee_address = employee_address;
    }

    public String getEmployee_department() {
        return employee_department;
    }

    public void setEmployee_department(String employee_department) {
        this.employee_department = employee_department;
    }

    public String getEmployee_jobTitle() {
        return employee_jobTitle;
    }

    public void setEmployee_jobTitle(String employee_jobTitle) {
        this.employee_jobTitle = employee_jobTitle;
    }

    public String getEmployee_manager() {
        return employee_manager;
    }

    public void setEmployee_manager(String employee_manager) {
        this.employee_manager = employee_manager;
    }

    public String getEmployee_hireDate() {
        return employee_hireDate;
    }

    public void setEmployee_hireDate(String employee_hireDate) {
        this.employee_hireDate = employee_hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", employee_name='" + employee_name + '\'' +
                ", employee_email='" + employee_email + '\'' +
                ", employee_phone='" + employee_phone + '\'' +
                ", employee_address='" + employee_address + '\'' +
                ", employee_department='" + employee_department + '\'' +
                ", employee_jobTitle='" + employee_jobTitle + '\'' +
                ", employee_manager='" + employee_manager + '\'' +
                ", employee_hireDate=" + employee_hireDate +
                '}';
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