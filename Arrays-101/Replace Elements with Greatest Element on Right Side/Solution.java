class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int max = 0;
            int index = 0;
            for(int j = i+1; j < arr.length; j++){
                if(max < arr[j]){
                    max = arr[j];
                    index = j;
                }
            }
            arr[i] = arr[index];
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}
