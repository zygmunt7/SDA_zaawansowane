package animals;

public interface Runner {

    void run();
    default void couint(){
        showPrivateCounting();
        run();
    }
    static void staticCopunt(){
        showPrivateStaticCounting();

    }
    private void showPrivateCounting(){
        System.out.println("3. 2. 1...");
    }
    private static void showPrivateStaticCounting(){
        System.out.println("3. 2. 1...");
    }
}
