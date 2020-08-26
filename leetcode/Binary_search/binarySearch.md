##### 目标：
> 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。



##### code:

```
class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        do {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {return mid;}
            else if (nums[mid] < target) {left = mid + 1;}
            else if (nums[mid] > target) {right = mid - 1;}
        }
        while(left <= right);

        return -1;
    }
}
```

##### 解释：
```
class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;                        // 数组长度，记得减 1

        do {
            int mid = (left + right) / 2;                   // 取中间值

            if (nums[mid] == target) {return mid;}
            else if (nums[mid] < target) {left = mid - 1;}  // 中间值小于 target，left = mid + 1
            else if (nums[mid] > target) {right = mid + 1;} // 中间值大于 target，right = mid - 1
        }
        while(left <= right);                               // left <= right, 好处：
                                                            // 1. 当 nums 长度为 0 时，left = 0, right = -1, 不满足条件，排除了 nums 长度为 0 的情况 
                                                            // 2. 当 nums 长度为 1 时，left = 0, right = 0, 即便数组只有一个元素也能按条件去寻找该元素。
                                                            // 

        return -1;
    }
}
```

