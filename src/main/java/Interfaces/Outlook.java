package Interfaces;

public class Outlook implements EmailServiceProvider {
    @Override
    public void createEmailMessage() {
        System.out.println("Outlook email has been created.");
    }
}
