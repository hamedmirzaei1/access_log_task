import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileParser {

    private static final Pattern LOG_PATTERN = Pattern.compile(
            "^(\\S+) \\S+ \\S+ \\[(.*?)] \"(.*?)\" (\\d{3}) (\\S+) \"(.*?)\"$"
    );

    public void parseFile(String FILE_PATH) {
        Report report = new Report();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;

            while((line = reader.readLine()) != null) {

                Matcher matcher = LOG_PATTERN.matcher(line);
                if(matcher.matches()) {
                    report.addRequest();
                    report.addIP(matcher.group(1));
                    Parser.parseTime(matcher.group(2), report);
                    Parser.parseEndpoint(matcher.group(3), report);
                    Parser.parseStatus(matcher.group(4), report);
                } else {
                    report.addFailed();
                }

            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
