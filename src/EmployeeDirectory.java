import java.util.ArrayList;

public class EmployeeDirectory {
    ArrayList<Employees> employees;

    public EmployeeDirectory() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employees employee) {
        this.employees.add(employee);
    }

    public ArrayList<Employees> searchByExperience(int workExperience) {
        ArrayList<Employees> result = new ArrayList<>();
        for (Employees employee : this.employees) {
            if (employee.getWorkExperience() == workExperience) {
                result.add(employee);
            }
        }
        return result;
    }

    public ArrayList<String> getPhoneByName(String name) {
        ArrayList<String> phoneNumbers = new ArrayList<>();
        for (Employees employee : this.employees) {
            if (employee.getName().equals(name)) {
                phoneNumbers.add(employee.getPhoneNumber());
            }
        }
            return phoneNumbers;
        }

        public Employees searchByServiceNumber(int serviceNumber) {
            for (Employees employee : this.employees) {
                if (employee.getServiceNumber() == serviceNumber) {
                    return employee;
                }
            }
            return null;
        }

    @Override
    public String toString() {
        return "Сотрудники: " + "\n" + employees;
    }
}
