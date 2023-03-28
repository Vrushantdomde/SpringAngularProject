import { Component } from '@angular/core';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.css']
})
export class EmployeesComponent {

  EmployeesList : any[] = [];
  
  constructor(private employeeService : EmployeeService){

  }

  ngOnInit(){
    this.getAllEmployees();
  }

  getAllEmployees(){
    this.employeeService.getAllEmployee()
    .subscribe((employees) => {
      console.log(employees);
      this.EmployeesList = employees;
    })
  }
}
