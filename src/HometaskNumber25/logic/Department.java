//package HometaskNumber25.logic;
//
//import HometaskNumber25.Enums.NameOfDep;
//
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Set;
//
//public class Department {
//       private  NameOfDep nameOfDep;
//       private Set<Employee> employeeSet;
//
//    public Department(NameOfDep nameOfDep) {
//        this.nameOfDep = nameOfDep;
//        employeeSet = new HashSet<>();
//    }
//
//    public NameOfDep getNameOfDep() {
//        return nameOfDep;
//    }
//    public void addEmployeetoSet(Employee emp){
//        employeeSet.add(emp);
//    }
//
//   public Employee getEmployee(String empName){
//       Iterator<Employee> it = employeeSet.iterator();
//       while (it.hasNext()){
//           Employee currentEmp = it.next();
//           if(currentEmp.getName().equals(empName)){
//               return currentEmp;
//           }
//       }
//       return null;
//}
//
//    public Employee getEmployee(Employee employee){
//       Iterator<Employee> it = employeeSet.iterator();
//       while (it.hasNext()){
//           Employee currentEmp = it.next();
//           if (currentEmp.equals(employee)){
//               return currentEmp;
//           }
//       } return null;
//    }
//    public Set<Employee> getEmployeeSet(){
//        return employeeSet;
//    }
//
//    public void remove(Employee _employee){
//        Set<Employee> employees = new HashSet<>(employeeSet);
//        employees.remove(_employee);
//        employeeSet = employees;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Department)) return false;
//
//        Department that = (Department) o;
//
//        if (nameOfDep != that.nameOfDep) return false;
//        return employeeSet != null ? employeeSet.equals(that.employeeSet) : that.employeeSet == null;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = nameOfDep != null ? nameOfDep.hashCode() : 0;
//        result = 31 * result + (employeeSet != null ? employeeSet.hashCode() : 0);
//        return result;
//    }
//
//    @Override
//    public String toString() {
//        return "Department with name " + nameOfDep +" contains  " + employeeSet.size() +
//                " employees";
//    }
//}
