import { Component, ViewChild } from '@angular/core';
import { MatSort } from '@angular/material/sort';
import { MatTableDataSource } from '@angular/material/table';
import { EmployeeService } from 'src/app/Employee/employee.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {
  employee_department!:String;
  employee_jobTitle!:String;
  employee_manager!:String;

  displayedColumns: string[] = [ 'employee_id', 'employee_name', 'employee_email','employee_phone', 'employee_address', 'employee_department','employee_jobTitle', 'employee_manager', 'employee_hireDate'];
  dataSource = new MatTableDataSource<any>();
  @ViewChild(MatSort) sort!: MatSort;

  constructor(private employeeService : EmployeeService){

  }

  ngOnInit() {
    this.employeeService.getAllEmployee().subscribe(data => {
      this.dataSource.data = data;
      this.dataSource = new MatTableDataSource(data);
      this.dataSource.sort = this.sort;
    });
  }

  filterByDepartment(){
    this.employeeService.getAllEmployeeByDept(this.employee_department).subscribe(data => {
      this.dataSource.data = data;
      this.dataSource = new MatTableDataSource(data);
      this.dataSource.sort = this.sort;
      console.log(this.dataSource.data)
    });
    this.employee_manager="";
    this.employee_jobTitle="";
  }

  filterByJob(){
    this.employeeService.getAllEmployeeByJob(this.employee_jobTitle).subscribe(data => {
      this.dataSource.data = data;
      this.dataSource = new MatTableDataSource(data);
      this.dataSource.sort = this.sort;
    });
    this.employee_department="";
    this.employee_manager="";
  }

  filterByManager(){
    this.employeeService.getAllEmployeeByManager(this.employee_manager).subscribe(data => {
      this.dataSource.data = data;
      this.dataSource = new MatTableDataSource(data);
      this.dataSource.sort = this.sort;
    });
    this.employee_department="";
    this.employee_jobTitle="";
  }


}
