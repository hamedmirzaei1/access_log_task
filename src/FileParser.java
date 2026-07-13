import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileParser {

    public void parseFile(String FILE_PATH) {

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;

            while((line = reader.readLine()) != null) {

            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
