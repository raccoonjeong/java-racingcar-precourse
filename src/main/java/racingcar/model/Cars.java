package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static racingcar.model.PowerGenerator.generatePower;

public class Cars {

    public static final String REGEX = ",";

    private List<Car> carList = new ArrayList<>();

    public Cars(String names) {
        String[] nameArray = names.split(REGEX);

        for (String name : nameArray) {
            carList.add(new Car(name));
        }
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void tryMove() {
        for (Car car : carList) {
            int randomPower = generatePower();
            car.supplyPower(randomPower);
        }
    }

    public int aggregateMaxDistance() {
        int maxDistance = 0;
        for (Car car : carList) {
            maxDistance = car.getDistance() > maxDistance ? car.getDistance() : maxDistance;
        }
        return maxDistance;
    }


    public List pickWinners(int maxDistance) {
        List<String> winners = new ArrayList<>();
        for (Car car : carList) {
            car.amIWinner(maxDistance, winners);
        }

        return winners;
    }



}
