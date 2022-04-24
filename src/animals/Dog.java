package animals;

public class Dog extends Animal implements FastRunner{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void saySomething() {
        System.out.println(name+ " hau hau");

    }

    @Override
    public void run() {

    }

    @Override
    public void runFaster() {

    }
}
