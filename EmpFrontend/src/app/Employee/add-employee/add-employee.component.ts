import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent {
  FormData!: FormGroup;

  constructor(
    private builder: FormBuilder,
    private employeeService: EmployeeService
  ) { }

  ngOnInit() {
    this.reset();
  }

  reset() {
    this.FormData = this.builder.group({
      employee_name: new FormControl(''),
      employee_email: new FormControl(''),
      employee_phone: new FormControl(''),
      employee_address: new FormControl(''),
      employee_department: new FormControl(''),
      employee_jobTitle: new FormControl(''),
      employee_manager: new FormControl(''),
      employee_hireDate: new FormControl('')
    });
  }

  onSubmit(formData: any) {
    this.employeeService.addEmployee(formData)
      .subscribe(
        (res) => {
          console.log(res);
          alert("Employee Added Successfully");
            location.href="/employees";
          setTimeout(() => {
            this.reset();        
          }, 2000);
        }
      );
  }

}
