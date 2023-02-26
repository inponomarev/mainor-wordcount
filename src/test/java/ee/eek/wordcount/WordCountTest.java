package ee.eek.wordcount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

class WordCountTest {
    @Test
    void mostUsedWords() throws IOException {
        Assertions.assertThat(WordCount.mostUsedWords()).isEqualTo(
                Map.of("the", 23243L,
                        "I", 22225L,
                        "and", 18618L,
                        "to", 16339L,
                        "of", 15690L)
        );
    }

    @Test
    void longestWords() throws IOException {
        Assertions.assertThat(WordCount.longestWords()).isEqualTo(
                Map.of(27, Set.of("honorificabilitudinitatibus"),
                        17, Set.of("Anthropophaginian", "indistinguishable", "undistinguishable"),
                        16, Set.of("Northamptonshire", "incomprehensible", "superserviceable"
                        ))
        );
    }

    @Test
    void anagramsTest() throws IOException {
        Assertions.assertThat(WordCount.anagrams()).isEqualTo(
                Set.of(Set.of("spear", "pears", "reaps", "rapes", "spare"),
                        Set.of("hares", "shear", "share", "hears", "asher"),
                        Set.of("pales", "lapse", "pleas", "leaps", "peals"))
        );
    }
}