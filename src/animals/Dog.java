package animals;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void saySomething() {
        System.out.println(name+ " hau hau");

    }
}
