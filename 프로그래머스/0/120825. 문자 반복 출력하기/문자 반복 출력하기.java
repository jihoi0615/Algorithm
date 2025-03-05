class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        //문자열일땐 ()쓰고, 문자열일땐 뭐죠 집가서 만두먹고싶어요
        for(int i = 0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            for(int j = 0; j < n; j++){
                //접근, n번씩 추가
                answer.append(ch);
            }         
        }
        return answer.toString();
    }
}