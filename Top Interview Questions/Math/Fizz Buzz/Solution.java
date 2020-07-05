class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> array = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String temp = "";
            try{
                if((i % 3 == 0 ) && (i % 5 == 0))
                    temp = "FizzBuzz";
                else if(i % 3 == 0)
                    temp = "Fizz";
                else if(i % 5 == 0)
                    temp = "Buzz";
                else
                    temp = Integer.toString(i);
            }catch(Exception e){
                System.out.println(e);
            }
            array.add(temp);
        }
        return array;
    }
}
