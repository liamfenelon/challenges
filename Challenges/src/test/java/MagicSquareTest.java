import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MagicSquareTest {

    @Test
    public void test(){

        MagicSquare mg = new MagicSquare();
        List<List<Integer>> input = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(4);
        row1.add(9);
        row1.add(2);
        List<Integer> row2 = new ArrayList<>();
        row2.add(3);
        row2.add(5);
        row2.add(7);
        List<Integer> row3 = new ArrayList<>();
        row3.add(8);
        row3.add(1);
        row3.add(5);

        input.add(row1);
        input.add(row2);
        input.add(row3);

        mg.formingMagicSquare(input);


    }
}
