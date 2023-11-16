package java_course;

public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if (speed == 0) {
            return 0;
        }
        double result = 221 * speed;
        if (speed >= 10) {
            result = result * 0.77;
        } else if (speed >= 9) {
            result = result * 0.8;
        } else if (speed >= 5) {
            result = result * 0.9;
        }
        return result;
    }

    public int workingItemsPerMinute(int speed) {
        if (speed == 0) {
            return 0;
        }
        double result = 221 * speed;
        if (speed >= 10) {
            result = result * 0.77;
        } else if (speed >= 9) {
            result = result * 0.8;
        } else if (speed >= 5) {
            result = result * 0.9;
        }
        return (int) (result / 60);
    }
}
