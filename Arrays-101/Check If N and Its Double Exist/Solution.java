class Solution {
    public boolean checkIfExist(int[] arr) {   
        int zeroCounter = 0;                   
        for(int i = 0; i < arr.length; i++){            
            if(arr[i] == 0){       
                zeroCounter++;
                if(zeroCounter > 1){
                    return true;
                }                 
            }        
            for(int j = 0; j < arr.length; j++){           
                if(arr[i] == (arr[j] * 2) && arr[i] != arr[j]){              
                    return true;
                }
            }
        }
        return false;   
    }
}
