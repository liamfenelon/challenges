
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PascalsTriangleTest {

    @Test
    public void oneRowTest() throws Exception {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> rowOne = new ArrayList<>();
        rowOne.add(1);
        expected.add(rowOne);
        assertEquals(expected, pascalsTriangle.generate(1));
    }

    @Test
    public void twoRowTest() throws Exception {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        List<Integer> rowOne = List.of(1);
        List<Integer> rowTwo = List.of(1, 1);
        List<List<Integer>> expected = List.of(rowOne, rowTwo);
        assertEquals(expected, pascalsTriangle.generate(2));
    }

    @Test
    public void fiveRowTest() throws Exception {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        List<Integer> rowOne = List.of(1);
        List<Integer> rowTwo = List.of(1, 1);
        List<Integer> rowThree = List.of(1, 2, 1);
        List<Integer> rowFour = List.of(1, 3, 3, 1);
        List<Integer> rowFive = List.of(1, 4, 6, 4, 1);
        List<List<Integer>> expected = List.of(rowOne, rowTwo, rowThree, rowFour, rowFive);
        assertEquals(expected, pascalsTriangle.generate(5));
    }

}
