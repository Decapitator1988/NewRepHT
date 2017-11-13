package HometaskNumber25Reloaded.Main;

import HometaskNumber25Reloaded.Enums.NameOfDepartment;
import HometaskNumber25Reloaded.Logic.Department;
import HometaskNumber25Reloaded.Logic.Employee;
import HometaskNumber25Reloaded.Logic.EmployeeManagerImp;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Department department = new Department(NameOfDepartment.TOYS, 8);
        Department department1 = new Department(NameOfDepartment.BATHROOM_GOODS,3 );
        Department department2 = new Department(NameOfDepartment.CAR, 10);

        Employee employee = new Employee("Pahom", 280);
        Employee employee1 = new Employee("Hariton Egorovich", 450);
        Employee employee2 = new Employee("Akakiy Sidorovich", 1800);
        Employee employee3 = new Employee("Fedor Emelyanenko", 518);
        Employee employee4 = new Employee("Czedoon", 3500);

        EmployeeManagerImp employeeManagerImp = new EmployeeManagerImp();
        employeeManagerImp.addEmployee(employee);
        employeeManagerImp.addEmployee(employee1);
        employeeManagerImp.addEmployee(employee2);

        employeeManagerImp.addingDepsInListOfDep(department);
        employeeManagerImp.addingDepsInListOfDep(department2);
        employeeManagerImp.addingDepsInListOfDep(department1);

        employeeManagerImp.addEmployee(employee);
        employeeManagerImp.addEmployee(employee1);
        employeeManagerImp.addEmployee(employee2);
        employeeManagerImp.addEmployee(employee3);
        employeeManagerImp.addEmployee(employee4);


        employeeManagerImp.setEmpToDep(department2, employee);
        employeeManagerImp.setEmpToDep(department2, employee1);
        employeeManagerImp.setEmpToDep(department2, employee2);

        employeeManagerImp.setEmpToDep(department1, employee3);
        employeeManagerImp.setEmpToDep(department1, employee4);


        System.out.println(Arrays.toString(employeeManagerImp.getAllEmployees()));
        System.out.println("Total number of Employee: "+employeeManagerImp.getAllEmployees().length);
        System.out.println("Employees in dep: "+employeeManagerImp.getAllEmployees(department2).length+"\n");

       employeeManagerImp.removeEmployee(employee2);

        System.out.println("Total number of Employee AFTER remove: "+employeeManagerImp.getAllEmployees().length);
        System.out.println("Employees in dep AFTER remove: "+employeeManagerImp.getAllEmployees(department2).length+"\n");

        System.out.println("Returning an employee by the name "+employeeManagerImp.getEmployee("Czedoon")+"\n");


       System.out.println("Regular salary of "+employee3.getName()+" is "+employee3.getSalary());
       employeeManagerImp.addSalary("Fedor Emelyanenko", 230);

       System.out.println("Salary after addition of "+employee3.getName()+" is "+employee3.getSalary());





    }

}


