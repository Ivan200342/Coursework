import java.sql.SQLOutput;
import java.util.Arrays;
public class EmployeeBook {
    Employee[] employees = new Employee[10];
    private int count = 0;

    public EmployeeBook(Employee[] employees) {
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

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                count++;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("=== Список сотрудников ===\n");
        for (int i = 0; i < count; i++) {
            sb.append(employees[i].toString()).append("\n");
        }
        return sb.toString();
    }

    public void wageIndexation(int department, double indexationPercentage) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Ошибка, такова отдела нет" + department);
        }
        double ratio = 1 + (indexationPercentage / 100.0);
        for (Employee emp : employees) {
            if (emp == null) {
                continue;
            }
            if (emp.getDepartment() != department) {
                continue;
            }
            emp.setSalary(emp.getSalary() * ratio);

        }
    }

    public void departmentEmployeesConclusion(int department, double salary) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == department && employee.getSalary() > salary) {
                employee.printShortInfo();
                return;
            }
        }
        System.out.println("Сотрудник не найден");
    }

    public static double calculateTax(double getSalary) {
        if (getSalary <= 150000) {
            return (getSalary) * 0.13;
        } else if (getSalary <= 350000) {
            return 150000 * 0.13 + (getSalary - 150000) * 0.17;
        } else {
            return 150000 * 0.13 + 200000 * 0.17 + (getSalary - 350000) * 0.21;
        }
    }

    public void employeesWithdrawal(double wage, int employeeNumber) {
        int count = 0;
        int index = 0;
        int totalValidEmployees = 0;
        while (count < employeeNumber && index < employees.length) {
            Employee employee = employees[index];
            if (employee != null && employee.getSalary() < wage) {
                System.out.println(" Ф-И-О: " + employee.getFullName() + " | Отдел: " + employee.getDepartment() + " | Зарплата: " + employee.getSalary());
                count++;
            }
            index++;
            totalValidEmployees++;
        }
        if (count != employeeNumber) {
            System.out.println("Не хватило сотрудников");
        }
    }
    public static boolean isEmployeeExists(Employee[] employees, Employee targetEmployee) {
        if (employees == null || targetEmployee == null) {
            return false;
        }
        for (Employee emp : employees) {
            if (emp != null && emp.equals(targetEmployee)) {
                return true;
            }
        }
        return false;
    }
    public boolean addEmployees(Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return true;
            }
        }
        return false;
    }
    public static Employee searchForAnEmployeeById(Employee [] employees, int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
    Employee [] newEmployee = new Employee[10];
    }