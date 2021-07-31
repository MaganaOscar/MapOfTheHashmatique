import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("morning","it's morning again");
        trackList.put("night","it's night already");
        trackList.put("alone","would be nice to be alone never");
        trackList.put("silent","silence is tempting");

        System.out.println(trackList.get("alone"));

        Set<String> tracks = trackList.keySet();
        for (String track : tracks) {
            System.out.println(String.format("%s : %s", track, trackList.get(track)));
        }
    }
}