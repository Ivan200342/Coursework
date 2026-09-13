import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee a = new Employee("ИВАН-ИВАНОВИЧ-ИВАНОВ ", "РУКОВОДИТЕЛЬ-БУГАЛТЕР ", 450_000);
        Employee b = new Employee("ДАНИЛОВ-АЛЕКСАНД-ЛЕОНИДОВИЧ ", "РУКОВОДИТЕЛЬ-ЛОГИСТ ", 350_000);
        Employee c = new Employee("СМИРНОВ-АЛЕКСЕЙ-СЕРГЕЕВИЧ ", "ЛОГИСТ ", 150_000);
        Employee d = new Employee("МАРОЗОВ-АРТЕМ-ВИКТОРОВИЧ ", "ПРОДАЖИ-КОНСУЛЬТАНТ ", 150_000);
        Employee e = new Employee("ВОЛКОВ-МАКСИМ-ИГОРЕВИЧ ", "ПРОДАЖИ-КОНСУЛЬТАНТ ", 150_000);
        Employee f = new Employee("ЛЕБЕДЕВО-АННА-ПАВЛОВНА ", "ПРОДАЖИ-КОНСУЛЬТАНТ ", 150_000);
        Employee g = new Employee("ЕФРЕМОВА-ЭЛИНА-РУСЛАНОВНА ", "ПРОДАЖИ-КОНСУЛЬТАНТ ", 150_000);
        Employee h = new Employee("СМИРНОВ-ДМИТРИЙ-ПАВЛОВИЧ ", "ПРОИЗВОДСТВО ", 110_000);
        Employee i = new Employee("ВАСИЛЬЕВ-ИВАН-МИХАЙЛОВИЧ ", "ПРОИЗВОДСТВО ", 130_000);
        Employee j = new Employee("ИВАНОВ-АЛЕКСЕЙ-СЕРГЕЕВИЧ ", "ПРОИЗВОДСТВО ", 90_000);
        Employee k = new Employee("СОКОЛОВ-АНДРЕЙ-ВЛАДИМИРОВИЧ ", "ПРОИЗВОДСТВО ", 120_000);
        Employee l = new Employee("МИХАЙЛОВ-ОЛЕКСЕЙ-ОЛЕГОВИЧ ", "ПРОИЗВОДСТВО ", 125_000);
        Employee m = new Employee("КУЗНЕЦОВ-ДМИТРИЙ-ОЛЕГОВИЧ ", "ПРОИЗВОДСТВО ", 115_000);
        EmployeeBook [] employees  = new EmployeeBook [15];
        for (int v = 0; v < employees.length; v++) {
            employees[v] = new EmployeeBook("Сотрудник" + (v ++));
        }
        System.out.println(Arrays.toString(employees));




        // вывести массив в консоль целиком !!!!



    }
}