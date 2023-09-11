import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ret = new ArrayList<>();

        if(numRows == 0){
            return ret;
        }

        ret.add(new ArrayList<>());
        ret.get(0).add(1);

        for (int i = 1; i < numRows; i++){
            List<Integer> prevRow = ret.get(i - 1);
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);

            for (int j = 1; j < prevRow.size(); j++){
                currRow.add(prevRow.get(j) + prevRow.get(j - 1));
            }

            currRow.add(1);
            ret.add(currRow);

        }

        return ret;

    }
}
