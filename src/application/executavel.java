package application;

import entitiesFuncionario.Employee;

import java.util.Scanner;

public class executavel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.println("Informe o nome do funcionario: ");
        Employee.name =sc.nextLine();

        System.out.println("Informe o salario bruto:R$ " );
        employee.grossSalary = sc.nextDouble();

        System.out.println("Informe o imposto:R$ ");
        employee.tax = sc.nextDouble();

        System.out.println(employee);

        System.out.println("Which percentage to increase salary?: " );
        double percentage = sc.nextDouble();
        employee.increaseSalaryy(percentage);

        System.out.println("Updated data: " + employee);

        sc.close();
    }
}
