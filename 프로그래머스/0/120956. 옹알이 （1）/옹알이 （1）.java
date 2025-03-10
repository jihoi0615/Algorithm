class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int count = 0;
        //네 가지 발음과 문자열이 동일하다면 if문으로 한번씩 count
       for(String b: babbling){
            String temp = b;
            for(String word: words){
                temp = temp.replace(word," ");
            }
            if (temp.trim().isEmpty()) {
                count++;
            }
        } 
            return count;
    }
}