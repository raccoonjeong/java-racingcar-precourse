package racingcar.model;

public class ValidationUtil {
    public boolean isLessThenFive(String str) {
        return str.length() <= 5;
    }

    public void checkLength(String str) {
        if (str.length() > 5) {
            throw new IllegalArgumentException("5글자 이하여야 합니다.");
        }
    }
}
