public class PartTimeEmployee extends Employee
{
    private int hoursWorked;
    private final int hourlyRate = 15;

    public PartTimeEmployee(String name, int baseSalary, int hoursWorked)
    {
        super(name, baseSalary);
        this.hoursWorked = hoursWorked;
    }

    /**
     * This is the setter method for getting the hours worked
     */
    public int getHoursWorked()
    {
        return hoursWorked;
    }

    /**
     * This method returns the calculared salary
     * @return int calculated Salary
     */
    @Override
    public int calculateSalary()
    {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }
}