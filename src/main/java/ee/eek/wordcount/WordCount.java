package ee.eek.wordcount;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public final class WordCount {
    private WordCount() {

    }

    public static void main(String[] args) throws URISyntaxException, IOException {
        URL resource = WordCount.class.getResource("t8.shakespeare.txt");
        try (Stream<String> lines =
                     Files.lines(Paths.get(resource.toURI()))) {
            lines.limit(7).forEach(System.out::println);
        }
    }
}
