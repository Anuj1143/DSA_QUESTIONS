class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        Deque<Integer>deque=new ArrayDeque<>();
        int arr[]=new int[n-k+1];
        int idx=0;
        for(int i=0; i<n; i++){
            while(!deque.isEmpty() && deque.peekFirst()<=i-k){
                deque.pollFirst();

            }
            while(!deque.isEmpty() && nums[i]>nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(i);
            if(i>=k-1){
                arr[idx++]=nums[deque.peekFirst()];
            }


        }
        return arr;

    }
}