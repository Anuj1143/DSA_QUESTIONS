class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer>peaks=new LinkedList<>();
        for(int i=1; i<mountain.length-1; i++){
            int prev=mountain[i-1];
            int next=mountain[i+1];
            int curr=mountain[i];
            if(prev<curr && curr>next){
                peaks.add(i);
            }
        }
        return peaks;
    }
}