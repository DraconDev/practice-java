package java_course;
public class Lasagna {
    int minutes = 40;

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return minutes;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minute) {
        minutes -= minute;
        return minutes;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layer) {
        return layer * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layer, int minutes) {
        return preparationTimeInMinutes(layer) + minutes;
    }

    public static void main(String[] args) {
        // Lasagna lasagna = new Lasagna();
        // System.out.println(lasagna.expectedMinutesInOven());
    }
}
