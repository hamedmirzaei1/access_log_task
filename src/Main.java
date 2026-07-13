import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file path: ");
        String path = sc.nextLine();

        Report report = new Report();

        FileParser fileParser = new FileParser();
        fileParser.parseFile(path, report);

        System.out.println("\n| Number of Requests |\n");
        System.out.println(report.getRequestNumbers());

        System.out.println("\n| Number of unique IP's |\n");
        System.out.println(report.getUniqueIPs());

        System.out.println("\n| High traffic endpoints |\n");
        Calculator.listEndPoints(report);

        System.out.println("\n| Error percentage |\n");
        System.out.print("4xx: ");
        System.out.printf("%.4f", report.get4xxErrorsPercentage());
        System.out.println("%");
        System.out.print("5xx: ");
        System.out.printf("%.4f", report.get5xxErrorsPercentage());
        System.out.print("%");
    }
}
