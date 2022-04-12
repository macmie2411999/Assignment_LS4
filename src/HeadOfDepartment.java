import java.util.Scanner;

public class HeadOfDepartment extends Employee {
    // attributes
    private Integer numberOfInferiorStaffs = 0;

    // constructors
    public HeadOfDepartment() {
    }

    public HeadOfDepartment(String fullName, String employeeID,
                            String phoneNumber, Integer workingDays,
                            Integer salaryPerDay, Integer numberOfInferiorStaffs) {
        super(fullName, employeeID, phoneNumber, workingDays, 200);
        this.numberOfInferiorStaffs = numberOfInferiorStaffs;
    }

    @Override
    protected Integer calculateSalaryPerMonth() {
//        this.setSalaryPerDay(200);
        return this.getSalaryPerDay() * this.getWorkingDays() + 100 * this.numberOfInferiorStaffs;
    }

    @Override
    public Employee newEmployee() {
        // use scanner to get information of the employee
        Scanner headOfDepartmentScanner = new Scanner(System.in);
        System.out.print("Full Name Of The Head Of Department: ");
        this.setFullName(headOfDepartmentScanner.nextLine());
        System.out.print("ID Of The Head Of Department: ");
        this.setEmployeeID(headOfDepartmentScanner.nextLine());
        System.out.print("Phone Number Of The Head Of Department: ");
        this.setPhoneNumber(headOfDepartmentScanner.nextLine());
        System.out.print("Numbers Of Working Days: ");
        this.setWorkingDays(headOfDepartmentScanner.nextInt());

        System.out.print("Salary Per Day: ");
        this.setSalaryPerDay(headOfDepartmentScanner.nextInt());

        System.out.print("Number Of Inferior Staffs: ");
        this.setNumberOfInferiorStaffs(headOfDepartmentScanner.nextInt());

        // process scanner
//        headOfDepartmentScanner.nextLine();
//        headOfDepartmentScanner.close();

        // check salary per day
        if (this.getSalaryPerDay() != 200) {
            System.out.println("Salary Per Day Of A Head Of Department Is 200. Default 200!");
            this.setSalaryPerDay(200);
        }

        return this;
    }

    // getter and setter
    public Integer getNumberOfInferiorStaffs() {
        return numberOfInferiorStaffs;
    }

    public void setNumberOfInferiorStaffs(Integer numberOfInferiorStaffs) {
        this.numberOfInferiorStaffs = numberOfInferiorStaffs;
    }

    @Override
    public String toString() {
        return "@ HeadOfDepartment: " +
                "fullName='" + super.getFullName() + '\'' +
                ", employeeID='" + super.getEmployeeID() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", workingDays='" + super.getWorkingDays() +
                ", salaryPerDay='" + super.getSalaryPerDay() + '\'' +
                ", numberOfInferiorStaffs='" + numberOfInferiorStaffs + "'";
    }
}
