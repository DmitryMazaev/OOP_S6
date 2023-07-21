package T1;

import java.sql.Date;

public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;
    
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }
    // Добавление Getter и Setter для вывода и изменения полей класса Employee
    public String getName() {
        return name;
    }
    public Date getDob() {
        return dob;
    }
    public int getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}