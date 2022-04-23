import company.Employee;
import company.Menager;
import company.Secretary;

public class CompanyMain {
    public static void main(String[] args) {
        Employee employeeOne = new Employee("Jan", 200);
        Menager employeeTwo = new Menager("Bogdan", 250, 50);
        Secretary employeeThree = new Secretary("Ela", 210);

        employeeTwo.show();
    }
}
