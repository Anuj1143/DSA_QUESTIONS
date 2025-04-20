class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>set1=new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        //Set<Integer>set2=new HashSet<>();

        List<Integer>resultList=new ArrayList<>();
        for(int num:nums2){
            if(set1.contains(num)){
                resultList.add(num);
                set1.remove(num);
            }
        }
        int result[]=new int[resultList.size()];
         int i=0;
        for(int num:resultList){
             result[i++]=num;
         }
        return result;
    }
}