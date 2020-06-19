class Solution {
    public int thirdMax(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                if(nums[i] <= nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        if(nums.length < 3){
            return nums[0];
        }
        int counter = 0;
        int index = 0;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                counter++;
            }
            if(counter == 2){
                index = i+1;
                break;
            }
        }
        return nums[index];
    }
}
