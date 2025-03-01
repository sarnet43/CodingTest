class Solution {
    public long[] solution(long n) {
        long[] answer = new long[(n + "").length()];
        int idx = 0;
        while(n != 0){
            answer[idx++] = n % 10;
            n /= 10;
        }
        return answer;
    }
}