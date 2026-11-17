package homeworks.employeeTwo;
import java.util.Objects;
public class Employee {

    private String name;
    private String surname;
    private String employeeId;
    private double salary;
    private Company company;
    private String position;

    public Employee() {

    }

    public Employee(String name, String surname, String employeeId, double salary, Company company, String position) {

        this.name = name;
        this.surname = surname;
        this.employeeId = employeeId;
        this.salary = salary;
        this.company = company;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId +
                "\nName: " + name + " " + surname +
                "\nSalary: " + salary +
                "\nPosition: " + position +
                "\nCompany: " +
                (company == null ? "Not assigned" : company.getName());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee employee = (Employee) obj;

        return Objects.equals(employeeId, employee.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }
}