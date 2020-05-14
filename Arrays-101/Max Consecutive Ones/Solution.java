class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                counter++;
                if(counter > max){
                    max = counter;
                }
            }else{
                counter = 0;
            }
        }
        return max;
    }
}
