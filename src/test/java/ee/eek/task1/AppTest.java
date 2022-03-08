package ee.eek.task1;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {
    @Test
    void helloTest() {
        assertThat(2 + 2).isEqualTo(4);
    }
}
