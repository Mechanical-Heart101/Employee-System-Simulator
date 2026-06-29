public class Employee
{
    private static int nextId = 1; // Shared across the class

    private int id;
    private String name;
    private int baseSalary;

    public Employee(String name, int baseSalary)
    {
        this.name = name;
        this.baseSalary = baseSalary;
        this.id = nextId++;
    }

    /**
     * This method returns the name of the employee
     * @return String name
     */
    public String getName()
    {
        return name;
    }

    /**
     * This method returns the base salary of employe objects
     * @return int base salary.
     */
    public int getBaseSalary()
    {
        return baseSalary;
    }

    /**
     * This is a getter method for the id
     * @return int ID
     */
    public int getId()
    {
        return id;
    }

    /**
     * This is the calculate salary method. It is important for other classes although it looks duplicated
     * @return int calculated salary
     */
    public int calculateSalary()
    {
        return baseSalary;
    }

    /**
     * This is the toString method for the Employee class
     * @return String toString
     */
    @Override
    public String toString()
    {
        return "Name: " + getName() +
                ", Id: " + getId();
    }




}