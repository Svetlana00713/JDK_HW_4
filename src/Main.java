public class Main {
    public static void main(String[] args) {
        EmployeeDirectory dir = new EmployeeDirectory();

        Employees employee1 = new Employees(1,"666333","Горячев Дмитрий",5);
        Employees employee2 = new Employees(2,"777555","Телегина Анна",1);
        Employees employee3 = new Employees(3,"987654","Барсуков Олег",7);
        Employees employee4 = new Employees(4,"123123","Князев Дмитрий",3);
        Employees employee5 = new Employees(5,"781089","Телегина Анна",4);

        dir.addEmployee(employee1);
        dir.addEmployee(employee2);
        dir.addEmployee(employee3);
        dir.addEmployee(employee4);
        dir.addEmployee(employee5);
        System.out.println(dir);
        System.out.println();

        System.out.println("1. Поиск сотрудника по стажу: ");
        System.out.println(dir.searchByExperience(5));

//      2. Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
        System.out.println();
        System.out.println("2. Поиск номера телефона сотрудника по имени: ");
        System.out.println(dir.getPhoneByName("Князев Дмитрий"));

//      3. Добавить метод, который ищет сотрудника по табельному номеру
        System.out.println();
        System.out.println("3. Поиск сотрудника по табельному номеру: ");
        System.out.println(dir.searchByServiceNumber(3));

//      4. Добавить метод добавление нового сотрудника в справочник
        System.out.println();
        System.out.println("4. Добавляем сотрудника Петрова Сергея: ");
        Employees employee6 = new Employees(6,"345111","Петров Сергей",10);
        dir.addEmployee(employee6);

        System.out.println(dir);
    }
}