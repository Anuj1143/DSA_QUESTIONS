class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        
        for(int num=low; num<=high; num++){
            String s=String.valueOf(num);
            int l=s.length();
            if(l%2!=0){
                continue;
            }
            int leftsum=0;
            int rightsum=0;
            for(int i=0; i<l/2; i++){
                leftsum+=s.charAt(i)-'0';

            }
            for(int i=l/2; i<l; i++){
                rightsum+=s.charAt(i)-'0';
            }
            if(leftsum==rightsum){
                count++;
            }
        }
        return count++;
    }
}