import java.util.ArrayList;

public class Company {
    // attributes
    private String nameOfCompany;
    private String taxID;
    private Integer revenueOfMonth;
    private ArrayList<Employee> arrayListEmployee = new ArrayList<>();

    // constructors
    public Company() {
    }

    public Company(String nameOfCompany, String taxID,
                   Integer revenueOfMonth, ArrayList<Employee> arrayListEmployee) {
        this.nameOfCompany = nameOfCompany;
        this.taxID = taxID;
        this.revenueOfMonth = revenueOfMonth;
        this.arrayListEmployee = arrayListEmployee;
    }


    // getters and setters
    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public String getTaxID() {
        return taxID;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public Integer getRevenueOfMonth() {
        return revenueOfMonth;
    }

    public void setRevenueOfMonth(Integer revenueOfMonth) {
        this.revenueOfMonth = revenueOfMonth;
    }

    public ArrayList<Employee> getArrayListEmployee() {
        return arrayListEmployee;
    }

    public void setArrayListEmployee(ArrayList<Employee> arrayListEmployee) {
        this.arrayListEmployee = arrayListEmployee;
    }

    @Override
    public String toString() {
        return "@ Company: " +
                "nameOfCompany='" + nameOfCompany + '\'' +
                ", taxID='" + taxID + '\'' +
                ", revenueOfMonth='" + revenueOfMonth +'\'' +
                ", arrayListEmployee='" + arrayListEmployee + "'";
    }
}
