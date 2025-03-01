class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
         if(arr.length ==1) {
            return new int[]{-1};
        }
        
        int min = arr[0];
        for(int a : arr){
            if(min > a) min = a;
        }
        
        int i = 0;
        for(int b : arr){
            if(b != min){
                answer[i] = b;
                i++;
            }
        }
        return answer;
    }
}