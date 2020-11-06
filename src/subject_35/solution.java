package subject_35;

//好家伙，没啥可说的。
class solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            else if(nums[i]>target){
                return i;
            }

        }
        return i;
    }
}
