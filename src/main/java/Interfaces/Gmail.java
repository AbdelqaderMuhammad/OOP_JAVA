package Interfaces;

public class Gmail implements EmailServiceProvider{

    @Override
    public void createEmailMessage() {
        System.out.println("Gmail email has been created.");
    }

    @Override
    public void saveDraftMessage() {
        System.out.println("Gmail saved the message");
    }

    // new feature
    public void makeMeetingCall() {
        System.out.println("Meeting call has been set up by Gmail account");
    }
}
