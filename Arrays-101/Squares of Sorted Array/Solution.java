class Solution {
    public int[] sortedSquares(int[] A) {
        int[] array = new int[A.length];
        for(int i = 0; i < array.length; i++){
            array[i] = A[i] * A[i];            
        }
        int temp;
        for(int i = 1; i < array.length; i++){     
            for(int j = i; j > 0; j--){
                if(array[j] < array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        return array;
    }
}
