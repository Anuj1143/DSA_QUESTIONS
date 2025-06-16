class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int prefix[]=new int[n];
        int suffix[]=new int[n];

        prefix[0]=arr[0];
        for(int i=1; i<n; i++){
            prefix[i]=Math.max(arr[i], prefix[i-1]);
        }
        suffix[n-1]=arr[n-1];
        for(int i=n-2; i>=0; i--){
            suffix[i]=Math.max(arr[i], suffix[i+1]);
        }
        int total=0;
        for(int i=0; i<n; i++){
        int leftMax=prefix[i];
        int rightMax=suffix[i];
        if(arr[i]<leftMax && arr[i]<rightMax){
            total+=Math.min(leftMax, rightMax)-arr[i];
        }
        }

        return total;
    }

}