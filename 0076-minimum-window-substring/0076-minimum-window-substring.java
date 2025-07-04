class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        if(t.length()>n){
            return "";
        }
        Map<Character, Integer>mp=new HashMap<>();
        for(char ch:t.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch, 0)+1);
        }
        int requiredLength=t.length();
        int i=0;
        int j=0;
        int minWindowSize=Integer.MAX_VALUE;
        int start_i=0;
        while(j<n){
            char ch=s.charAt(j);

            if(mp.containsKey(ch)){
                if(mp.get(ch)>0){
                      requiredLength--;
                }
              

            mp.put(ch, mp.get(ch)-1);
            }
            while(requiredLength==0){
                int currentWindow=j-i+1;
                if(minWindowSize>currentWindow){
                    minWindowSize=currentWindow;
                    start_i=i;
                }
                char startChar=s.charAt(i);
              if(mp.containsKey(startChar)){
                mp.put(startChar, mp.get(startChar)+1);
                if(mp.get(startChar)>0){
                    requiredLength++;
                }
              }

                i++;
                    
            }
            j++;
            
        }
        return minWindowSize==Integer.MAX_VALUE ?"" : s.substring(start_i,start_i+minWindowSize);
    }
}