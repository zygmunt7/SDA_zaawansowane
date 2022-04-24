package electronics;

public class Phone extends Device implements EmailSender{

    private String number;

    public Phone(String model, String number) {
        super(model);
        this.number=number;
    }

    @Override
    public void turnOn() {
        System.out.println("Podswietlamy ekran "+model);

    }

    @Override
    public void turnOff() {
        System.out.println("Wyłączemy  ekran "+model);

    }
    public void makeCall(String number){
        System.out.println("Telefon " +model+" dzwoni "+number);
    }

    @Override
    public void sendEmail(String message) {


    }
}
