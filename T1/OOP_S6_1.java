package T1;

//1) Переписать код в соответствии с Single Responsibility Principle:
//Подсказка: вынесите метод calculateNetSalary() в отдельный класс

import java.sql.Date;


public class OOP_S6_1
{
    public static void main(String[] args) 
    {
        Date date = new Date(2020202020);
        Employee employee = new Employee("Matvey", date, 55000);
        Calculate calculate = new Calculate(employee);
        System.out.println(employee.getEmpInfo());
        System.out.println(calculate.calculateNetSalary(employee));
    }
}

