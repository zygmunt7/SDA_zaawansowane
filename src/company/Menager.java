package company;

public class Menager extends Employee{

    private int bonus;

    public Menager(String name, int salary) {
        super(name, salary);
        System.out.println("Wywołuję konstruktor z klasy Menager z argumentami "+name + " i "+salary);
    }

    public Menager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
        System.out.println("Wywołuję konstruktor z klasy Menager z argumentami "+name + " i "+salary+" i "+bonus);

    }
    public void makeSpeech(){
        System.out.println("Do pracy!!!");
    }
    public int getSalary(){
       // return super.getSalary() + bonus;
        return salary + bonus;
    }
    public void makeSpeech(String additionalMessage){
        makeSpeech();
        System.out.println(additionalMessage);
    }

}
