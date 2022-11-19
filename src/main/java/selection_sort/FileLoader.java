package selection_sort;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileLoader {

    public  static List<Integer> loadNumListFromFile(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
    }
}
