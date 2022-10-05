package racingcar.model;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidationUtilTest {

    @Test
    void 자동차명_길이_유효성체크() {
        ValidationUtil util = new ValidationUtil();
        assertThat(util.isLessThenFive("가나다라마바")).isFalse();
        assertThat(util.isLessThenFive("abcdef")).isFalse();
        assertThat(util.isLessThenFive("가나다라마")).isTrue();
        assertThat(util.isLessThenFive("abcde")).isTrue();
    }

}
