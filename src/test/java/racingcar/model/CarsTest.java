package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CarsTest {

    @Test
    void 자동차명_개수_확인() {
        // ("pobi,woni", "1");
        Cars cars = new Cars("pobi,woni");
        assertThat(cars.getCarList().size()).isEqualTo(2);
    }

    @Test
    void 자동차명_이름_확인() {
        // ("pobi,woni", "1");
        Cars cars = new Cars("pobi,woni");
        assertThat(cars.getCarList().get(0).getName()).isEqualTo("pobi");
        assertThat(cars.getCarList().get(1).getName()).isEqualTo("woni");
    }
}
