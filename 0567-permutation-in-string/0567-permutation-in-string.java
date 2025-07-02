class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m) return false;
        char[]ch1=s1.toCharArray();
        

        Arrays.sort(ch1);
        String str1=new String(ch1);
        for(int i=0; i<=m-n;i++){
            String sub=s2.substring(i,i+n);
            char[] ch2=sub.toCharArray();
            Arrays.sort(ch2);
            String str2=new String(ch2);
            if(str1.equals(str2)){
                return true;
            }
        }
        return false;
    }


}