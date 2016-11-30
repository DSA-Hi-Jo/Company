package Company;

import java.beans.DesignMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by hicham.az on 30/11/2016.
 */
public class Manager implements CompanyManager {
    private List<Departamento> departments = new ArrayList<Departamento>();
    private Departamento department;
    private List<Employer> employers = new ArrayList<Employer>();
    private Employer employee;
    private SalenMan salesMan;
    private Director director;
    private List<Employer> departamentoEmployers = new ArrayList<Employer>();



    public Manager(){}

    public void addDepartment(String name, String description) {
        department = new Departamento(name, description);
        departments.add(department);
    }

    public void addSalesMan(String DNI, String name, double salary, String Department) {
        salesMan = new SalenMan(DNI, name, salary, Department);
        employers.add(salesMan);
    }

    public void addDirector(String DNI, String name, double salary, String Department) {
    Director director = new Director(DNI,name,salary, Department);
        employers.add(director);
    }

    public void addSale(String DNI, int sale, double amount) {
    for(Employer empl : employers)
    {
        if(empl.getDNI().equals(DNI))
        {
            empl.setSale(sale,amount);
        }
    }
    }

    public List<Departamento> allDepartments() {
        return departments;
    }

    public List<Employer> employeeBySalary() {
        updateSalaries();
        Collections.sort(employers, new Comparator<Employer>() {
            @Override
            public int compare(Employer o1, Employer o2) {
                return Double.compare(o1.getSalary(), o2.getSalary());
            }
        });
        return employers;
    }

    public List<Employer> employeeByName() {
        if (!employers.isEmpty())
        {
            Collections.sort(employers, new Comparator<Employer>()
            {
                @Override
                public int compare(Employer e1, Employer e2) {
                    return e1.getName().compareTo(e2.getName());
                }
            });
        }
        return employers;    }

    public List<Employer> employeesByDepartment(String name) {
        for (int i=0; i<employers.size();i++)
        {
            if(employers.get(i).getDepartment().equals(department))
            {
                departamentoEmployers.add(employee);
            }
        }
        if (!departamentoEmployers.isEmpty())
        {
            Collections.sort(departamentoEmployers, new Comparator<Employer>()
            {
                @Override
                public int compare(Employer e1, Employer e2)
                {
                    return Double.compare(e1.getSalary(), e2.getSalary());
                }
            });
        }
        return departamentoEmployers;    }

    public void updateSalaries() {
        for(Employer empl : employers)
        {
            if(empl instanceof  SalenMan)
            {
                empl.setSalary(empl.getSalary()+empl.getTotalAmountSales());
            }
            if(empl instanceof  Director)
            {
                String deprt = (empl.getDepartment());
                if(departamentoEmployers.isEmpty())
                {
                    departamentoEmployers = employeesByDepartment(deprt);
                }
                int depNoEmployees = departamentoEmployers.size()-1;
               empl.setSalary(employee.getSalary() + (0.05*employee.getSalary()*depNoEmployees));
            }
        }

    }
}
