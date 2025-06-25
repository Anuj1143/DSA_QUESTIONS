class Solution {
    public int maxSum(int[] nums) {
        int [] largest=new int[10];
        int result=-1;
        for(int num:nums){
            int max=0;
            int number=num;
            while(number>0){
                int digit=number%10;
                number/=10;
               max=Math.max(max, digit);


            }
            if(largest[max]>0)
                result=Math.max(result,largest[max]+num);
            
             largest[max]=Math.max(largest[max], num);
            
        }
        return result;
    }
}