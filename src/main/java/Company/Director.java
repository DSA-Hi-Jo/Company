package Company;

/**
 * Created by hicham.az on 30/11/2016.
 */
public class Director implements Employer {

    private String DNI;
    private double salary;

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNumSales() {
        return numSales;
    }

    public void setNumSales(int numSales) {
        this.numSales = numSales;
    }

    public double getAmountSales() {
        return amountSales;
    }

    public void setAmountSales(double amountSales) {
        this.amountSales = amountSales;
    }

    private String name;
    private String department;
    private int numSales=0;
    private double amountSales=0;

    public Director(String dni,String name,double salary, String department)
    {
        this.DNI = dni;
        this.salary = salary;
        this.name = name;
        this.department=department;
    }

    public double getSalary() {
        return 0;
    }

    public void setSalary(double salary) {

    }

    public void setSale(int sale, double amount) {

    }

    public String getDNI() {
        return null;
    }

    public String getName() {
        return null;
    }

    public String getDepartment() {
        return null;
    }

    public double getTotalAmountSales() {
        return 0;
    }
}
