package HometaskNumber25.logic;

public class Employee {
    private long salary;
    private int id;
    private String name;

    public Employee(long salary, int id, String name) {
        this.salary = salary;
        this.id = id;
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (salary != employee.salary) return false;
        if (id != employee.id) return false;
        return name != null ? name.equals(employee.name) : employee.name == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (salary ^ (salary >>> 32));
        result = 31 * result + id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee "+" with name "+name+" has id "+id+" and salary "+salary;

}
}

