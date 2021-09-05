package hrapp;

/**
 *
 * @author Cristina
 */
public class HRApp {

    public static void main(String[] args) {
        
        System.out.println("HR App Starts");
        
        // get every employeee in the department and print their informations
        // print total salary for department 
        // print average salary
                
        Department d1 = new Department("Marketing");
        
        Employee employee1 = new Employee(230, "Jon", 100);
        Employee employee2 = new Employee(215, "Ana", 200);
        Employee employee3 = new Employee(302, "Tom", 500);
        Employee employee4 = new Employee(545, "Nae", 900);

       
        d1.addEmployee(employee1);
        d1.addEmployee(employee3);
        d1.addEmployee(employee2);
        d1.addEmployee(employee4);
        
        for (var employee : d1.getEmployees()){
            System.out.println(employee);
        }

        System.out.println(d1.getNumberOfEmployees());
        System.out.println(d1.toString());
        System.out.println(d1.identifyEmployeeById(230));
        System.out.println(d1.identifyEmployeeById(231));

        System.out.println(d1.totalSalaryInDepartment());
        System.out.println(d1.averageSalaryInDepartment());
        System.out.println(d1.getMinSalaryInDepartment());
        System.out.println(d1.getMaxSalaryInDepartment());
        
    }
    
}
