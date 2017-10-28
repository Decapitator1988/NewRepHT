package HometaskNumber25.Interfaces;

import HometaskNumber25.logic.Department;
import HometaskNumber25.logic.Employee;

public interface EmployeeManager {
         void addEmployee(Employee employee);
         void removeEmployee(Employee employee);
         Employee getEmployee(String employee);
         Employee[] getAllEmployees();
         Employee[] getAllEmployees(Department department);
         void addSalary(String name, long salary );
    }


