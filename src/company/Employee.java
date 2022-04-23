package company;

public class Employee {
    private String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Wydołuje konstruktor klasy Employee z argumentami: " + name + " i " + salary);
    }

    public int getSalary() {
        return salary;
    }

    public void show() {
        System.out.println("Mam na imię: " + name + " i zarabiam " + salary);
    }
}
