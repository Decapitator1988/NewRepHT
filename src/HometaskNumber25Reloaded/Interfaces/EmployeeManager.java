package HometaskNumber25Reloaded.Interfaces;

import HometaskNumber25Reloaded.Logic.Department;
import HometaskNumber25Reloaded.Logic.Employee;

public interface EmployeeManager {
        public void addEmployee(Employee employee);
        public void removeEmployee(Employee employee);
        public Employee getEmployee(String employee);
        public Employee[] getAllEmployees();
        public Employee[] getAllEmployees(Department department);
        public void addSalary(String name, long salary );
    }


