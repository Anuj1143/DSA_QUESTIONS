class Solution {
    List<String>result=new ArrayList<>();
    public void solve(int idx, String digits, StringBuilder sb, Map<Character, String>mp){
        if(idx>=digits.length()){
            result.add(sb.toString());
            return;

        }
        char ch=digits.charAt(idx);
        String str=mp.get(ch);
        for(int i=0; i<str.length(); i++){
            sb.append(str.charAt(i));
            solve(idx+1, digits, sb, mp);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        result=new ArrayList<>();
        if(digits.length()==0){
            return new ArrayList<>();
        }
        Map<Character, String>mp=new HashMap<>();
        mp.put('2', "abc");
        mp.put('3', "def");
        mp.put('4', "ghi");
        mp.put('5', "jkl");
        mp.put('6', "mno");
        mp.put('7', "pqrs");
        mp.put('8', "tuv");
        mp.put('9', "wxyz");
        StringBuilder sb=new StringBuilder();
        solve(0,digits, sb, mp);
        return new ArrayList<>(result);
        
        
    }
}