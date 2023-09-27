
import java.util.List;

public class MagicSquare {

    public int formingMagicSquare(List<List<Integer>> s) {
        int minCost = Integer.MAX_VALUE;
        int[][][] allMagicSquares = getMagicSquares();

        for (int[][] arr : allMagicSquares) {
            int cost = 0;
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                    cost = cost + Math.abs(arr[i][j] - s.get(i).get(j));
                }
            }
            System.out.println(cost);
            minCost = Math.min(minCost, cost);
        }

        return minCost;

    }

    private static int[][][] getMagicSquares() {
        int[][][] magicSquares = {
                {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}
        };
        return magicSquares;
    }
}
