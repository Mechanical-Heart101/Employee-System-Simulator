public class FullTimeEmployee extends Employee
{
    private final int bonus = 1000; // bonus enoyed by full timers
    /**
     * This constuctor accesses the constructor in the Employee class
     */
    public FullTimeEmployee(String name, int baseSalary)
    {
        super(name, baseSalary);
    }

    /**
     * This is the overriden calculate salary for the full timers
     * @return int full time salary 
     */
    @Override
    public int calculateSalary()
    {
        return getBaseSalary() + bonus;
    }
}