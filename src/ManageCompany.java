import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManageCompany {
    public static void main(String[] args) {
//        checkMethods();
        Scanner functionScanner = new Scanner(System.in);
        showMenu();
        Company company = new Company();

        Boolean flagExit = false;
        while (!flagExit) {
            System.out.print("Chose Function: ");
            Integer function = functionScanner.nextInt();

            switch (function) {
                case 0:
                    System.out.println("Chose 0: Exit.");
                    flagExit = true;
                    break;
                case 1:
                    System.out.println("Chose 1: Create And Input Information For A New Company.");
                    createANewCompany(company);
                    break;
                case 2:
                    System.out.println("Chose 2: Promote A New Employee To The Head Of Department.");
                    promoteAHeadOfDepartment(company, new Employee());
                    break;
                case 3:
                    System.out.println("Chose 3: Add A New Employee To The Company.");
                    addEmployee(company, new Employee());
                    break;
                case 4:
                    System.out.println("Chose 4: Fire A Employee Out Of The Company.");
                    deleteInformationOfEmployee(company);
                    break;
                case 5:
                    System.out.println("Chose 5: Get Information of Employees Of The Company.");
                    getInformationOfEmployeesOfCompany(company);
                    break;
                case 6:
                    System.out.println("Chose 6: Calculate The Total Amount Of Salary Of The Company.");
                    getTotalAmountOfSalaryOfCompany(company);
                    break;
                case 7:
                    System.out.println("Chose 7: Find The Regular Staff Who Has The Highest Salary.");
                    getRegularStaffHasHighestSalary(company);
                    break;
                case 8:
                    System.out.println("Chose 8: Find The Head Of Department Who Has The Most Inferior Employees.");
                    getHeadOfDepartmentHasMostEmployees(company);
                    break;
                case 9:
                    System.out.println("Chose 9: Sort Employees Of The Company In Alphabetical Order.");
                    sortEmployeesInAlphabeticalOrder(company);
                    break;
                case 10:
                    System.out.println("Chose 10: Sort Employees Of The Company In Salary Order");
                    sortEmployeesInSalaryOrder(company);
                    break;
                case 11:
                    System.out.println("Chose 11: Find The Director Who Has The Highest Percentage Of Shares.");
                    getDirectorHasHighestShares(company);
                    break;
                case 12:
                    System.out.println("Chose 12: Calculate The Total Income Of Each Director.");
                    calculateTotalIncomeOfDirector(company);
                    break;
                default:
                    System.out.println("The Key Is Invalid!\n");
                    showMenu();
                    break;
            }
        }
    }

    // check as if methods works
    public static void checkMethods() {

//        Employee newEmployee = new Employee();
//        newEmployee.newEmployee();
//        System.out.println(newEmployee.toString());

//        RegularStaff newRegularStaff = new RegularStaff();
//        newRegularStaff.newEmployee();
//        System.out.println(newRegularStaff.toString());

//        HeadOfDepartment headOfDepartment = new HeadOfDepartment();
//        headOfDepartment.newEmployee();
//        System.out.println(headOfDepartment.toString());

//        Director director = new Director();
//        director.newEmployee();
//        System.out.println(director.toString());

//        Company aCompany = createANewCompany();
//        demoEmployeesOfCompany(aCompany);

//        promoteAHeadOfDepartment(aCompany);
//        getInformationOfEmployeesOfCompany(aCompany);
//        getTotalAmountOfSalaryOfCompany(aCompany);
//        getRegularStaffHasHighestSalary(aCompany);
//        getHeadOfDepartmentHasMostEmployees(aCompany);
//        sortEmployeesInAlphabeticalOrder(aCompany);
//        getDirectorHasHighestShares(aCompany);
//        calculateTotalIncomeOfDirector(aCompany);
//        promoteAHeadOfDepartment(aCompany, new Employee("Hala Ma", "EM1024", "79988764827",
//                7, 100));
//        promoteAHeadOfDepartment(aCompany, new Employee());
//        deleteInformationOfEmployee(aCompany);
    }

    // create a list of employees of company
    public static void demoEmployeesOfCompany(Company company) {
        Director firstDirector = new Director("Trump", "DRT1156",
                "78273648723", 6, 300, 2.1);

        Director secondDirector = new Director("Mark", "DRT2065",
                "79238749374", 10, 300, 3.1);

        Director thirdDirector = new Director("David", "DRT3490",
                "76254356235", 8, 300, 2.8);

        HeadOfDepartment firstHeadOfDepartment = new HeadOfDepartment("Mac", "HOD2401",
                "79653683478", 6, 200, 2);

        HeadOfDepartment secondHeadOfDepartment = new HeadOfDepartment("Mie", "HOD3489",
                "79928365627", 6, 200, 1);

        RegularStaff fistStaff = new RegularStaff("Joe", "RS2334", "79653682226",
                6, 100, firstHeadOfDepartment);

        RegularStaff secondStaff = new RegularStaff("Pelosi", "RS1542", "79283479438",
                5, 100, firstHeadOfDepartment);

        RegularStaff thirdStaff = new RegularStaff("Xi", "RS4044", "79983457934",
                5, 100, secondHeadOfDepartment);

        company.getArrayListEmployee().add(firstDirector);
        company.getArrayListEmployee().add(secondDirector);
        company.getArrayListEmployee().add(thirdDirector);
        company.getArrayListEmployee().add(firstHeadOfDepartment);
        company.getArrayListEmployee().add(secondHeadOfDepartment);
        company.getArrayListEmployee().add(fistStaff);
        company.getArrayListEmployee().add(secondStaff);
        company.getArrayListEmployee().add(thirdStaff);
    }

    public static void showMenu() {
        System.out.println("-----------     MENU     -----------");
        System.out.println("Choose 1: Create And Input Information For A New Company.");
        System.out.println("Choose 2: Promote A New Employee To The Head Of Department.");
        System.out.println("Choose 3: Add A New Employee To The Company.");
        System.out.println("Choose 4: Fire A Employee Out Of The Company.");
        System.out.println("Choose 5: Get Information of Employees Of The Company.");
        System.out.println("Choose 6: Calculate The Total Amount Of Salary Of The Company.");
        System.out.println("Choose 7: Find The Regular Staff Who Has The Highest Salary.");
        System.out.println("Choose 8: Find The Head Of Department Who Has The Most Inferior Employees.");
        System.out.println("Choose 9: Sort Employees Of The Company In Alphabetical Order.");
        System.out.println("Choose 10: Sort Employees Of The Company In Salary Order");
        System.out.println("Choose 11: Find The Director Who Has The Highest Percentage Of Shares.");
        System.out.println("Choose 12: Calculate The Total Income Of Each Director.");
        System.out.println("Choose 0: Exit.");
        System.out.println("-----------     END     -----------");
    }

    // create and get information for a new company
    public static Company createANewCompany(Company company) {

        // use scanner to get information of the company
        Scanner companyScanner = new Scanner(System.in);
        System.out.print("Name Of Company: ");
        company.setNameOfCompany(companyScanner.nextLine());
        System.out.print("Index Of Tax: ");
        company.setTaxID(companyScanner.nextLine());
        System.out.print("Revenue Of Company Per Month: ");
        company.setRevenueOfMonth(companyScanner.nextInt());

        // process scanner
        //companyScanner.close();

        //System.out.println(newCompany.toString());

        // return the new company
        return company;
    }

    // promote an employee to head of department
    public static void promoteAHeadOfDepartment(Company company, Employee employee) {
        employee.newEmployee();
        HeadOfDepartment newHeadOfDepartment = new HeadOfDepartment();
        newHeadOfDepartment.setFullName(employee.getFullName());
        newHeadOfDepartment.setSalaryPerDay(200);
        newHeadOfDepartment.setEmployeeID(employee.getEmployeeID());
        newHeadOfDepartment.setPhoneNumber(employee.getPhoneNumber());
        newHeadOfDepartment.setWorkingDays(employee.getWorkingDays());
        newHeadOfDepartment.setNumberOfInferiorStaffs(0);
        System.out.println("Successfully Promote A New Head Of Department!\nThe New Head Of Department Is: ");
        System.out.println(newHeadOfDepartment.toString());
        company.getArrayListEmployee().add(newHeadOfDepartment);
    }

    // add an employee to the company
    public static void addEmployee(Company company, Employee employee) {
        employee.newEmployee();
        System.out.println("Successfully Promote A New Employee!\nThe New Employee Is: ");
        System.out.println(employee.toString());
        company.getArrayListEmployee().add(employee);
    }

    // delete the information of an employee of the company
    public static void deleteInformationOfEmployee(Company company) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Name Of Employee Who Gonna Be Fired: ");
        String tempName = inputScanner.nextLine();

        for (Employee element : company.getArrayListEmployee()) {
            if (element.getFullName().equals(tempName)) {
                company.getArrayListEmployee().remove(element);
                System.out.println("Successfully Remove The Employee: " + tempName);
                break;
            }
        }

        // remove references if a head of department is removed
        for (Employee element : company.getArrayListEmployee()) {
            if (element.getSalaryPerDay() == 100) {
                RegularStaff tempRegularStaff = (RegularStaff) element;
                if (tempRegularStaff.getHeadOfManagement().equals(tempName)) {
                    tempRegularStaff.setHeadOfManagement(null);
                }
            }
        }
        getInformationOfEmployeesOfCompany(company);
    }

    // all employees of company
    public static void getInformationOfEmployeesOfCompany(Company company) {
//        System.out.println("All Information Of The Company Is: ");
        company.getArrayListEmployee().forEach((a) -> System.out.println(a.toString()));
    }

    // calculate total amount of salary of the company
    public static Integer getTotalAmountOfSalaryOfCompany(Company company) {
        Integer totalSalary = 0;
        for (Employee element : company.getArrayListEmployee()) {
            totalSalary += element.calculateSalaryPerMonth();
        }
        System.out.println("Total Amount Of Salary Of The Company Is: " + totalSalary);
        return totalSalary;
    }

    // find the regular staff who has the highest salary
    public static void getRegularStaffHasHighestSalary(Company company) {
        RegularStaff flagRegularStaff = new RegularStaff();
        for (Employee element : company.getArrayListEmployee()) {
            if (element.getSalaryPerDay() == 100) {
                if (element.calculateSalaryPerMonth() > flagRegularStaff.calculateSalaryPerMonth()) {
                    flagRegularStaff = (RegularStaff) element;
                }
            }
        }

        if (flagRegularStaff.calculateSalaryPerMonth() == 0) {
            System.out.println("The (First In The List) Regular Staff Who Has The Highest Salary Does Not Exist!");
        } else {
            System.out.println("The (First In The List) Regular Staff Who Has The Highest Salary Is: " + flagRegularStaff.getFullName());
            System.out.println(flagRegularStaff.toString());
        }
    }

    // find the head of department who has the most inferior employees
    public static void getHeadOfDepartmentHasMostEmployees(Company company) {
        HeadOfDepartment flagHeadOfDepartment = new HeadOfDepartment();
        for (Employee element : company.getArrayListEmployee()) {
            if (element.getSalaryPerDay() == 200) {
                if (((HeadOfDepartment) element).getNumberOfInferiorStaffs() > flagHeadOfDepartment.getNumberOfInferiorStaffs()) {
                    flagHeadOfDepartment = (HeadOfDepartment) element;
                }
            }
        }

        if (flagHeadOfDepartment.getNumberOfInferiorStaffs() == 0) {
            System.out.println("The (First In The List) Head Of Department Who Has The Most Employees Under Does Not Exist!");
        } else {
            System.out.println("The (First In The List) Head Of Department Who Has The Most Employees Under Is: " + flagHeadOfDepartment.getFullName());
            System.out.println(flagHeadOfDepartment.toString());
        }
    }

    // sort employees of the company in alphabetical order
    public static void sortEmployeesInAlphabeticalOrder(Company company) {
        Collections.sort(company.getArrayListEmployee(), new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getFullName().compareToIgnoreCase(o2.getFullName());
            }
        });
        System.out.println("The List Of Employees Of The Company After Sorting In Alphabet Order Is: ");
        getInformationOfEmployeesOfCompany(company);
    }

    // sort employees of the company in salary order
    public static void sortEmployeesInSalaryOrder(Company company) {
        Collections.sort(company.getArrayListEmployee(), new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.calculateSalaryPerMonth() > o2.calculateSalaryPerMonth()) {
                    return 0;
                }
                return 1;
            }
        });
        System.out.println("The List Of Employees Of The Company After Sorting In Salary Order Is: ");
        getInformationOfEmployeesOfCompany(company);
    }

    // find the director who has the highest percentage of shares
    public static void getDirectorHasHighestShares(Company company) {
        Director flagDirector = new Director();
        for (Employee element : company.getArrayListEmployee()) {
            if (element.getSalaryPerDay() == 300) {
                if (((Director) element).getPercentageOfShares() > flagDirector.getPercentageOfShares()) {
                    flagDirector = (Director) element;
                }
            }
        }

        if (flagDirector.getPercentageOfShares() == 0) {
            System.out.println("The (First In The List) Head Of Department Who Has The Highest Percentage Of Shares Does Not Exist!");
        } else {
            System.out.println("The (First In The List) Head Of Department Who Has The Highest Percentage Of Shares Is: " + flagDirector.getFullName());
            System.out.println(flagDirector.toString());
        }
    }

    // calculate total income of each director
    public static void calculateTotalIncomeOfDirector(Company company) {
        ArrayList<String> arrayTotalIncomeOfDirector = new ArrayList<String>();
        String tempResult = "";
        Double totalIncome = 0.0;
        Director tempDirector = null;
        for (Employee element : company.getArrayListEmployee()) {
            if (element.getSalaryPerDay() == 300) {
                tempDirector = (Director) element;
                totalIncome = tempDirector.calculateSalaryPerMonth() + tempDirector.getPercentageOfShares() *
                        (company.getRevenueOfMonth() - getTotalAmountOfSalaryOfCompany(company));
                tempResult += "@ Name Director: " + tempDirector.getFullName() + ", Total Income: " + totalIncome
                        + "\n" + tempDirector.toString();
                arrayTotalIncomeOfDirector.add(tempResult);
            }
            tempResult = "";
        }
        arrayTotalIncomeOfDirector.forEach((a) -> System.out.println(a.toString()));
    }

}
