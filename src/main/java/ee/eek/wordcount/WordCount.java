package ee.eek.wordcount;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.function.Predicate.not;

public final class WordCount {
    public static final int LINES_TO_SKIP = 243;

    private WordCount() {

    }

    static <T> T withLines(Function<Stream<String>, T> function) throws IOException {
        URL resource = WordCount.class.getResource("t8.shakespeare.txt");
        try (Stream<String> lines =
                     Files.lines(Paths.get(resource.toURI()))
                             //Skip copyright notices and formal header
                             .skip(LINES_TO_SKIP)) {
            return function.apply(lines);
        } catch (URISyntaxException e) {
            throw new IllegalStateException("resource not found", e);
        }
    }

    static <T> T withWords(Function<Stream<String>, T> function) throws IOException {
        return withLines(lines -> {
            Stream<String> words =
                    lines.flatMap(line -> Arrays.stream(line.split("[-()|\"!?,':;.\\s\\[\\]]+")))
                            .filter(not(String::isEmpty));
            return function.apply(words);
        });
    }

    static Map<String, Long> mostUsedWords() throws IOException {
        return null;
    }

    static Map<Integer, Set<String>> longestWords() throws IOException {
        return null;
    }

    static Set<Set<String>> anagrams() throws IOException {
        return null;
    }
}
