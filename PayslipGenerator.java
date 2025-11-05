class Employee {
    String empName;
    int empId;
    String address;
    String mailId;
    long mobileNo;

    Employee(String empName, int empId, String address, String mailId, long mobileNo) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Address: " + address);
        System.out.println("Employee Mail ID: " + mailId);
        System.out.println("Employee Mobile No: " + mobileNo);
    }
}

// Base class for salary-related roles
class Programmer extends Employee {
    double basicPay;

    Programmer(String empName, int empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }

    void generatePayslip() {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - staffClubFund;

        displayDetails();
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("--------------------------------------------------");
    }
}

class AssistantProfessor extends Programmer {
    AssistantProfessor(String empName, int empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class AssociateProfessor extends Programmer {
    AssociateProfessor(String empName, int empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class Professor extends Programmer {
    Professor(String empName, int empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

public class PayslipGenerator {
    public static void main(String[] args) {
        Programmer prog = new Programmer("Vaibhav", 11, "Mangalwar Peth", "vaibhavdatkhil@gmail.com", 9518545614L, 80000);
        AssistantProfessor as = new AssistantProfessor("Vaibhav", 12, "Mangalwar Peth", "vaibhavdatkhil@gmail.com", 9518545614L, 85000);
        AssociateProfessor ass = new AssociateProfessor("Vaibhav", 13, "Mangalwar Peth", "vaibhavdatkhil@gmail.com", 9518545614L, 90000);
        Professor pro = new Professor("Vaibhav", 14, "Mangalwar Peth", "vaibhavdatkhil@gmail.com", 9518545614L, 100000);

        prog.generatePayslip();
        as.generatePayslip();
        ass.generatePayslip();
        pro.generatePayslip();
    }
}