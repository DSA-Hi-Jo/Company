package Company;

/**
 * Created by hicham.az on 30/11/2016.
 */
public interface Employer {
    double getSalary();
    void setSalary(double salary);
    void setSale(int sale, double amount);
    String getDNI();
    String getName();
    String getDepartment();
    double getTotalAmountSales();
}
