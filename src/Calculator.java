import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Calculator {
    public static void listEndPoints(Report report) {
        Map<String, Integer> endPoints = report.getEndPoints();

        List<Map.Entry<String, Integer>> list = new ArrayList<>(endPoints.entrySet());

        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for (int i = 0; i < Math.min(10, list.size()); i++) {
            System.out.println(list.get(i).getKey() + ": " + list.get(i).getValue());
        }
    }
}
