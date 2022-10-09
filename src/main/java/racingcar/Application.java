package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.Racing;

public class Application {
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String names = Console.readLine();
        System.out.println("시도할 회수는 몇회인가요?");
        int tryCount = Integer.valueOf(Console.readLine());

        Racing racing = new Racing(names, tryCount);
        racing.race();
        racing.announceResult();
    }
}
