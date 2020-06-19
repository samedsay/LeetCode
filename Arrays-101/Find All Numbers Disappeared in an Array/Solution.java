class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> returnedArray = new ArrayList<>();
        Set<Integer> setLength = new HashSet<>();
        Set<Integer> newArray = new HashSet<>();
        
        for(int i = 0; i < nums.length;i++){
            setLength.add(i+1);
            newArray.add(nums[i]);
        }
        
        for(int number : setLength){
            if(!newArray.contains(number)){
                returnedArray.add(number);
            }
        }
        
        return returnedArray;      
    }
}
