class Solution {
    public String intToRoman(int num) {
        List<Integer> val=Arrays.asList(1000,900,500,400,100,90,50,40,10,9,5,4,1);
        List<String> sys=Arrays.asList("M","CM","D","CD","C","XC","L","XL","X","IX", "V","IV","I");
        StringBuilder result=new StringBuilder();
        for(int i=0; i<13; i++){
            if(num==0) break;
            int time=num/val.get(i);
            while(time-->0){
                result.append(sys.get(i));
            }
            num=num%val.get(i);
        }
          return result.toString();
    }
  
}