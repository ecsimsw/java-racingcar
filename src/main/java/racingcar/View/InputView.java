package racingcar.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import racingcar.Model.Car;
import racingcar.Model.TrialTime;

/**
 * 클래스 이름 : InputView.java
 *
 * @author 작은곰
 * @version 1.0.1
 * <p>
 * 날짜 : 2020.02.16 일요일
 */

public class InputView {
    private static final String DELIMITER = ",";
    private static Scanner sc = new Scanner(System.in);

    public static String[] inputCarName() {
        OutputView.printInputCarNamesMessage();
        String[] carNames = sc.nextLine().split(DELIMITER);
        trimCarNames(carNames);
        return carNames;
    }

    private static void trimCarNames(String[] carNames) {
        for (int i = 0; i < carNames.length; i++) {
            carNames[i] = carNames[i].trim();
        }
    }

    public static TrialTime inputTrialTime() {
        OutputView.printInputTrialTimeMessage();
        String tryNo = sc.nextLine();
        return new TrialTime(tryNo);
    }

}