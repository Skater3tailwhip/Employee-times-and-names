import java.util.Date; // for Date class

class Employee {
    private String name;
    private String employeeNumber;
    private Date hireDate;

    public Employee(String name, String employeeNumber, Date hireDate) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}

class ProductionWorker extends Employee {
    private int shift;
    private double hourlyPayRate;

    public ProductionWorker(String name, String employeeNumber, Date hireDate, int shift, double hourlyPayRate) {
        super(name, employeeNumber, hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        // Create a new ProductionWorker object
        ProductionWorker worker = new ProductionWorker("John Doe", "12345", new Date(), 1, 15.50);

        // Display the information of the ProductionWorker
        System.out.println("Employee Name: " + worker.getName());
        System.out.println("Employee Number: " + worker.getEmployeeNumber());
        System.out.println("Hire Date: " + worker.getHireDate());
        System.out.println("Shift: " + worker.getShift());
        System.out.println("Hourly Pay Rate: $" + worker.getHourlyPayRate());
    }
}   