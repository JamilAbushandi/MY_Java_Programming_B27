package Social_Media_Task;

import java.time.LocalTime;
import java.util.ArrayList;


public class Facebook extends SocialMedia implements hasGroups{
//    Facebook
//
//• Create a class for a Facebook which inherits the SocialMedia class and has
//            additional instance variables:
//    age, number of friends, and posts (java.util.ArrayList of Post)
//
//• Encapsulate all the variables.
//
//            • Set the platform for "Facebook" using static block
//
//• Create a constructor that will create a Facebook by taking the username and
//    password.
//
// - If the password contains the username, then it is not a valid password and
//    should not be saved. In this case Print “Password contained username. Default
//    password created: ‘password’ and set the password for the user to the default of
//‘password’.
//
//            - Create and assign the user's person url by using 'facebook.com/' and adding
//    their username at the end
//
// - Create an empty ArrayList of Posts


    private int age;
    private int numberOfFriends;
    ArrayList<Post> posts;

    public Facebook(String username, String password){
        this.username = username;
        if (password.contains(username)){
            System.out.println("Password contained username");
            password = "password";
        }
        else {

            this.password = password;
        }
        personalURL = "facebook.com/" + username;
        posts = new ArrayList<>();

    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getNumberOfFriends(){
        return numberOfFriends;
    }
    public void setNumberOfFriends(int numberOfFriends){
        this.numberOfFriends = numberOfFriends;
    }
    static{
        platform = "Facebook";
    }
    /*
    • Overload the constructor to accept the username, password, and the user’s
name. Chain previous constructor

 - If the name entered has any characters that are not letters from the
alphabet, then the name is invalid. In this case print “invalid name” and assign the
name value to be ‘no name’

• Overload the constructor to accept the username, password, the user’s
name, age and number of friends. Chain previous constructor

 - Only store the age and number of friends into the variables if they are valid
numbers.

- The age cannot be a negative number
- The number of friends cannot be negative or more than 5000.

If they are invalid print “Invalid (age/number of friends) and keep the values as
the default of 0.
     */

    public Facebook(String username, String password, String fullName){
        this(username, password);
        String a = "";
        for (int i = 0; i <fullName.length() ; i++) {
            if(Character.isAlphabetic(fullName.charAt(i))){
                a+= fullName.charAt(i);
            }
        }
        if (a.equals(fullName)) {
            this.fullName = fullName;
        }
        else {
            System.out.println("invalid name");
            this.fullName = "no name";
        }
    }

    public Facebook(String username, String password, String fullName, int age, int numberOfFriends){
        this(username, password, fullName);

        if (age >= 0){
            this.age = age;
        }
        else {
            System.out.println("invalid age");
            this.age = 0;
        }

        if (numberOfFriends >=0 && numberOfFriends <= 5000){
            this.numberOfFriends = numberOfFriends;
        }
        else {
            System.out.println("invalid number of friends");
            this.numberOfFriends = 0;
        }
    }




    /*
    • Implement all methods coming from Social Media class

o Direct messaging (String username, String message)
  - print = %message sent to %username

o Post (Object body)
  - Creates a Post object (the class we made earlier, and store the Post
objects to the ArrayList of Posts)

o Notifications ()
  - Checks the current time. If the time is between 8 am - 5 pm print
"Notification", otherwise print "Sleep mode"

 Note: use this code to get the current hour: LocalTime.now().getHour()
- The return value will be given in 24 hour format.

• Override the toString method to print all the information of a Facebook
     */

    @Override
    public void directMessaging(String username, String message) {
        System.out.println(message + " sent to " + username);
    }

    @Override
    public void Post(Object media) {
        posts.add((Post)media);
    }

    @Override
    public void Notification() {
        int localTime = LocalTime.now().getHour();
        if (localTime >= 8 && localTime <= 17){
            System.out.println("Notification");
        }
        else {
            System.out.println("Sleep mode");
        }
    }

    @Override
    public String toString() {
        return "Facebook{" +
                "age=" + age +
                ", numberOfFriends=" + numberOfFriends +
                ", posts=" + posts +
                ", groups=" + groups +
                ", personalURL='" + personalURL + '\'' +
                ", accountLength=" + accountLength +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }

/*
    • Create a sendFriendRequest method that will accept a Facebook object and
send them a friend request. The method should return a boolean:

if the friend request was sent (true) or if the friend request was not
sent (false).
 - If your friend list is at the 5000 limit then do not send the
request and print “You have reached the limit of friends.”
 - If the user you are trying to send the request to has already hit
the limit, then print “$theUsersName cannot accept any more friend
request.
 - If both the user and you are under the limit print “Friend
request sent to $theUsersName” and increase your number of friends
by one.
     */

    public boolean sendFriendRequest(Facebook Object){

        boolean sent = false;

        if (numberOfFriends >= 5000){
            System.out.println("You have reached the limit of friends.");
        }

        if (Object.numberOfFriends >= 5000){
            System.out.println(Object.username + " cannot accept any more friend requests");
        }

        if (numberOfFriends < 5000 && Object.numberOfFriends < 5000){
            System.out.println("Friend request sent to " + Object.username);
            numberOfFriends+=1;
            Object.numberOfFriends+=1;
            sent = true;
        }

        return sent;
    }

    int groups;

    public void joinGroup(String group){
        System.out.println(username + " has joined " + group);
        groups++;
    }
    public void leaveGroup(String group){
        System.out.println(username + " has left " + group);
        groups--;
    }


}
