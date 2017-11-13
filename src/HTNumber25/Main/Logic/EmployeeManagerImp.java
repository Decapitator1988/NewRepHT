package HTNumber25.Main.Logic;


import HTNumber25.Main.Enums.NameOfDepartment;
import HTNumber25.Main.Interfaces.EmployeeManager;
import HometaskNumber13.Array;

import java.util.*;

public class EmployeeManagerImp implements EmployeeManager{
    private Set<Employee> wholeStaff;

    public EmployeeManagerImp() {
        wholeStaff = new HashSet<>();
    }

    @Override
    public void addEmployee(Employee employee) {
        wholeStaff.add(employee);

    }
    public void  setEmpToDep(Department department, Employee employee){
        department.getEmployeeSet().add(employee);
    }
   public void depInfo(Department department){
       System.out.println(department.getEmployeeSet().size());
    }

    @Override
    public void removeEmployee(Employee employee) {
        wholeStaff.remove(employee);
    }

    @Override
    public Employee getEmployee(String employee) {
        for (Employee e: wholeStaff) {
            if(e.getName().equals(employee)){
                return e;
            }
        }
        return null;
    }

    @Override
    public Employee[] getAllEmployees() {
        Employee[]emps = new Employee[wholeStaff.size()-1];
        emps = wholeStaff.toArray(emps);
        return emps;
    }

    @Override
    public Employee[] getAllEmployees(Department department) {
        Employee[]empl = new Employee[department.getEmployeeSet().size()-1];
        empl = department.getEmployeeSet().toArray(empl);
        return empl;
    }

    @Override
    public void addSalary(String name, long salary) {
        for (Employee e:wholeStaff) {
            if(e.getName().equals(name)){
                e.setSalary(e.getSalary()+salary);
            }

        }

    }
}
