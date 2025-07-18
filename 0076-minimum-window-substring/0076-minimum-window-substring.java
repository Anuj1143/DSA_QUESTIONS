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
        int i=0;
        int j=0;
        int minWindow=Integer.MAX_VALUE;
        int start_i=0;
        int required=t.length();
        while(j<n){
            char ch=s.charAt(j);
            if(mp.containsKey(ch)){
                if(mp.get(ch)>0){
                    required--;
                }
                mp.put(ch, mp.getOrDefault(ch, 0)-1);
            }
            while(required==0){
                int currWindow=j-i+1;
                if(minWindow>currWindow){
                    minWindow=currWindow;
                    start_i=i;
                }
                char start=s.charAt(i);
                if(mp.containsKey(start)){
                    mp.put(start, mp.getOrDefault(start, 0)+1);
                    if(mp.get(start)>0){
                        required++;
                    }

                }
                i++;
            }
            j++;
        }
        return minWindow==Integer.MAX_VALUE?"":s.substring(start_i, start_i+minWindow);
    }
}