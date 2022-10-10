package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.Racing;

public class Application {
    public static void main(String[] args) {
        Racing racing = new Racing();
        String names = "";
        try {
            System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            names = Console.readLine();
            racing.readyCars(names);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("시도할 회수는 몇회인가요?");
        int tryCount = Integer.valueOf(Console.readLine());
        racing.readyTry(tryCount);

        racing.race();
        racing.announceResult();
    }
}
