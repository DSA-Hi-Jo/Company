package Company;

import java.util.List;

/**
 * Created by hicham.az on 30/11/2016.
 */
public interface CompanyManager {
    void addDepartment(String name,String description);
    void addSalesMan(String DNI,String name, double salary,String Department);
    void addDirector(String DNI,String name, double salary,String Department);
    void addSale(String DNI,int sale,double amount);
    List<Departamento> allDepartments();
    List<Employer> employeeBySalary();
    List<Employer> employeeByName();
    List<Employer> employeesByDepartment(String name);
    void updateSalaries();
}
