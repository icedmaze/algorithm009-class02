/**
 *
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * <example>
 *  给定数组 nums = [1,1,2],
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 * </example>
 *
 * @author jiangchangyu
 */
public class RemoveDuplicatesFromSortedArray {

    /**
     * 思路：采用双指针
     * 指针1：遍历数组
     * 指针2：记录不重复元素替换下标
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        //特殊条件判断
        if (numsLength < 2) {
            return numsLength;
        }

        int currentIndex = 0;
        for (int i = 1; i < numsLength; i++) {
            if (nums[i] != nums[currentIndex]) {
                nums[currentIndex++ + 1] = nums[i];
            }
        }
        return currentIndex + 1;
    }
}