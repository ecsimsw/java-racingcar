package racingGame.domain.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingGame.domain.racingCar.Name;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NameHandlerTest {
    @DisplayName("이름 구분 기능 정상 작동 확인 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"pobi,crong,honux"})
    void splitNamesTest(String line) {
        List<Name> names = NameHandler.splitNames(line);

        String[] namesWithString = line.split(",");
        assertThat(names.size()).isEqualTo(namesWithString.length);

        for (String name : namesWithString) {
            boolean isIncluded = names.stream()
                    .anyMatch(n -> n.equals(Name.create(name)));
            assertThat(isIncluded).isEqualTo(true);
        }
    }
}
