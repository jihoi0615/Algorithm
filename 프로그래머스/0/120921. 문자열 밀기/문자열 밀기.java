class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        for (int i = 0; i < A.length(); i++) {
            String newStr = A.substring(A.length() - i) + A.substring(0, A.length() - i);
            if (B.equals(newStr)) {
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }
        
        return answer;
    }
}