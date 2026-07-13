public class Parser {

    public static void parseTime(String time, Report report) {

    }
    public static void parseEndpoint(String string, Report report) {

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
