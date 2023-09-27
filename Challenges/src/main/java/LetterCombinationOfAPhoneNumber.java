import java.util.*;

public class LetterCombinationOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> ret = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return ret;
        }
        Map<Integer, String> digitsToLetters = new HashMap<>();
        digitsToLetters = populateMap(digitsToLetters);
        StringBuilder currentCombination = new StringBuilder();
        buildCombos(digits, 0, digitsToLetters, currentCombination, ret);
        return ret;
    }

    private void buildCombos(String digits, int index, Map<Integer, String> digitsToLetters, StringBuilder comboBuilder, List<String> combos) {
        if (digits.length() == index) {
            combos.add(comboBuilder.toString());
            return;
        }
        char digit = digits.charAt(index);
        String letters = digitsToLetters.get(Integer.parseInt(String.valueOf(digit)));
        for (char l : letters.toCharArray()) {
            comboBuilder.append(l);
            buildCombos(digits, index + 1, digitsToLetters, comboBuilder, combos);
            comboBuilder.deleteCharAt(comboBuilder.length() - 1);
        }
    }

    private Map<Integer, String> populateMap(Map<Integer, String> digitsToLetters) {
        digitsToLetters.put(2, "abc");
        digitsToLetters.put(3, "def");
        digitsToLetters.put(4, "ghi");
        digitsToLetters.put(5, "jkl");
        digitsToLetters.put(6, "mno");
        digitsToLetters.put(7, "pqrs");
        digitsToLetters.put(8, "tuv");
        digitsToLetters.put(9, "wxyz");
        return digitsToLetters;
    }
}