class Solution {
    public String solution(String s) {
        int length = s.length();
        String answer = "";
        if (length % 2 == 0){
            int mid1 = length /2  - 1;
            int mid2 = length / 2;
            answer = s.substring(mid1, mid2 + 1);
        }
        else {
            answer = String.valueOf(s.charAt(length / 2));
        }
        return answer;
    }
}