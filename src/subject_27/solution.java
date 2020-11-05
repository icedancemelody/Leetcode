package subject_27;

//本题要求原地删除数组中等于x的元素
//原地一词可以联想到双指针，这次我们让i，j都从0开始
//j作为循环操作数，如果j对应的数组值不是要删除的值，那么说明i也不是，让i和j都继续遍历
//当遇到要删除的值时，由于j会继续增加，只能让i来有变化，我们先让i留在原地，j继续遍历
//之后，当j遍历到第一个不是删除值的时候，就让原来i的位置的值被j现在的值替换，依次遍历到最后即可。


class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0;
        int i=0;
        int j;
        for(j=0;j<nums.length;j++){
            if(nums[j]!=val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}

