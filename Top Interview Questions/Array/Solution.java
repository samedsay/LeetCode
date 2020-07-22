class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            boolean condition = false;
            int counter = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j])
                    counter++;
            }
            if(counter == 1){
                result = nums[i];
                break;
            }
        }
        return result;  
    }
}
