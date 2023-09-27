import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfAPhoneNumberTest {

    @Test
    public void digit2Test(){
        LetterCombinationOfAPhoneNumber letterCombinationOfAPhoneNumber = new LetterCombinationOfAPhoneNumber();
        List<String> expected = new ArrayList<>();
        expected.add("a");
        expected.add("b");
        expected.add("c");
        for (String s : expected) {
            assert(letterCombinationOfAPhoneNumber.letterCombinations("2").contains(s));
        }
    }

    @Test
    public void digit23Test(){
        LetterCombinationOfAPhoneNumber letterCombinationOfAPhoneNumber = new LetterCombinationOfAPhoneNumber();
        List<String> expected = build23List();
        for (String s : letterCombinationOfAPhoneNumber.letterCombinations("23")) {
            assert(expected.contains(s));
        }
    }

    private List<String> build23List() {
        List<String> expected = new ArrayList<>();
        expected.add("ad");
        expected.add("ae");
        expected.add("af");
        expected.add("bd");
        expected.add("be");
        expected.add("bf");
        expected.add("cd");
        expected.add("ce");
        expected.add("cf");
        return expected;
    }

}
