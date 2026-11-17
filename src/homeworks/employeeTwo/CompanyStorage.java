package homeworks.employeeTwo;
import java.util.Arrays;
public class CompanyStorage {
    private Company[] companies = new Company[10];
    private int size = 0;
    public boolean add(Company company) {
        if (company == null || company.getCompanyId() == null) {
            return false;
        }
        if (getById(company.getCompanyId()) != null) {
            return false;
        }
        if (size == companies.length) {
            extend();
        }
        companies[size++] = company;
        return true;
    }

    public void printAll() {
        if (size == 0) {
            System.out.println("No companies found.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(companies[i]);
            System.out.println("--------------------");
        }
    }

    public Company getById(String id) {
        if (id == null) {
            return null;
        }
        for (int i = 0; i < size; i++) {
            if (id.equals(companies[i].getCompanyId())) {
                return companies[i];
            }
        }
        return null;
    }

    public boolean removeById(String id) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getCompanyId().equals(id)) {
                for (int j = i; j < size - 1; j++) {
                    companies[j] = companies[j + 1];
                }
                companies[--size] = null;
                return true;
            }
        }
        return false;
    }

    private void extend() {
        companies = Arrays.copyOf(companies, companies.length + 10);
    }
}