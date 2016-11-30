package Company;

import java.util.List;

/**
 * Created by hicham.az on 30/11/2016.
 */
public class Main {
    public static void main(String[] args)
    {

        CompanyManager manager = new Manager();

        manager.addDepartment("depart1","Manager");
        manager.addDepartment("depart2","DataBase");
        manager.addDepartment("depart3","Inversion");

        manager.addSalesMan("AA15", "Uno", 2100, "depart3");
        manager.addSalesMan("432E", "Dos", 150, "depart3");
        manager.addSalesMan("522T", "Cuatrp", 1200, "depart2");
        manager.addSalesMan("435G","Cinco",5400,"depart3");

        manager.addDirector("HY6T","Seis",2035,"depart1");
        manager.addDirector("43ET","Tres",10,"depart1");



        manager.addSale("435G",1,1000);
        manager.addSale("432E",1,5000);

        List<Departamento> DEPT = manager.allDepartments();
        for( Departamento dept : DEPT)
        {
            System.out.println(dept.getName());
        }

        ///////
        for (int i = 0; i<DEPT.size();i++){
            System.out.println(DEPT.get(i).getName());
        }

        List<Employer> Empl = manager.employeesByDepartment("depart3");
        for (int i = 0; i<Empl.size();i++)
        {
            System.out.println(Empl.get(i).getName());
        }

    }

}
