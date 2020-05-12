class Solution {
    public int findNumbers(int[] nums) {
        int evenNum = 0;
        int tempNum;
        for(int i = 0; i < nums.length; i++){
            tempNum = nums[i];
            int checker = 0;
            while(tempNum > 0){
                tempNum /= 10;
                checker++;
            }
            if(checker % 2 == 0){
                evenNum++;
            }
        }
        return evenNum;
    }
}
