import java.util.Arrays;
public class EmployeeBook {
    EmployeeBook [] employees  = new EmployeeBook [15];
    private String employeesBook;
    private int count = 0;
    public EmployeeBook (EmployeeBook [] employees){
        this.employeesBook = employeesBook;
        this.count = 0;
    if (employees != null) {
        for (EmployeeBook emp : employees) {
            if (emp != null && count < employees.length) {
                this.employees[count] = emp;
                count++;
            }
        }
    }
    }
    public String getEmployeesBook() {
        return this.employeesBook;
    }
    public EmployeeBook(String employeesBook){
    }
    public String toString(){
        return "Сотрудник " + Arrays.toString(employees);
    }

}

