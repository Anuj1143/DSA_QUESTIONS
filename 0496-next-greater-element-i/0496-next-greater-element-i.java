class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>stack=new Stack<>();
        Map<Integer, Integer>mp=new HashMap<>();
        for(int num:nums2){
            while(!stack.isEmpty()&& num>stack.peek()){
                mp.put(stack.pop(), num);
            }
                stack.push(num);
        }
        int result[]=new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            result[i]=mp.getOrDefault(nums1[i],-1);
        }
        return result;
    }
}