package Saim_practice.SocialMedia;

public abstract class SocialMedia {

//    Social Media
//• Create an abstract class SocialMedia
//• The SocialMedia class will have the following fields:
//            - Personal url (String)
//- Account length (int)
//- Platform (static String)
//- Username
//- Password
//- Full name
//• The SocialMedia class will have the following abstract methods:
//            - Direct messaging (String username, String message)
//            - Post (Object media) [using Object type as the parameter]
//            - Notifications ()

    String personalURL;
    int accountLength;
    static String platform;
    String username;
    String password;
    String fullName;

    public abstract void directMessaging(String username, String message);
    public abstract void post(Object media);
    public abstract void notification();

}
