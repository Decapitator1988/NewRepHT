package HometaskNumber25;

import HometaskNumber25.Enums.NameOfDep;
import HometaskNumber25.Interfaces.EmployeeManager;
import HometaskNumber25.logic.Department;
import HometaskNumber25.logic.Employee;
import HometaskNumber25.logic.EmployeeManagerEmp;


public class MainClass {
    public static void main(String[] args) {
        EmployeeManager employeeManagerEmp = new EmployeeManagerEmp();
        init(employeeManagerEmp);

      printAllEmployees(employeeManagerEmp);
            }
    public static void init(EmployeeManager employeeMng){
        Employee emp0 = new Employee(5000, 0, "Lionel Messi");
        Employee emp1 = new Employee(25000, 1, "Cristiano Ronaldo");
        Employee emp2 = new Employee(500000, 2, "Roberto Carlos");
        Employee emp3 = new Employee(565000, 3, "Zinedine Zidane");
        Employee emp4 = new Employee(800, 4, "Artem Milevskiy");

        employeeMng.addEmployee(emp0);
        employeeMng.addEmployee(emp1);
        employeeMng.addEmployee(emp2);
        employeeMng.addEmployee(emp3);
        employeeMng.addEmployee(emp4);



    }
    private static void showEmployeeBuDepartment(EmployeeManager employeeManager, NameOfDep nameOfDep){
        printArray(employeeManager.getAllEmployees(new Department(nameOfDep)));
    }
    private static void printArray(Employee[] _allEmployees){
        for (Employee emp: _allEmployees){
            System.out.println(emp);
        }
    }
    private static void printAllEmployees(EmployeeManager employeeManager){
        printArray(employeeManager.getAllEmployees());

    }
}
