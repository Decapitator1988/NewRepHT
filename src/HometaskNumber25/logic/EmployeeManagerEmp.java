//package HometaskNumber25.logic;
//
//import HometaskNumber25.Enums.NameOfDep;
//import HometaskNumber25.Interfaces.EmployeeManager;
//
//import java.util.HashSet;
//import java.util.Random;
//import java.util.Set;
//
//public class EmployeeManagerEmp implements EmployeeManager {
//    private Set<Department> departments;
//
//    private Department department0;
//    private Department department1;
//    private Department department2;
//    private Department department3;
//    private Department department4;
//    private Department department5;
//
//
//    public EmployeeManagerEmp() {
//        departments = new HashSet<>();
//        department0 = new Department(NameOfDep.DEFAULT);
//        department1 = new Department(NameOfDep.TOYS);
//        department2 = new Department(NameOfDep.AUTO);
//        department3 = new Department(NameOfDep.CHEMICALS);
//        department4 = new Department(NameOfDep.BATHROOM_GOODS);
//        department5 = new Department(NameOfDep.FOOD);
//
//        departments.add(department0);
//        departments.add(department1);
//        departments.add(department2);
//        departments.add(department3);
//        departments.add(department4);
//        departments.add(department5);
//
//
//    }
//
//    @Override
//    public void addEmployee(Employee employee) {
//        int rdm = new Random().nextInt(5);
//        switch (rdm){
//            case 1:
//                department1.addEmployeetoSet(employee);
//                break;
//            case 2:
//                department2.addEmployeetoSet(employee);
//                break;
//            case 3:
//                department3.addEmployeetoSet(employee);
//                break;
//            case 4:
//                department4.addEmployeetoSet(employee);
//                break;
//            case 5:
//                department5.addEmployeetoSet(employee);
//                break;
//            default:
//                department0.addEmployeetoSet(employee);
//                break;
//        }
//
//
//    }
//
//    @Override
//    public void removeEmployee(Employee _employee) {
//        for (Department dep : departments) {
//            if (dep.getEmployee(_employee)!=null){
//                dep.remove(_employee);
//            }
//
//        }
//
//    }
//
//    @Override
//    public Employee getEmployee(String emplName) {
//        for (Department dep: departments) {
//            Employee empl = dep.getEmployee(emplName);
//            if (empl!=null){
//                return empl;
//            }
//
//        }
//        return null;
//    }
//
//    @Override
//    public Employee[] getAllEmployees() {
//        Set<Employee> res = new HashSet<>();
//        for (Department dep:departments) {
//            res.addAll(dep.getEmployeeSet());
//        }
//        return res.toArray(new Employee[res.size()]);
//    }
//
//    @Override
//    public Employee[] getAllEmployees(Department _department) {
//        Set <Employee>res = new HashSet<>();
//        for (Department dep: departments ) {
//            if (dep.equals(_department)){
//                res.addAll(dep.getEmployeeSet());
//            }
//        }
//        return res.toArray(new Employee[res.size()]);
//    }
//
//    @Override
//    public void addSalary(String name, long salary) {
//        getEmployee(name).setSalary(salary);
//
//    }
//}
