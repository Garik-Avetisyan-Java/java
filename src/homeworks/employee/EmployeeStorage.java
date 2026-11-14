package homeworks.employee;
public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size;
    public boolean addEmployee(Employee employee) {
        if (employee == null) {
            return false;
        }
        // Bonus 1 — Ստուգել Employee ID-ի եզակիությունը
        if (findEmployeeByID(employee.getEmployeeID()) != null) {
            return false;
        }
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
        return true;
    }
    private void extend() {
        Employee[] temp = new Employee[employees.length + 10];
        for (int i = 0; i < employees.length; i++) {
            temp[i] = employees[i];
        }
        employees = temp;
    }
    public void printAllEmployees() {
        if (size == 0) {
            System.out.println("No employees found.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            System.out.println(employees[i]);
            System.out.println("-------------------------");
        }
    }
    public Employee findEmployeeByID(String employeeID) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(employeeID)) {
                return employees[i];
            }
        }
        return null;
    }
    public void searchByCompany(String company) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().equalsIgnoreCase(company)) {

                if (!found) {
                    System.out.println("\nEmployees:");
                }
                System.out.println(
                        employees[i].getName() + " " +
                                employees[i].getSurname() + " - " +
                                employees[i].getPosition()
                );

                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found for company " + company + ".");
        }
    }
    // Bonus 2 — Որոնել աշխատակիցներին ըստ աշխատավարձի
    public void searchByMinimumSalary(double minimumSalary) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() >= minimumSalary) {

                System.out.println("\n" + employees[i]);
                System.out.println("-------------------------");

                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found with this salary.");
        }
    }
    // Bonus 3 — Հեռացնել աշխատակցին ID-ով
    public boolean deleteEmployeeByID(String employeeID) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(employeeID)) {
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }
}
