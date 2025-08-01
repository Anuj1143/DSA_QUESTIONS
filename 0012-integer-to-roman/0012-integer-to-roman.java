class Solution {
    public String intToRoman(int num) {
        int val[]={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] sys={"M","CM","D", "CD", "C","XC", "L","XL","X","IX","V","IV","I"};
        StringBuilder sb=new StringBuilder();

        for(int i=0; i<val.length && num>0; i++){
            while(num>=val[i]){
                    sb.append(sys[i]);
                    num-=val[i];
            }
        }
        return sb.toString();
    }
}