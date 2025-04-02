class Solution {
    public int numUniqueEmails(String[] emails) {
    HashSet<String>Unique=new HashSet<>();
    for(String s:emails){
        int split_pos=s.indexOf("@");
        String local_name=s.substring(0, split_pos);
        String domain_name=s.substring(split_pos);
        if(local_name.contains("+")){
            int plus_pos=local_name.indexOf("+");
            local_name=local_name.substring(0, plus_pos);
        }
        local_name=local_name.replaceAll("\\.","");
        String new_email=local_name+domain_name;
        Unique.add(new_email);


    }
    return Unique.size();
    }
}