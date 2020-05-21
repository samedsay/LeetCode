class Solution {
    public boolean validMountainArray(int[] A) {
        boolean flag = false;
        int counter = 0;
        int counterFirst = 0;
        int counterSecond = 0;
        for(int i = 0; i < A.length-1; i++){
            if(A[i] < A[i+1] && flag == false){
                counterFirst++;
            }else{
                flag = true;
            }
            if(A[i] > A[i+1] && flag == true){
                counterSecond++;
            }
        }
        counter = counterFirst + counterSecond;
        if(counterFirst == 0){
            return false;
        }
        if(counterSecond > 0)
            counter++;
        return counter == A.length;
    }
}
