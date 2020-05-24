/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <example>
 *     输入: [0,1,0,3,12]
 *      输出: [1,3,12,0,0]
 * </example>
 * @author jiangchangyu
 */
public class MoveZeros {

    /**
     * 思路：双指针
     * 指针1遍历数组，记录当前处理位置
     * 指针2指向非零元素
     *
     * 时间复杂度：O（n）<- O(2n)
     * 只需遍历整个数组两次
     *
     * 空间复杂度：O（1）
     * 基于原数组，不需要额外数组进行存储
     * 只需要额外存储两个指针变量

     *
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        for(int i = 0, point = 0; i < nums.length; i++){
            //若指针指向元素不为0，则进行替换
            while(point < nums.length && nums[point] == 0){
                point++;
            }
            //当指针2已经遍历完所有非零元素后，用0覆盖之后的所有元素
            if(point < nums.length){
                nums[i] = nums[point++];
            }else{
                nums[i] = 0;
            }
        }
    }
}