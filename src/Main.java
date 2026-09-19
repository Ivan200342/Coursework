import java.util.Arrays;
public class Main {
    public static double calculateTax(double getSalary) {
        if (getSalary <= 150000) {
            return (getSalary) * 0.13;
        } else if (getSalary <= 350000) {
            return 150000 * 0.13 + (getSalary - 150000) * 0.17;
        } else{
            return 150000 * 0.13 + 200000 * 0.17 + (getSalary - 350000) * 0.21;
        }
    }
    public static void wageIndexation (int department, double indexationPercentage){
        if(department < 1 || department > 5 ){
            throw new IllegalArgumentException;
        }
        double ratio = 1 + (indexationPercentage / 100.0);
        for (Employee emp : book.employees) {
            if (emp.getDepartment() == department) {
                emp.setSalary(emp.getSalary() * ratio);
            }

        }
    }
    public static void main(String[] args) {
        Employee [] employeesBook = {
        new Employee("ИВАН-ИВАНОВИЧ-ИВАНОВ ", "1 ", 450_000),
        new Employee("ДАНИЛОВ-АЛЕКСАНД-ЛЕОНИДОВИЧ ", "2 ", 350_000),
        new Employee("СМИРНОВ-АЛЕКСЕЙ-СЕРГЕЕВИЧ ", "3 ", 150_000),
        new Employee("МАРОЗОВ-АРТЕМ-ВИКТОРОВИЧ ", "4 ", 150_000),
        new Employee("ВОЛКОВ-МАКСИМ-ИГОРЕВИЧ ", "4 ", 150_000),
        new Employee("ЛЕБЕДЕВО-АННА-ПАВЛОВНА ", "4 ", 150_000),
        new Employee("ЕФРЕМОВА-ЭЛИНА-РУСЛАНОВНА ", "4 ", 150_000),
        new Employee("СМИРНОВ-ДМИТРИЙ-ПАВЛОВИЧ ", "5 ", 110_000),
        new Employee("ВАСИЛЬЕВ-ИВАН-МИХАЙЛОВИЧ ", "5 ", 130_000),
        new Employee("ИВАНОВ-АЛЕКСЕЙ-СЕРГЕЕВИЧ ", "5 ", 90_000),
        new Employee("СОКОЛОВ-АНДРЕЙ-ВЛАДИМИРОВИЧ ", "5 ", 120_000),
        new Employee("МИХАЙЛОВ-ОЛЕКСЕЙ-ОЛЕГОВИЧ ", "5 ", 125_000),
        new Employee("КУЗНЕЦОВ-ДМИТРИЙ-ОЛЕГОВИЧ ", "5 ", 115_000),
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
            taxes[i] = calculateTax(employeesBook[i].getSalary());
        }
        for (int i = 0; i < taxes.length; i++) {
            System.out.printf("Сотрудник %d: налог %.2f\n", i, taxes[i]);
        }
    }
}