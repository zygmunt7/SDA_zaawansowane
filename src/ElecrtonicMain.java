import electronics.MailMachine;
import electronics.Phone;
import electronics.Radio;
import electronics.Tablet;

public class ElecrtonicMain {
    public static void main(String[] args) {
        MailMachine mailMachine = new MailMachine();

        Phone phone1= new Phone("S20", "123-456-235");
        Phone phone2= new Phone("S21", "123-698-235");

        Tablet tab = new Tablet("Tab");
        Radio radio = new Radio("Radio");

        mailMachine.addEmailSender(phone1);
        mailMachine.addEmailSender(phone2);
        mailMachine.addEmailSender(tab);

        mailMachine.sendEmail("Tajna wiadomość");


    }
}
