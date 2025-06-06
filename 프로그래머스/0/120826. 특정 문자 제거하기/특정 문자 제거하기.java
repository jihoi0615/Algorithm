public class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != letter.charAt(0)) { // letter와 다른 문자만 추가
                result.append(my_string.charAt(i));
            }
        }
        
        return result.toString();
    }
}
