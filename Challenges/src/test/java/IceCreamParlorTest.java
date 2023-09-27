import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class IceCreamParlorTest {

    @Test
    public void testFlavours(){
        IceCreamParlor parlor = new IceCreamParlor();
        List<Integer> costs = new ArrayList<>();
        costs.add(2);
        costs.add(1);
        costs.add(4);
        costs.add(3);
        parlor.whatFlavors(costs, 5);
    }
}
