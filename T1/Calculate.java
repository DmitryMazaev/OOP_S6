package T1;

public class Calculate
{
    private Employee employee;

    public Calculate(Employee employee) {
        this.employee = employee;
    }

    public int calculateNetSalary(Employee employee) {
        int tax = employee.getBaseSalary()/4;
        return employee.getBaseSalary() - tax;
    }


}
