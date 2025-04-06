class Solution {
    public String intToRoman(int num) {

        List<Integer>val=Arrays.asList(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1);
        List<String> sys=Arrays.asList("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I");

        StringBuilder res=new StringBuilder();
        for(int i=0; i<13; i++){
            if(num==0) break;

            int times=num/val.get(i);
            while(times-->0){

                res.append(sys.get(i));
            }
            num=num%val.get(i);
        }
        return res.toString();
        
    }
}