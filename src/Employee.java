import java.util.Objects;
public class Employee {
    private String fullName;
    private String department;
    private int salary;
    public String getFullName(){return this.fullName;}
    public String getDepartment(){return this.department;}
    public int getSalary(){return this.salary;}
    public void setDepartment(String department) {this.department = department;}
    public void setSalary (int salary) {this.salary = salary;}
    private static int employee = 0;
    private int id;
    public int getEmployee(){return employee;}
    public Employee (String fullName, String department, int salary){
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        employee++;
        this.employee = id;
    }
    public String toString(){
        return  "Ф-И-О " + fullName + " Отдел " + department + " Зарплата до вычета налога " + salary;
    }
    public void printShortInfo(){
        System.out.println ("Ф-И-О " + fullName + " Зарплата до вычета налога " + salary);
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) {return false;}
        Employee employee = (Employee) o;
        return Objects.equals(salary, employee.salary);
    }
}
