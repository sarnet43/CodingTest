class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int length = a.length;
        for(int i = 1; i <= length; i++){
            answer += a[i-1] * b[i-1];
        }
        return answer;
    }
}