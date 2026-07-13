import java.util.HashSet;
import java.util.Set;

public class Report {
    private int failedLines = 0;
    private int requestNumbers = 0;
    private int errors4xx = 0;
    private int errors5xx = 0;

    private Set<String> ipSet = new HashSet<>();


    public void addFailed() {
        failedLines++;
    }

    public void addIP(String ip) {
        if(!ipSet.contains(ip)) {
            ipSet.add(ip);
        }
    }

    public void add4xx() {
        errors4xx++;
    }

    public void add5xx() {
        errors5xx++;
    }

    public void addRequest() {
        requestNumbers++;
    }
}
