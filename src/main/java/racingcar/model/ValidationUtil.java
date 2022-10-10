package racingcar.model;

public class ValidationUtil {
    private static final String ERROR_MESSAGE = "[ERROR]";
    
    public boolean isLessThenFive(String str) {
        return str.length() <= 5;
    }

    public void checkLength(String str) {
        if (str.length() > 5) {
            throw new IllegalArgumentException(ERROR_MESSAGE + "5글자 이하여야 합니다.");
        }
    }
}
