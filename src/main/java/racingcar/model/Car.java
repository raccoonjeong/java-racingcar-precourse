package racingcar.model;

public class Car {

    private int distance;

    public int getDistance() {
        return distance;
    }

    public void supplyPower(int power) {
        if (isBitingPoint(power)) {
            distance ++;
        }
    }

    public static boolean isBitingPoint(int power) {
        return power >= 4;
    }
}
