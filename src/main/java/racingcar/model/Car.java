package racingcar.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Car {

    @Override
    public String toString() {
        return "Car{" +
            "distance=" + distance +
            ", name='" + name + '\'' +
            '}';
    }

    public static final int BITING_POINT = 4;

    private int distance;
    private String name;

    public Car() {

    }

    public Car(String name) {
        new ValidationUtil().checkLength(name);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getDistance() {
        return distance;
    }

    public String getDistanceShape() {
        return String.join("", Collections.nCopies(distance, "-"));
    }

    public void supplyPower(int power) {
        if (isOverBitingPoint(power)) {
            distance ++;
        }
        System.out.println(getName() + " : " + getDistanceShape());
    }

    public static boolean isOverBitingPoint(int power) {
        return power >= BITING_POINT;
    }

    public void amIWinner(int maxDistance, List winners) {

        if (distance == maxDistance) {
            winners.add(this.getName());
        }

    }

}
