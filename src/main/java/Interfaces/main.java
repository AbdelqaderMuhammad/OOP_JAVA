package Interfaces;

public class main {

    public static void main(String[] args) {

        Gmail gmail = new Gmail();
        gmail.createEmailMessage();
        gmail.saveDraftMessage();
        gmail.makeMeetingCall();
        System.out.println("///////////////////////////////////");
        ////////////////////////////////////////////////////////
        EmailServiceProvider emailServiceProvider = new Gmail();
        emailServiceProvider.createEmailMessage();
        emailServiceProvider.saveDraftMessage();
        System.out.println("/////////////////////////////////////");
        ////////////////////////////////////////////////////////////
        EmailServiceProvider.sendEmail();
        System.out.println("/////////////////////////////////////");
        /////////////////////////////////////////////////////////////
        Outlook outlook = new Outlook();
        outlook.createEmailMessage();
        outlook.saveDraftMessage();
        System.out.println("/////////////////////////////////////");
        ////////////////////////////////////////////////////////////
        EmailServiceProvider emailServiceProvider1 = new Outlook();
        emailServiceProvider1.createEmailMessage();
        emailServiceProvider1.saveDraftMessage();


    }
}
