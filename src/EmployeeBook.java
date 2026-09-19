import java.util.Arrays;
public class EmployeeBook {
    Employee [] employees  = new Employee [15];
    private int count = 0;
    public EmployeeBook (Employee [] employees){
        this.count = 0;
    if (employees != null) {
        for (Employee emp : employees) {
            if (emp != null && count < this.employees.length) {
                this.employees[count] = emp;
                count++;
            }
        }
    }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("=== Список сотрудников ===\n");
        for (int i = 0; i < count; i++) {
            sb.append(employees[i].toString()).append("\n");
        }
        return sb.toString();
    }
}

