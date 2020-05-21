class Solution {
    public int heightChecker(int[] heights) {
        int counter = 0;
        int[] array = new int[heights.length];
        for(int i = 0; i < array.length; i++){
            array[i] = heights[i];            
        }
        for(int i = 1; i < array.length; i++){     
            for(int j = i; j > 0; j--){
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        for(int i = 0; i < heights.length; i++){
            if(array[i] != heights[i]){
                counter++;
            }
        }
        return counter;
    }
}
