package HometaskNumber25Reloaded.Logic;

import HometaskNumber25Reloaded.Enums.NameOfDepartment;

import java.util.ArrayList;
import java.util.List;


public class Department {
    private String nameOfDepart;
    private int MAX_EMPLOYEES;
    private List<Employee> employeeSet;

    public List<Employee> getEmployeeSet() {
        return employeeSet;
    }


    public Department(NameOfDepartment nameOfDepartment, int max) {
        this.nameOfDepart = nameOfDepartment.toString();
        MAX_EMPLOYEES = max;
        employeeSet = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (MAX_EMPLOYEES != that.MAX_EMPLOYEES) return false;
        return nameOfDepart != null ? nameOfDepart.equals(that.nameOfDepart) : that.nameOfDepart == null;
    }

    @Override
    public int hashCode() {
        int result = nameOfDepart != null ? nameOfDepart.hashCode() : 0;
        result = 31 * result + MAX_EMPLOYEES;
        return result;
    }

    @Override
    public String toString() {
        return "Department " + nameOfDepart;
    }

    public void showEmpsInDep() {
        for (Employee e : employeeSet) {
            System.out.println(e.getName());
        }
    }
}
