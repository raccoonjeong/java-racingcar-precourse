package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class RacingTest {

    @Test
    void 레이싱_신청() {
        Racing racing = new Racing();
        racing.readyCars("pobi,woni");
        racing.readyTry(3);
        assertThat(racing.getCars().getCarList().size()).isEqualTo(2);
    }

    @Test
    void 레이싱() {
        Racing racing = new Racing();
        racing.readyCars("pobi,woni,zz");
        racing.readyTry(10);
        racing.race();
    }

    @Test
    void 경기결과() {
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");
        Car car3 = new Car("car3");
        Car car4 = new Car("car4");

        car3.supplyPower(5);
        car3.supplyPower(5);
        car3.supplyPower(5);

        car2.supplyPower(5);
        car2.supplyPower(5);

        car1.supplyPower(5);
        car1.supplyPower(5);
        car1.supplyPower(5);

        List<Car> carList = Arrays.asList(car1, car2, car3, car4);

        carList.stream().forEach(x -> System.out.println(x.getName()+ "/"+x.getDistance()));
        System.out.println("==========");
//        carList.sort(Comparator.comparingInt(Car::getDistance));

        carList.sort(Comparator.comparing(Car::getDistance).reversed());

        carList.stream().forEach(x -> System.out.println(x.getName()+ "/"+x.getDistance()));
    }
}
