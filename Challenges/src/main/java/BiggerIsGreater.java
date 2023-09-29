import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BiggerIsGreater {

    Map<Integer, String> possValues = new HashMap<>();

    public  String biggerIsGreater(String w) {
        // Write your code here
        String ans = "";
        int ogValue = isBigger(w);
        rearrange(w, "", ogValue);
        int bestKey = Collections.min(possValues.keySet());
        possValues.get(bestKey);
        return possValues.get(bestKey);

    }

    public void rearrange(String s, String perm, int minValue){
        int best = minValue;
        if(s.isEmpty()){
            int permSize = isBigger(perm);
            if(permSize > minValue){
                possValues.put(permSize, perm);
            }
        }

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            String ros = s.substring(0, i) + s.substring(i + 1);
            rearrange(ros, perm + c, minValue);
        }

    }

    private int isBigger(String perm) {
        int size = 0;
        StringBuilder builder = new StringBuilder();
        for(char c : perm.toCharArray()){
            int cNum = c;
            builder.append(cNum);
        }
        return Integer.parseInt(builder.toString());
    }


}
