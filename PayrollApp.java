import java.util.Scanner;

public class PayrollApp 
{
    public static void main (String[] args)
    {
        Payroll payroll = new Payroll(); // new payroll object
        Scanner scanner = new Scanner(System.in); // scanner object

        boolean running = true;

        while (running)
        {
            System.out.println("=== Payroll ===");
            System.out.println("1. Add full time employee.");
            System.out.println("2. Add part time employee.");
            System.out.println("3. View employees");
            System.out.println("4. Find Employee");
            System.out.println("5. Remove employee");
            System.out.println("6. Calculate total payroll");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume leftover new Line

            switch (choice)
            {
                case 1 : // adding a new full time employee
                    System.out.println("Please input the name: ");
                    String name = scanner.nextLine();

                    System.out.println("Please input the base salary: ");
                    int baseSalary = scanner.nextInt();
                    scanner.nextLine();

                    payroll.addFullTimeEmployee(name, baseSalary);
                    System.out.println("Employee successfully added!");

                    break;

                case 2 : // adding a new part Time employee
                    System.out.println("Please input the name: ");
                    name = scanner.nextLine();

                    System.out.println("Please input the base salary");
                    baseSalary = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Please input the hours worked: ");
                    int hoursWorked = scanner.nextInt();
                    scanner.nextLine();

                    payroll.addPartTimeEmployee(name, baseSalary, hoursWorked);

                    break;

                case 3 : // viewing employees
                    payroll.displayEmployees();
                    
                    break;

                case 4 : // find employee by id
                    System.out.println("Please input employee id");
                    int employeeId = scanner.nextInt();
                    scanner.nextLine();

                    Employee found = payroll.findEmployeeById(employeeId);

                    if (found == null)
                    {
                        System.out.println("There is no such employee.");
                    }
                    else
                    {
                        System.out.println(found);
                    }
                    
                    break;

                case 5 : // remove employee
                    System.out.println("Please input the employee Id");
                    employeeId = scanner.nextInt();
                    scanner.nextLine();
                    
                    payroll.removeEmployee(employeeId);

                    break;

                
                case 6 : // calculate total Payroll
                    payroll.calculateTotalPayroll();

                    break;    
                
                case 7 : // exiting
                    running = false;
                    break;

                default :
                    System.out.println("Invalid input! Please select correctly");

            }
        }

        scanner.close(); // close the scanner to prevent memory leaks.
    }
    
}
