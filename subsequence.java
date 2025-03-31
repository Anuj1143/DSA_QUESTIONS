package DSA_QUESTIONS;

public class subsequence {
    public static boolean IsSubsequenc(String s, String t){
        int i=0; 
        int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;

            }
            else{
                j++;
            }

        }
        return(i==s.length());
    }
    public static void main(String[] args) {
        String s="abc";
        String t="ahbgdc";
        System.out.println(IsSubsequenc(s, t));
        
    }
}
