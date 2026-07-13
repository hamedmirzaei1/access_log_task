import java.util.*;

public class Report {
    private int failedLines = 0;
    private int requestNumbers = 0;
    private int errors4xx = 0;
    private int errors5xx = 0;

    private Set<String> ipSet = new HashSet<>();
    private Map<String, Integer> endPoints = new HashMap();

    private LinkedList<Integer> timeLog = new LinkedList<>();

    public Report() {
        for(int i=0; i<24; i++) {
            timeLog.add(0);
        }
    }

    public void addFailed() {
        failedLines++;
    }

    public void addIP(String ip) {
        if(!ipSet.contains(ip)) {
            ipSet.add(ip);
        }
    }

    public void addEndpoint(String endPoint) {
        if(endPoints.keySet().contains(endPoint)) {
            endPoints.put(endPoint, endPoints.get(endPoint) + 1);
        }
        else {
            endPoints.put(endPoint, 1);
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

    public void addRequestToTime(int i) {
        timeLog.set(i, timeLog.get(i) + 1);
    }

    public Map<String, Integer> getEndPoints() {
        return endPoints;
    }


    public int getRequestNumbers() {
        return requestNumbers;
    }

    public int getUniqueIPs() {
        return ipSet.size();
    }

    public float get4xxErrorsPercentage() {
        return ((float) errors4xx/requestNumbers) * 100;
    }
    public float get5xxErrorsPercentage() {
        return ((float)errors5xx/requestNumbers) * 100;
    }

    public LinkedList<Integer> getTimeLog() {
        return timeLog;
    }
}
