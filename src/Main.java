import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file path: ");
        String path = sc.nextLine();

        FileParser fileParser = new FileParser();
        fileParser.parseFile(path);
    }
}
