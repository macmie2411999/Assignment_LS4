import java.util.Scanner;

public class RegularStaff extends Employee {
    // attributes
    private HeadOfDepartment headOfDepartment;

    // constructors
    public RegularStaff() {
    }

    public RegularStaff(String fullName, String employeeID,
                        String phoneNumber, Integer workingDays,
                        Integer salaryPerDay, HeadOfDepartment headOfDepartment) {
        super(fullName, employeeID, phoneNumber, workingDays, 100);
        this.headOfDepartment = headOfDepartment;
    }

    @Override
    protected Integer calculateSalaryPerMonth() {
//        this.setSalaryPerDay(100);
        return this.getSalaryPerDay() * this.getWorkingDays();
    }

    @Override
    public Employee newEmployee() {
        // use scanner to get information of the employee
        Scanner regularStaffScanner = new Scanner(System.in);
        System.out.print("Full Name Of Regular Staff: ");
        this.setFullName(regularStaffScanner.nextLine());
        System.out.print("ID Of Regular Staff: ");
        this.setEmployeeID(regularStaffScanner.nextLine());
        System.out.print("Phone Number Of Regular Staff: ");
        this.setPhoneNumber(regularStaffScanner.nextLine());
        System.out.print("Numbers Of Working Days: ");
        this.setWorkingDays(regularStaffScanner.nextInt());

        regularStaffScanner.nextLine();
        System.out.print("Salary Per Day: ");
        this.setSalaryPerDay(regularStaffScanner.nextInt());

        regularStaffScanner.nextLine();
        System.out.print("Full Name Of Head Of Department Of The Regular Staff: ");
        String nameOfTheHeadOfDepartment = regularStaffScanner.nextLine();

        // create new head of department if not already (demo)
        HeadOfDepartment newHeadOfDepartment = new HeadOfDepartment();
        newHeadOfDepartment.setFullName(nameOfTheHeadOfDepartment);
        this.setHeadOfManagement(newHeadOfDepartment);

        // process scanner
//        regularStaffScanner.reset();
//        regularStaffScanner.close();

        // check salary per day
        if (this.getSalaryPerDay() != 100) {
            System.out.println("Salary Per Day Of A Regular Staff Is 100. Default 100!");
            this.setSalaryPerDay(100);
        }

        return this;
    }

    // getter and setter
    public HeadOfDepartment getHeadOfManagement() {
        return headOfDepartment;
    }

    public void setHeadOfManagement(HeadOfDepartment headOfManagement) {
        this.headOfDepartment = headOfManagement;
    }

    @Override
    public String toString() {
        return "@ RegularStaff: " +
                "fullName='" + super.getFullName() + '\'' +
                ", employeeID='" + super.getEmployeeID() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", workingDays='" + super.getWorkingDays() +
                ", salaryPerDay='" + super.getSalaryPerDay() + '\'' +
                ", headOfDepartment='" + headOfDepartment.getFullName() + "'";
    }
}
