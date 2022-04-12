import java.util.Scanner;

public class Director extends Employee {
    // attributes
    private Double percentageOfShares = 0.0;

    // constructors
    Director() {
    }

    public Director(String fullName, String employeeID,
                    String phoneNumber, Integer workingDays,
                    Integer salaryPerDay, Double percentageOfShares) {
        super(fullName, employeeID, phoneNumber, workingDays, 300);
        this.percentageOfShares = percentageOfShares;
    }

    @Override
    protected Integer calculateSalaryPerMonth() {
//        this.setSalaryPerDay(300);
        return this.getSalaryPerDay() * this.getWorkingDays();
    }

    @Override
    public Employee newEmployee() {
        // use scanner to get information of the employee
        Scanner headOfDepartmentScanner = new Scanner(System.in);
        System.out.print("Full Name Of The Director: ");
        this.setFullName(headOfDepartmentScanner.nextLine());
        System.out.print("ID Of The Director: ");
        this.setEmployeeID(headOfDepartmentScanner.nextLine());
        System.out.print("Phone Number Of The Director: ");
        this.setPhoneNumber(headOfDepartmentScanner.nextLine());
        System.out.print("Numbers Of Working Days: ");
        this.setWorkingDays(headOfDepartmentScanner.nextInt());

        System.out.print("Salary Per Day: ");
        this.setSalaryPerDay(headOfDepartmentScanner.nextInt());

        System.out.print("Percentage Of Shares: ");
        this.setPercentageOfShares(headOfDepartmentScanner.nextDouble());

        // process scanner
//        headOfDepartmentScanner.reset();
//        headOfDepartmentScanner.close();

        // check salary per day
        if (this.getSalaryPerDay() != 300) {
            System.out.println("Salary Per Day Of A Director Is 300. Default 300!");
            this.setSalaryPerDay(300);
        }

        return this;
    }

    // getter and setter
    public Double getPercentageOfShares() {
        return percentageOfShares;
    }

    public void setPercentageOfShares(Double percentageOfShares) {

        // check the percentage of shares
        if (percentageOfShares > 100 || percentageOfShares < 0) {
            System.out.println("The Percentage Of Shares Exceeds 100%. Default 0%!");
            this.percentageOfShares = 0.0;
        } else {
            this.percentageOfShares = percentageOfShares;
        }
    }

    @Override
    public String toString() {
        return "@ Director: " +
                "fullName='" + super.getFullName() + '\'' +
                ", employeeID='" + super.getEmployeeID() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", workingDays='" + super.getWorkingDays() +
                ", salaryPerDay='" + super.getSalaryPerDay() + '\'' +
                ", percentageOfShares='" + percentageOfShares + "'";
    }
}
