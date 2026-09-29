import java.util.Arrays;
public class Main {


    public static void main(String[] args) {
        Employee [] employeesBook = {
        new Employee("ИВАН-ИВАНОВИЧ-ИВАНОВ ", 1, 450000),
        new Employee("ДАНИЛОВ-АЛЕКСАНД-ЛЕОНИДОВИЧ ", 2, 350000),
        new Employee("СМИРНОВ-АЛЕКСЕЙ-СЕРГЕЕВИЧ ", 3, 150000),
        new Employee("МАРОЗОВ-АРТЕМ-ВИКТОРОВИЧ ", 4, 150000),
        new Employee("ЛЕБЕДЕВО-АННА-ПАВЛОВНА ", 4, 150000),
        new Employee("ЕФРЕМОВА-ЭЛИНА-РУСЛАНОВНА ", 4, 150000),
        new Employee("СМИРНОВ-ДМИТРИЙ-ПАВЛОВИЧ ", 5, 110000),
        new Employee("ВАСИЛЬЕВ-ИВАН-МИХАЙЛОВИЧ ", 5, 130000),
        new Employee("ИВАНОВ-АЛЕКСЕЙ-СЕРГЕЕВИЧ ", 5, 90000),
        };
        EmployeeBook book = new EmployeeBook(employeesBook);
        System.out.println(book);
        if (book.employees != null && book.employees.length > 0) {
            int sum = 0;
            int count = 0;
            for (Employee num : book.employees) {
                if (num == null) {
                    continue;
                }
                    sum += num.getSalary();
                    count++;
            }
            if (count > 0) {
                double averagePay = (double) sum / count;
                System.out.println("Средняя зарплата: " + averagePay);
            }else {
                System.out.println("Ошибка");
            }
        }
        double[] taxes = new double [employeesBook.length];
        for(int i = 0; i < employeesBook.length; i++){
            taxes[i] = EmployeeBook.calculateTax(employeesBook[i].getSalary());
        }
        for (int i = 0; i < taxes.length; i++) {
            System.out.printf("Сотрудник %d: налог %.2f\n", i, taxes[i]);
        }
        book.departmentEmployeesConclusion(5, 50000.0);
        book.employeesWithdrawal(400000, 4);
        Employee a = new Employee("Белов Дмитрий Александрович", 4, 150000);
        boolean exists = EmployeeBook.isEmployeeExists (employeesBook, a);
        System.out.println("Есть ли сотрудник с такой зарплатой: " + exists);
        Employee foundEmployee = EmployeeBook.searchForAnEmployeeById(employeesBook, 5);
        if (foundEmployee != null) {
            System.out.println("Найден: " + foundEmployee);
        } else {
            System.out.println("Сотрудник не найден");
        }

        Employee [] names = {
                new Employee("Игнатова Елизавета Артёмовна", 2, 40000),
                new Employee("Васильева Диана Кирилловна", 4, 500000),
                new Employee("Иванова Милана Артёмовна", 3, 100000),
                new Employee("Пономарев Богдан Артемьевич", 2, 125000),
                new Employee("Шарова Алёна Арсентьевна", 3, 115000),
                new Employee("Яковлев Владислав Дмитриевич", 3, 135000),
                new Employee("Дроздов Семён Филиппович", 4, 143000),
                new Employee("Лопатина Полина Данииловна", 5, 98000),
        };
        EmployeeBook newEmployee = new EmployeeBook(names);
        for (int i = 0; i < 11; i++) {
            System.out.println("Попытка добавить сотрудника " + (i + 1) + ": " +
                    newEmployee.addEmployee(new Employee("Сотрудник " + (i + 1), 1, 1000 * (i + 1))));
        }
    }
}