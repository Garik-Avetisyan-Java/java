package homeworks.employee;
import java.util.Objects;
public class Employee {
    private String name;
    private String surname;
    private String employeeID;
    private double salary;
    private String company;
    private String position;
    public Employee() {

    }
    public Employee(String name, String surname, String employeeID, double salary, String company, String position) {
        this.name = name;
        this.surname = surname;
        this.employeeID = employeeID;
        this.salary = salary;
        this.company = company;
        this.position = position;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getEmployeeID() {
        return employeeID;
    }
    public double getSalary() {
        return salary;
    }
    public String getCompany() {
        return company;
    }
    public String getPosition() {
        return position;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    @Override
    public String toString() {
        return "Name: " + name +
        "\nSurname: " + surname +
        "\nEmployee ID: " + employeeID +
        "\nSalary: " + salary +
        "\nCompany: " + company +
        "\nPosition: " + position;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee employee = (Employee) obj;
        return Objects.equals(employeeID, employee.employeeID);
    }
    @Override
    public int hashCode() {
        return Objects.hash(employeeID);
    }

}
