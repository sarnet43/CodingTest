class Solution {
    public int solution(int[] num_list, int n) {
        for(int idx : num_list)
            if(idx == n) return 1;
        
        return 0;
    }
}