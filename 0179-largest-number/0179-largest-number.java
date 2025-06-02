class Solution {
    public String largestNumber(int[] nums) {
        Integer[] numsInteger = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(numsInteger,(a,b)->{
            String s1=Integer.toString(a);
            String s2=Integer.toString(b);
            return (s2+s1).compareTo(s1+s2);
        });
        if(numsInteger[0]==0)
        {
            return "0";
        }
        StringBuilder result=new StringBuilder();
        for(int num:numsInteger){
            result.append(num);
        }
        return result.toString();
    }
}