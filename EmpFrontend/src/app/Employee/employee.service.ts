import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {


  constructor(private http: HttpClient) { }

  addEmployee(data : any):Observable<any>{
    return this.http.post("http://127.0.0.1:8083/api/employee/add",data);
  }

  getAllEmployee(): Observable<any[]> {
    return this.http.get<any[]>("http://127.0.0.1:8083/api/employee/getAllEmployee");
  }

  getAllEmployeeByDept(dept : String): Observable<any[]> {
    return this.http.get<any[]>(`http://127.0.0.1:8083/api/employee/getEmployeeByDept/${dept}`);
  }

  getAllEmployeeByManager(manager : String): Observable<any[]> {
    return this.http.get<any[]>(`http://127.0.0.1:8083/api/employee/getEmployeeByManager/${manager}`);
  }

  getAllEmployeeByJob(job : String): Observable<any[]> {
    return this.http.get<any[]>(`http://127.0.0.1:8083/api/employee/getEmployeeByJob/${job}`);
  }
}
