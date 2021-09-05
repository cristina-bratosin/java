package hrapp;

/**
 *
 * @author Cristina
 */
public class Department {
    
    private String name;
    
    // name needs to be unique
    public Department(String name) {
        this.name = name;
    }
    
    private Employee [] employees = new Employee [10];
    int lastAddedEmployeeIndex = 0;
    
    // limit to max 10 employee
    public void addEmployee(Employee anEmployee) {
        if( lastAddedEmployeeIndex <= employees.length ){
            employees[lastAddedEmployeeIndex] = anEmployee;
            lastAddedEmployeeIndex++;
        }
    }
    // not contain null values
    public Employee[] getEmployees() {
        Employee [] newEmployees = new Employee[lastAddedEmployeeIndex];
        System.arraycopy(employees, 0, newEmployees, 0, newEmployees.length);
        return newEmployees;
    }

    public int getNumberOfEmployees() {
        return lastAddedEmployeeIndex;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // method to identify an employee based on id number
    public String identifyEmployeeById(int id) {
            for (Employee var : employees) {
                if (var != null && var.getId() == id) {
                    return var.toString();
                }
            }
            return "ID not found!";
        }
    // method to return total salary in the department
    public double totalSalaryInDepartment(){
        double total = 0;
        if (employees != null){
            for(Employee var: employees){
                if (var != null) {
                    total = total + var.getSalary();
                }
            }
            return total;
        }
        return 0;
    }
    // method to return the average salary
    public double averageSalaryInDepartment(){
        if(lastAddedEmployeeIndex == 0){
           return 0;
        }
        return totalSalaryInDepartment() / (lastAddedEmployeeIndex);
    }
    // method to return the min salary
    public double getMinSalaryInDepartment(){
        double minSalary = 0;
        if (employees != null){
            for (Employee var:employees){
                if (var != null){
                    if (minSalary == 0 || minSalary > var.getSalary()) {
                        minSalary = var.getSalary();
                    }
                }
            }
            return minSalary;
        }
        return 0;
    }
    // method to return the max salary
    public double getMaxSalaryInDepartment(){
        double maxSalary = 0;
        if (employees != null){
            for (Employee var:employees){
                if (var != null){
                    if (maxSalary == 0 || maxSalary < var.getSalary()) {
                        maxSalary = var.getSalary();
                    }
                }
            }
            return maxSalary;
        } return 0;
    }
    
    @Override
    public String toString(){
        return "Department " + getName();
    }
    
}
