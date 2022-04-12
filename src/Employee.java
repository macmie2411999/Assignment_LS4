import java.util.Scanner;

public class Employee {
    // attributes
    private String fullName = "";
    private String employeeID = "";
    private String phoneNumber = "";
    private Integer workingDays = 0;
    private Integer salaryPerDay = 0;

    // constructors
    public Employee() {
    }

    public Employee(String fullName, String employeeID,
                    String phoneNumber, Integer workingDays,
                    Integer salaryPerDay) {
        this.fullName = fullName;
        this.employeeID = employeeID;
        this.phoneNumber = phoneNumber;
        this.workingDays = workingDays;
        this.salaryPerDay = salaryPerDay;
    }

    // common method to calculate salary per month
    protected Integer calculateSalaryPerMonth() {
        return 0;
    }

    // recruit a new employee
    public Employee newEmployee() {
        // use scanner to get information of the employee
        Scanner employeeScanner = new Scanner(System.in);
        System.out.print("Full Name Of Employee: ");
        this.setFullName(employeeScanner.nextLine());
        System.out.print("ID Of Employee: ");
        this.setEmployeeID(employeeScanner.nextLine());
        System.out.print("Phone Number Of Employee: ");
        this.setPhoneNumber(employeeScanner.nextLine());
        System.out.print("Numbers Of Working Days: ");
        this.setWorkingDays(employeeScanner.nextInt());
        System.out.print("Salary Per Day: ");
        employeeScanner.reset();
        Integer salaryFlag = employeeScanner.nextInt();

        // process the salary per day to classify employee
        if ((salaryFlag != 100) && (salaryFlag != 200) && (salaryFlag != 300)) {
            System.out.println("The Salary Per Day Of Employee Is Invalid. Default 100!");
            this.setSalaryPerDay(100);
        }

        // process scanner
//        employeeScanner.reset();
//        employeeScanner.close();

        // return the new regular staff
        return this;
    }

    // getters and setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(Integer workingDays) {
        this.workingDays = workingDays;
    }

    public Integer getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(Integer salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    @Override
    public String toString() {
        return "@ Employee: " +
                "fullName='" + fullName + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", workingDays='" + workingDays +
                ", salaryPerDay='" + salaryPerDay + "'";
    }
}
