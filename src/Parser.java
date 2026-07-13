public class Parser {

    public static void parseTime(String time, Report report) {
        int hour = Integer.parseInt(time.split(":")[1]);
        report.addRequestToTime(hour);
    }
    public static void parseEndpoint(String string, Report report) {
        String endPoint = string.split(" ")[1];
        report.addEndpoint(endPoint);
    }
    public static void parseStatus(String string, Report report) {
        if(string.charAt(0) == '4') {
            report.add4xx();
        }
        else if(string.charAt(0) == '5') {
            report.add5xx();
        }
    }
}
