package HTNumber25.Main;

import HTNumber25.Main.Enums.NameOfDepartment;
import HTNumber25.Main.Interfaces.EmployeeManager;
import HTNumber25.Main.Logic.Department;
import HTNumber25.Main.Logic.Employee;
import HTNumber25.Main.Logic.EmployeeManagerImp;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Department department = new Department(NameOfDepartment.TOYS, 8);
        Department department1 = new Department(NameOfDepartment.BATHROOM_GOODS,3 );
        Department department2 = new Department(NameOfDepartment.CAR, 10);

        Employee employee = new Employee("Pahom", 280);
        Employee employee1 = new Employee("Hariton Egorovich", 450);
        Employee employee2 = new Employee("Akakiy Sidorovich", 500);

        EmployeeManagerImp employeeManagerImp = new EmployeeManagerImp();
        employeeManagerImp.addEmployee(employee);
        employeeManagerImp.addEmployee(employee1);
        employeeManagerImp.addEmployee(employee2);

        System.out.println(Arrays. toString(employeeManagerImp.getAllEmployees()));
        System.out.println(department.getEmployeeSet().size());

        employeeManagerImp.setEmpToDep(department, employee);
        employeeManagerImp.setEmpToDep(department, employee1);

        System.out.println(department.getEmployeeSet().size());

        employeeManagerImp.setEmpToDep(department1, employee2);

        System.out.println(department1.getEmployeeSet().size());

        System.out.println(Arrays.toString(employeeManagerImp.getAllEmployees(department)));
        System.out.println(Arrays.toString(employeeManagerImp.getAllEmployees(department1)));

        employeeManagerImp.removeEmployee(employee1);

        employeeManagerImp.depInfo(department1);

        System.out.println(employeeManagerImp.getEmployee("Pahom"));

        System.out.println(employee.getSalary());
        employeeManagerImp.addSalary("Pahom",50);
        System.out.println(employee.getSalary());

        department1.showEmpsInDep();

    }

}


