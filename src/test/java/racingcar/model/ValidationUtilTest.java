package racingcar.model;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void 자동차명_길이_예외발생() {
        ValidationUtil util = new ValidationUtil();
        assertThrows(IllegalArgumentException.class, () -> util.checkLength("가나다라마바"));
    }

}
