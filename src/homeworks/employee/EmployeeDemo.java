
package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage storage = new EmployeeStorage();
        boolean running = true;
        while (running) {
            System.out.println("\nPlease input 0 for EXIT");
            System.out.println("Please input 1 for ADD EMPLOYEE");
            System.out.println("Please input 2 for PRINT ALL EMPLOYEES");
            System.out.println("Please input 3 for SEARCH EMPLOYEE BY ID");
            System.out.println("Please input 4 for SEARCH EMPLOYEES BY COMPANY NAME");
            System.out.println("Please input 5 for SEARCH EMPLOYEES BY MINIMUM SALARY");
            System.out.println("Please input 6 for DELETE EMPLOYEE BY ID");
            System.out.print("\nInput: ");
            int command = scanner.nextInt();
            scanner.nextLine();
            switch (command) {
                case 0:
                    running = false;
                    System.out.println("Program finished.");
                    break;
                case 1:
                    System.out.println("Please input employee name:");
                    String name = scanner.nextLine();
                    System.out.println("Please input employee surname:");
                    String surname = scanner.nextLine();
                    System.out.println("Please input employee ID:");
                    String employeeID = scanner.nextLine();
                    System.out.println("Please input employee salary:");
                    double salary = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Please input employee company:");
                    String company = scanner.nextLine();
                    System.out.println("Please input employee position:");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(
                            name, surname, employeeID,
                            salary, company, position
                    );
                    if (storage.addEmployee(employee)) {
                        System.out.println("Employee successfully added!");
                    } else {
                        System.out.println(
                                "Employee with ID " + employeeID + " already exists."
                        );
                    }
                    break;
                case 2:
                    storage.printAllEmployees();
                    break;
                case 3:
                    System.out.println("Please input employee ID:");
                    String searchID = scanner.nextLine();
                    Employee foundEmployee = storage.findEmployeeByID(searchID);
                    if (foundEmployee != null) {
                        System.out.println("\nEmployee found:");
                        System.out.println(foundEmployee);
                    } else {
                        System.out.println(
                                "Employee with ID " + searchID + " not found."
                        );
                    }
                    break;
                case 4:
                    System.out.println("Please input company name:");
                    String searchCompany = scanner.nextLine();
                    storage.searchByCompany(searchCompany);
                    break;
                case 5:
                    System.out.println("Please input minimum salary:");
                    double minimumSalary = scanner.nextDouble();
                    scanner.nextLine();
                    storage.searchByMinimumSalary(minimumSalary);
                    break;
                case 6:
                    System.out.println("Please input employee ID:");
                    String deleteID = scanner.nextLine();
                    if (storage.deleteEmployeeByID(deleteID)) {
                        System.out.println("Employee successfully deleted!");
                    } else {
                        System.out.println(
                                "Employee with ID " + deleteID + " not found."
                        );
                    }
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
