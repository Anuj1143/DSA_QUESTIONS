class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int leftmax=0;
        int rightmax=0;
        int total=0;
        int l=0;
        int r=n-1;
        while(l<r){
            if(arr[l]<=arr[r]){
                if(leftmax>arr[l]){
                    total+=leftmax-arr[l];

                }
                else{
                    leftmax=arr[l];
                }
                l=l+1;

            }
            else{
                if(rightmax>arr[r]){
                    total+=rightmax-arr[r];
                }
                else{
                    rightmax=arr[r];
                }
                r=r-1;
            }
        }
        return total;
    }
}