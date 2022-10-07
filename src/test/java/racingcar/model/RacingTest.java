package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class RacingTest {

    @Test
    void 레이싱_신청() {
        Racing racing = new Racing("pobi,woni", 1);
        assertThat(racing.getCars().getCarList().size()).isEqualTo(2);
    }

    @Test
    void 레이싱() {
        Racing racing = new Racing("pobi,woni,zz", 10);
        racing.race();
    }
}
