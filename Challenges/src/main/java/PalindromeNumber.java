public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String stringNum = String.valueOf(x);
        for(int i = 0; i < stringNum.length()/2; i++) {
            for(int j = stringNum.length()-1; j > i; j--){
                if(stringNum.charAt(i) != stringNum.charAt(j)){
                    return false;
                }
                i++;
            }
        }
        return true;
    }
}
