package Hard;
class Solution {
    public int trap(int[] height) {
        int length = height.length;
        int leftmax[] = new int[length];
            leftmax[0] = height[0];
            for(int i=1;i<length;i++){
                leftmax[i] = Math.max(height[i], leftmax[i-1]);
            }

        int rightmax[] = new int[length];
        rightmax[length-1] = height[length-1];
        for(int i=length-2;i>=0;i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }
        int trappedwater = 0;
        for(int i=0;i<length;i++){
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            trappedwater += waterlevel - height[i];
        }

        return trappedwater;
    }
}