public class Employee {
    private int employeeNumber;
    private double payRate;

    public Employee(int employeeNumber, double payRate) {
        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    public double calculateRegularPay(int hoursWorked) {
        if (hoursWorked <= 40) {
            return hoursWorked * payRate;
        } else {
            return 40 * payRate;  
        }
    }

    public double calculateOvertimePay(int hoursWorked) {
        if (hoursWorked > 40) {
            int overtimeHours = hoursWorked - 40;
            return overtimeHours * (payRate * 1.5); 
        } else {
            return 0;
        }
    }
}
