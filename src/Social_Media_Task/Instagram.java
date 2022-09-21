package Social_Media_Task;

import java.time.LocalTime;
import java.util.ArrayList;

public class Instagram extends SocialMedia implements Pictures{
    /*
    Instagram Class:

• Create a class Instagram that will inherit the SocialMedia class

• Add additional instance variables: number of followers, number of
followings, and pictures (ArrayList of Pictures)

• Set the platform for all objects to be "Instagram"

• Encapsulate the variables

• Create a constructor to initialize the username and password
 - Set up the user's person url:
  "Instagram.com/" + $username

• Implement all the abstract methods coming from the Social Media class

o Direct messaging (String username, String message)
 - print = %message sent to %username

o Post (Object body)
 - Let’s keep it simple and say our variable body will be a picture)
  Add the picture object

o Notifications ()
- Checks the current time. If the time is between 10 am - 8 pm print "Notification",
otherwise print "Sleep mode"

 Note: use this code to get the current hour: LocalTime.now().getHour()
- The return value will be given in 24 hour format.
     */



    private int numberOfFollowers;
    private int numberOfFollowings;
    ArrayList<Picture> pictures;

    static{
        platform = "Instagram";
    }

    public int getNumberOfFollowers(){
      return numberOfFollowers;
    }
    public void setNumberOfFollowers(int numberOfFollowers){
        this.numberOfFollowers = numberOfFollowers;
    }
    public int getNumberOfFollowings(){
        return numberOfFollowings;
    }
    public void setNumberOfFollowings(int numberOfFollowings){
        this.numberOfFollowings = numberOfFollowings;
    }

    public Instagram(String username, String password){
        this.username = username;
        this.password = password;
        personalURL = "Instagram.com/" + username;
    }

    public Instagram(String username, String password, String fullName, int numberOfFollowers, int numberOfFollowings){
        this(username, password);
        this.fullName = fullName;
        this.numberOfFollowers = numberOfFollowers;
        this.numberOfFollowings = numberOfFollowings;
    }

    @Override
    public void directMessaging(String username, String message) {
        System.out.println(message + " sent to " + username);
    }

    @Override
    public void Post(Object media) {
        pictures.add((Picture)media);
    }

    @Override
    public void Notification() {
        int localTime = LocalTime.now().getHour();
        if (localTime >= 10 && localTime <= 20){
            System.out.println("Notification");
        }
        else {
            System.out.println("Sleep mode");
        }
    }

    @Override
    public void likePicture() {
        System.out.println("Picture was liked");
    }

    @Override
    public void unLikePicture() {
        System.out.println("Picture was unliked");
    }

    @Override
    public void sharePicture() {
        System.out.println("Picture was shared");
    }

    @Override
    public String toString() {
        return "Instagram{" +
                "numberOfFollowers=" + numberOfFollowers +
                ", numberOfFollowings=" + numberOfFollowings +
                ", pictures=" + pictures +
                ", personalURL='" + personalURL + '\'' +
                ", accountLength=" + accountLength +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                '}' + "\n";
        //
    }
}
