package com;

//删除数组中的重复元素
public class dmeo1 {
    public int del_repeat_item (int n, int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if(nums[fast] > nums[slow]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow+1;
    }
    public static void main(String[] args) {

    }
}
