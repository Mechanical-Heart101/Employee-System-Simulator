import java.util.ArrayList;

public class Payroll
{
    private ArrayList<Employee> employees;

    /**
     * This is the constructor for the payroll class
     */
    public Payroll()
    {
        employees = new ArrayList<>();
    }

    /**
     * This method adds Employee objects into the list
     * @param String name
     * @param int baseSalary
     */
    public void addFullTimeEmployee(String name, int baseSalary)
    {
        Employee newEmployee = new FullTimeEmployee(name, baseSalary);
        employees.add(newEmployee);
    }

    /**
     * This mehtod is meant to make a part time employee.
     * @param String name
     * @param Int baseSalary
     * @param Int hours worked
     */
    public void addPartTimeEmployee(String name, int baseSalary, int hoursWorked)
    {
        Employee partTimeEmployee = new PartTimeEmployee(name, baseSalary, hoursWorked);
        employees.add(partTimeEmployee);
    }

    /**
     * This is the remove employee method
     * @param int employee Id 
     */
    public void removeEmployee(int Id)
    {
        Employee searchObject = findEmployeeById(Id);
        employees.remove(searchObject);
    }

    /**
     * This is a helper method to find ID. Will probably be important later.
     * @param Int Id of the employee
     * @return boolean result of search
     */
    public boolean findById(Employee newEmployee)
    {
        boolean found = false;

        for (Employee employee : employees)
        {
            if (employee.getId() == newEmployee.getId())
            {
                found = true;
            }
        }
        return found;
    }

    /**
     * This is a helper method to return the object with the associated ID
     * @param Int ID
     * @return Employee object associated with ID
     */
    public Employee findEmployeeById(int Id)
    {
        Employee foundEmployee = null;

        for (Employee employee : employees)
        {
            if (employee.getId() == Id)
            {
                foundEmployee = employee;
            }
        }

        if (foundEmployee == null)
        {
            System.out.println("Employee not found.");
        }
        return foundEmployee;
    }

    /**
     * This method displays the employees
     */
    public void displayEmployees()
    {
        for (Employee employee : employees)
        {
            System.out.println(employee);
        }
    }

    /**
     * This is the calculate payroll method
     */
    public void calculateTotalPayroll()
    {
        int total = 0;

        for (Employee employee : employees)
        {
            total += employee.calculateSalary();
        }

        System.out.println("The total payroll is: " + total);
    }


}