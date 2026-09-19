import java.util.Objects;
public class Employee {
    private String fullName;
    private String department;
    private double salary;
    private final int id;
    private static int nextId = 1;
    public String getFullName(){
        return this.fullName;
    }
    public String getDepartment(){
        return this.department;
    }
    public double getSalary(){
        return this.salary;
    }
    public int getId() {
        return id;
    }
    public void setDepartment(String department) {this.department = department;}
    public void setSalary (double salary) {
        this.salary = salary;
    }
    public Employee (String fullName, String department, double salary){
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = nextId++;
    }
    public String toString(){
        return id + " Ф-И-О: " + fullName +  " | Отдел: " + department + " | Зарплата: " + salary;
    }
    public void printShortInfo(){
        System.out.println ("Ф-И-О: " + fullName + " Зарплата: " + salary);
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) {return false;}
        Employee employee = (Employee) o;
        return salary == employee.salary;
    }
}
