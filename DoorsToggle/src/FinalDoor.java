import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Collins K. Sang
 * 11/7/22 9:55 AM
 * VirtualPay
 * FinalDoor
 * IntelliJ IDEA
 **/
public class FinalDoor {

    public FinalDoor() {
    }

    public List<String> doors(int numDoors) {

        List<String> doors = new ArrayList<String>();
        int num = 0;
        while (num < numDoors) {
            doors.add("closed");
            num += 1;
        }
        //make the pass
        for (var rounds = 1; rounds <= numDoors; rounds++) {

            for (var i = 0; i < numDoors; i++) {
                if (i % rounds == 0) {
                    doors.set(i, toggle(doors.get(i)));
                }
            }

        }
        List<String> doorToggle = new ArrayList<String>();
        //check the doors
        for (var i = 0; i < 100; i++) {
            doorToggle.add(i, doors.get(i) + " " + i);
        }
        return doorToggle;
    }

    public static String toggle(String toggle) {
        if (Objects.equals(toggle, "closed")) {
            return "open";
        } else {
            return "closed";
        }
    }
}
