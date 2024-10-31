import java.util.ArrayList;
import java.util.function.IntFunction;

public class Employees extends ArrayList<String> {
    private int serviceNumber;
    private String phoneNumber;
    private String name;
    private int workExperience;

    public Employees(int serviceNumber, String phoneNumber, String name, int workExperience) {
        this.name = name;
        this.workExperience = workExperience;
        this.phoneNumber = phoneNumber;
        this.serviceNumber = serviceNumber;
    }

    public int getServiceNumber() {
        return serviceNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    @Override
    public String toString() {
        return "\n" +
                "{" +
                "Табельный номер = " + serviceNumber +
                ", Номер телефона = " + phoneNumber +
                ", Имя = '" + name + '\'' +
                ", Стаж = " + workExperience +
                '}';
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        T[] array = super.toArray(generator);
        return array;
    }
}
