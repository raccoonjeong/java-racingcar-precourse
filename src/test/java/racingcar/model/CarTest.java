package racingcar.model;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void 자동차_파워4이상_전진_파워3이하_정지() {
        Car car = new Car();
        assertThat(car.getDistance()).isEqualTo(0);

        car.supplyPower(4);
        assertThat(car.getDistance()).isEqualTo(1);

        car.supplyPower(3);
        assertThat(car.getDistance()).isEqualTo(1);
    }

    @Test
    void 자기_위치_출력() {
        Car car = new Car();
        car.supplyPower(3);
        car.supplyPower(4);
        car.supplyPower(5);
        assertThat(car.getDistanceShape()).isEqualTo("--");
    }

    @Test
    void 자동차명_확인() {
        Car car = new Car("페라리");
        assertThat(car.getName()).isEqualTo("페라리");
    }
}
