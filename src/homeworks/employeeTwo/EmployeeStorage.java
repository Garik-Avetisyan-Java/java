package homeworks.employeeTwo;

import java.util.Arrays;

public class EmployeeStorage {

    private Employee[] employees = new Employee[10];
    private int size = 0;

    public boolean add(Employee employee) {
        if (employee == null || employee.getEmployeeId() == null) {
            return false;
        }
        if (getById(employee.getEmployeeId()) != null) {
            return false;
        }
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
        return true;
    }

    public void printAll() {
        if (size == 0) {
            System.out.println("No employees found.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
            System.out.println("--------------------");
        }
    }

    public Employee getById(String id) {
        if (id == null) {
            return null;
        }
        for (int i = 0; i < size; i++) {
            if (id.equals(employees[i].getEmployeeId())) {
                return employees[i];
            }
        }
        return null;
    }

    public void printByCompanyName(String name) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Company company = employees[i].getCompany();
            if (company != null && company.getName().equalsIgnoreCase(name)) {
                System.out.println(employees[i]);
                System.out.println("--------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found for this company.");
        }
    }

    public void printByCompanyId(String id) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Company company = employees[i].getCompany();
            if (company != null && company.getCompanyId().equals(id)) {
                System.out.println(employees[i]);
                System.out.println("--------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found for this company.");
        }
    }

    // Bonus 1 — Count Employees by Company
    public int countEmployeesByCompany(String companyId) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            Company company = employees[i].getCompany();
            if (company != null &&  company.getCompanyId().equals(companyId)) {
                count++;
            }
        }
        return count;
    }

    // Bonus 2 — Calculate Total Salary by Company
    public double calculateTotalSalaryByCompany(String companyId) {
        double totalSalary = 0;
        for (int i = 0; i < size; i++) {
            Company company = employees[i].getCompany();
            if (company != null && company.getCompanyId().equals(companyId)) {
                totalSalary += employees[i].getSalary();
            }
        }
        return totalSalary;
    }

    // Bonus 3 — Find Employee With Highest Salary
    public Employee getHighestSalaryEmployee() {
        if (size == 0) {
            return null;
        }
        Employee highestSalaryEmployee = employees[0];
        for (int i = 1; i < size; i++) {
            if (employees[i].getSalary() > highestSalaryEmployee.getSalary()) {
                highestSalaryEmployee = employees[i];
            }
        }
        return highestSalaryEmployee;
    }

    // Bonus 4 — Delete Employee
    public boolean removeById(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(id)) {
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null;
                return true;
            }
        }
        return false;
    }
    private void extend() {
        employees = Arrays.copyOf(employees, employees.length + 10);
    }
}