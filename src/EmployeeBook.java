import java.util.Arrays;

public class EmployeeBook {
    private static Employee [] employees;
    public EmployeeBook (Employee [] employees){this.employees = employees;}
    public String toString(){
        return "Сотрудник " + Arrays.toString(employees);
    }
}
