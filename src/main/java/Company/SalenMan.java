package Company;

/**
 * Created by hicham.az on 30/11/2016.
 */
public class SalenMan implements Employer {

    private String DNI;
    private double salary;
    private String name;
    private String department;
    private double sales = 0;
    private int numSales =0;
    private double amountsales =0;

    public SalenMan(String DNI, String name, double salary, String department)
    {
        this.DNI = DNI;
        this.salary = salary;
        this.name = name;
        this.department = department;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSale(int sale, double amount) {
        this.numSales = this.numSales + sale;
        this.amountsales = this.amountsales + (sale*amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public double getTotalAmountSales() {
        return 0;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


}
