class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        while(money>=5500){
            money-= 5500;
            answer[0]++;
        }
        answer[1] = money;
        return answer;
    }
}