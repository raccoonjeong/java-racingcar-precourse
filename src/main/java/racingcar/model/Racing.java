package racingcar.model;


import java.util.List;

public class Racing {

    private Cars cars;
    private int tryCount;

    public void readyCars(String names) {
        this.cars = new Cars(names);
    }

    public void readyTry(int tryCount) {
        this.tryCount = tryCount;
    }

    public Cars getCars() {
        return cars;
    }

    public void race() {
        for (int i = 0; i < tryCount; i++) {
            this.cars.tryMove();
        }
    }

    public void announceResult() {
        int maxDistance = this.cars.aggregateMaxDistance();
        List winners = this.cars.pickWinners(maxDistance);
        String result = String.join(",", winners);
        System.out.println("최종 우승자 : " + result);
    }
}
