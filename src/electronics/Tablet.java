package electronics;

public class Tablet extends Device implements EmailSender{

    public Tablet(String model) {
        super(model);
    }

    @Override
    public void turnOn() {
        System.out.println("Tablet "+model+" zostaje włączony");
    }

    @Override
    public void turnOff() {
        System.out.println("Tablet "+model+" zostaje wyłaćzony");

    }
    public void sendMessege(String type, String messege){
        System.out.printf("Wysyła wiadomość typu %s z %s o wartości %s", type, model, messege);
    }

    @Override
    public void sendEmail(String message) {
        System.out.println("Wysyłamy meila z tabletu "+model+" o wartości "+message);
    }
}
