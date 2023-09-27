import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IceCreamParlor {

    public void whatFlavors(List<Integer> cost, int money) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < cost.size(); i++) {
            int firstFlavorPrice = cost.get(i);
            int secondFlavorPrice = money - cost.get(i);
            if (map.containsKey(secondFlavorPrice)) {
                System.out.println(map.get(secondFlavorPrice) + " " + (i + 1));
                return;
            }
            map.put(firstFlavorPrice, i+1);
        }
    }
}
