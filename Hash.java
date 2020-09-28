import java.util.Set;
import java.util.HashMap;
public class Hash {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Hurricane", "No matter how many times that you told me you wanted to leave No matter how many breaths that you took you still couldn't breathe No matter how many nights that you'd lie wide awake to the sound of the poison rain Where did you go? Where did you go? Where did you go?");

        userMap.put("Do or Die", "In the middle of the night, when the angels scream, I don't want to live a lie that I believe. Time to do or die. I will never forget the moment, the moment. I will never forget the moment. And the story goes on... on... on... That's how the story goes. That's how the story goes.");

        userMap.put("Attack", "I won't suffer, be broken Get tired or wasted Surrender to nothing Or give up what I started And stop this From end to beginning A new day is coming And I am finally free");

        userMap.put("Alibi", "No warning sign, no alibi Were fading faster than the speed of light Took our chance, crashed and burned No, we'll never ever learn");

        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println("Title : " + key);
            System.out.println("Lyrics : " + userMap.get(key));    
        }
        System.out.println("Attack : " + userMap.get("Attack"));

    }
}