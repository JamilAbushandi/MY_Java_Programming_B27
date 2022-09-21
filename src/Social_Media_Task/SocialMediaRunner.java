package Social_Media_Task;

import java.util.ArrayList;
import java.util.Arrays;

public class SocialMediaRunner {
    public static void main(String[] args) {

        ArrayList<SocialMedia> socialMedia = new ArrayList<>();

        SocialMedia JamilFB = new Facebook("jdaotra", "123456", "JAMIL ABUSHANDI", 29, 3);
        SocialMedia AlperINSTA = new Instagram("Alper The Turkish Guy", "098765", "ALPER OZKAN", 369, 3);
        SocialMedia JoseINSTA = new Instagram("Jose TheSmart Tester","34vff243","JOSE PENSO",1999,690);
        SocialMedia BazFB = new Facebook("Baz TheMilitary Guy","654321", "BAZ MOHAMMAD MUHMAND",34,50);
        SocialMedia JamilINSTA = new Instagram("jdaotra", "123456", "JAMIL ABUSHANDI", 29, 3);
        SocialMedia AlperFB = new Facebook("Alper The Turkish Guy", "098765", "ALPER OZKAN", 369, 3);
        SocialMedia JoseFB = new Facebook("Jose TheSmart Tester","34vff243","JOSE PENSO",1999,690);
        SocialMedia BazINSTA = new Instagram("Baz TheMilitary Guy","654321", "BAZ MOHAMMAD MUHMAND",34,50);



       if(((Facebook)JamilFB).getNumberOfFriends() < 5000){
           socialMedia.add(JamilFB);
       }
       if(((Facebook)BazFB).getNumberOfFriends() < 5000){
           socialMedia.add(BazFB);
       }
       ((Instagram)AlperINSTA).likePicture();
       ((Instagram)JoseINSTA).unLikePicture();

       if (((Facebook)JamilFB).fullName.equals(((Instagram)JamilINSTA).fullName)){
           System.out.println("Jamil has accounts on both social media");
       }
        if (((Facebook)AlperFB).fullName.equals(((Instagram)AlperINSTA).fullName)){
            System.out.println("Alper has accounts on both social media");
        }
        if (((Facebook)JoseFB).fullName.equals(((Instagram)JoseINSTA).fullName)){
            System.out.println("Jose has accounts on both social media");
        }
        if (((Facebook)BazFB).fullName.equals(((Instagram)BazINSTA).fullName)){
            System.out.println("Baz has accounts on both social media");
        }
        System.out.println(JamilFB);
    }
}
