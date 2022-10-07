package racingcar.model;


public class Racing {

    private Cars cars;
    private int tryCount;

    public Racing(String names, int tryCount) {
        this.cars = new Cars(names);
        this.tryCount = tryCount;
    }

    public Cars getCars() {
        return cars;
    }

    public void race() {
        for (int i = 0; i < tryCount; i++) {
            this.cars.tryMove();
            System.out.println("=================");
        }
    }
}
