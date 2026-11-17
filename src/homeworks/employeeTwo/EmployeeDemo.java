package homeworks.employeeTwo;
import java.util.Scanner;
public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CompanyStorage companyStorage = new CompanyStorage();
        EmployeeStorage employeeStorage = new EmployeeStorage();
        boolean running = true;
        while (running) {
            System.out.println("0  - EXIT");
            System.out.println("1  - ADD EMPLOYEE");
            System.out.println("2  - PRINT ALL EMPLOYEES");
            System.out.println("3  - SEARCH EMPLOYEE BY ID");
            System.out.println("4  - SEARCH EMPLOYEES BY COMPANY NAME");
            System.out.println("5  - ADD COMPANY");
            System.out.println("6  - PRINT ALL COMPANIES");
            System.out.println("7  - SEARCH COMPANY BY ID");
            System.out.println("8  - PRINT EMPLOYEES BY COMPANY ID");
            System.out.println("9  - CHANGE EMPLOYEE COMPANY");
            System.out.println("10 - PRINT EMPLOYEE COMPANY");
            System.out.println("11 - COUNT EMPLOYEES BY COMPANY");
            System.out.println("12 - CALCULATE TOTAL SALARY BY COMPANY");
            System.out.println("13 - FIND HIGHEST SALARY EMPLOYEE");
            System.out.println("14 - DELETE EMPLOYEE");
            System.out.println("15 - DELETE COMPANY");
            System.out.print("Input: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid command!");
                scanner.nextLine();
                continue;
            }
            int command = scanner.nextInt();
            scanner.nextLine();
            switch (command) {
                case 0:
                    running = false;
                    System.out.println("Program finished.");
                    break;
                case 1: {
                    System.out.println("Enter employee name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter employee surname:");
                    String surname = scanner.nextLine();
                    System.out.println("Enter employee ID:");
                    String employeeId = scanner.nextLine();
                    System.out.println("Enter employee salary:");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Invalid salary!");
                        scanner.nextLine();
                        break;
                    }
                    double salary = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter employee position:");
                    String position = scanner.nextLine();
                    System.out.println("Enter company ID:");
                    String companyId = scanner.nextLine();
                    Company company = companyStorage.getById(companyId);
                    if (company == null) {
                        System.out.println("Company with ID " + companyId + " not found.");
                        System.out.println("Please add the company first.");
                        break;
                    }

                    Employee employee = new Employee(
                            name,
                            surname,
                            employeeId,
                            salary,
                            company,
                            position
                    );

                    if (employeeStorage.add(employee)) {
                        System.out.println("Employee successfully added!");
                    } else {
                        System.out.println("Employee with this ID already exists!");
                    }

                    break;
                }
                case 2:
                    employeeStorage.printAll();
                    break;
                case 3: {
                    System.out.println("Enter employee ID:");
                    String id = scanner.nextLine();
                    Employee employee = employeeStorage.getById(id);
                    if (employee != null) {
                        System.out.println("Employee found:");
                        System.out.println(employee);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Enter company name:");
                    String companyName = scanner.nextLine();
                    employeeStorage.printByCompanyName(companyName);
                    break;
                }
                case 5: {
                    System.out.println("Enter company ID:");
                    String companyId = scanner.nextLine();
                    System.out.println("Enter company name:");
                    String companyName = scanner.nextLine();
                    System.out.println("Enter industry:");
                    String industry = scanner.nextLine();
                    System.out.println("Enter country:");
                    String country = scanner.nextLine();
                    Company company = new Company(
                            companyId,
                            companyName,
                            industry,
                            country
                    );
                    if (companyStorage.add(company)) {
                        System.out.println("Company successfully added!");
                    } else {
                        System.out.println("Company with this ID already exists!");
                    }
                    break;
                }
                case 6:
                    companyStorage.printAll();
                    break;
                case 7: {
                    System.out.println("Enter company ID:");
                    String id = scanner.nextLine();
                    Company company = companyStorage.getById(id);
                    if (company != null) {
                        System.out.println("Company found:");
                        System.out.println(company);
                    } else {
                        System.out.println("Company not found.");
                    }
                    break;
                }
                case 8: {
                    System.out.println("Enter company ID:");
                    String id = scanner.nextLine();
                    Company company = companyStorage.getById(id);
                    if (company == null) {
                        System.out.println("Company not found.");
                    } else {
                        System.out.println("Company: " + company.getName());
                        System.out.println("Employees:");
                        employeeStorage.printByCompanyId(id);
                    }
                    break;
                }
                case 9: {
                    System.out.println("Enter employee ID:");
                    String employeeId = scanner.nextLine();
                    Employee employee = employeeStorage.getById(employeeId);
                    if (employee == null) {
                        System.out.println("Employee not found.");
                        break;
                    }
                    System.out.println("Current company: " + employee.getCompany().getName());
                    System.out.println("Enter new company ID:");
                    String newCompanyId = scanner.nextLine();
                    Company newCompany = companyStorage.getById(newCompanyId);
                    if (newCompany == null) {
                        System.out.println("Company not found.");
                        System.out.println("Employee's company was not changed.");
                    } else {
                        employee.setCompany(newCompany);
                        System.out.println("Employee company successfully changed!");
                        System.out.println("New company: " + newCompany.getName());
                    }

                    break;
                }
                case 10: {
                    System.out.println("Enter employee ID:");
                    String employeeId = scanner.nextLine();
                    Employee employee = employeeStorage.getById(employeeId);
                    if (employee == null) {
                        System.out.println("Employee not found.");
                        break;
                    }
                    System.out.println("Employee: " +
                            employee.getName() + " " + employee.getSurname());
                    System.out.println("Company information:");
                    System.out.println(employee.getCompany());
                    break;
                }
                // Bonus 1 — Count Employees by Company
                case 11: {
                    System.out.println("Enter company ID:");
                    String companyId = scanner.nextLine();
                    Company company = companyStorage.getById(companyId);
                    if (company == null) {
                        System.out.println("Company not found.");
                        break;
                    }
                    int count = employeeStorage.countEmployeesByCompany(companyId);
                    System.out.println("Company: " + company.getName());
                    System.out.println("Employees count: " + count);
                    break;
                }
                // Bonus 2 — Calculate Total Salary by Company
                case 12: {
                    System.out.println("Enter company ID:");
                    String companyId = scanner.nextLine();
                    Company company = companyStorage.getById(companyId);
                    if (company == null) {
                        System.out.println("Company not found.");
                        break;
                    }
                    double totalSalary =employeeStorage.calculateTotalSalaryByCompany(companyId);
                    System.out.println("Company: " + company.getName());
                    System.out.println("Total salary: " + totalSalary);
                    break;
                }
                // Bonus 3 — Find Employee With Highest Salary
                case 13: {
                    Employee employee = employeeStorage.getHighestSalaryEmployee();
                    if (employee == null) {
                        System.out.println("No employees found.");
                    } else {
                        System.out.println("Employee with highest salary:");
                        System.out.println(employee);
                    }
                    break;
                }
                // Bonus 4 — Delete Employee
                case 14: {
                    System.out.println("Enter employee ID:");
                    String employeeId = scanner.nextLine();
                    if (employeeStorage.removeById(employeeId)) {
                        System.out.println("Employee successfully deleted!");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                }
                // Bonus 5 — Delete Company
                case 15: {
                    System.out.println("Enter company ID:");
                    String companyId = scanner.nextLine();
                    Company company = companyStorage.getById(companyId);
                    if (company == null) {
                        System.out.println("Company not found.");
                        break;
                    }
                    int count = employeeStorage.countEmployeesByCompany(companyId);
                    if (count > 0) {
                        System.out.println("Cannot delete company.");
                        System.out.println("Company has " + count + " employees.");
                    } else {
                        companyStorage.removeById(companyId);
                        System.out.println("Company successfully deleted!");
                    }
                    break;
                }
                default:
                    System.out.println("Invalid command!");
            }
        }
        scanner.close();
    }
}