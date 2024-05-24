package entitiesFuncionario;

public class Employee {
    public static String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
       return  grossSalary - tax;
    }

    public void increaseSalaryy(double percetage ){
       grossSalary += grossSalary * percetage  / 100.00;
    }
    public String toString(){
        return "Update data : "
                +name
                + " , $ "
                + netSalary();
    }

}
