# 2Sum 问题的核心思想
本节主要介绍一下 2Sum 问题怎么解决？

## 1、2Sum I
问题的基本形式如下：
- 给你输入一个数组 nums 和一个整数 target，可以保证数组中存在两个数的和为 target，请你返回这两个数的索引。

比如输入 nums = {3, 1, 3, 6}, target = 6，算法应该返回数组 [0, 2]，因为 3 + 3 = 6.    
这个问题如何解决呢？ 首先最简单粗暴的办法自然是穷举了：
```java
    int[] twoSUm(int[] nums, int target) {
        // 穷举这两个数的所有可能
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[j]) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
```

这个解法简单粗暴，时间复杂度为 O(N^2)，空间复杂度为 O(1).   
如果想让时间复杂度下降，一般的方法都是空间换时间，可以通过一个哈希表记录元素值到索引的映射，减少时间复杂度：
```java
int[] twoSum(int[] nums, int target) {
    int n = nums.length;
    Map<Integer, Integer> map = new HashMap<>();
    // 构造一个哈希表：元素映射到相应的索引
    for (int i = 0; i < n; i++) {
        map.put(nums[i], i);
    }
    
    for (int i = 0; i < n; i++) {
        int other = target - nums[i];
        // 如果 other 存在，且不是 nums[i] 本身
        if (map.containsKey(other) && (i != map.get(other))) {
            return new int[] { i, map.get(other)};
        }
    }
    return new int[] {-1, -1};
}
```

由于哈希表的查询时间为 O(1)，算法的时间复杂度降低到 O(N)，但是需要 O(N) 的空间复杂度来存储哈希表。   
> 不过综合来看，还是要比暴力解法更高效。

## 2、2Sum II
这里稍微修改一下前面的问题，我们设计一个类，拥有两个API：
```java
class TwoSum {
    // 向数据结构中添加一个数 number
    public void add(int number);
    // 寻找当前数据结构中是否存在两个数的和为 value
    public boolean find(int value);
}
```

如何实现这两个接口呢，可以参照上一道题目，使用一个哈希值辅助 find 方法：
```java
import java.util.HashMap;
class TwoSum {
    Map<Integer, Integer> freq = new HashMap<>();
    
    public void add(int number) {
        // 记录 number 出现的次数
        freq.put(number, freq.getOrDefault(number, 0) + 1);
    }

    public boolean find(int value) {
        for (Integer key : freq.keySet()) {
            int other = value - key;
            // 情况一
            if (other == key && freq.get(key) > 1) {
                return true;
            }
            if (other != key && freq.containsKey(other)) {
                return true;
            }
        }
        return false;
    }
}
```

涉及到 find 的时候，有两种情况，举个例子：   
- 情况一：add 了 {3, 3, 2, 5} 之后，执行 find(6)，由于 3 出现了两次。 3 + 3 = 6，所以返回 true
- 情况二：add 了 {3, 3, 2, 5} 之后，执行 find(7), 由于 key 为 2，other 为 5 时，算法可以返回 true。

除了上述两种情况，find 只能返回 false 了。

至于这个解法的时间复杂度呢，add 方法是 O(1), find 方法是 O(N)，空间复杂度为 O(N)，和上一道题目比较类似。

继续拓展，设计的这个类，使用 find 方法比较频繁，每次都要 O(N) 的时间，岂不是很浪费时间吗？对于这种情况，是否可以做一些优化？

对于频繁使用 find 方法的场景，可以尝试借助哈希集合来有针对地优化 find 方法：
```java
import java.util.ArrayList;import java.util.HashSet;
class TwoSum {
    Set<Integer> sum = new HashSet<>();
    List<Integer> nums = new ArrayList<>();
    
    public void add(int number) {
        // 记录所有可能组成的和
        for (int n : nums) {
            sum.add(n + number);
        }
        nums.add(number);
    }
    
    public boolean find(int value) {
        return sum.contains(value);
    }

}
```

这样 sum 中 存储了所有加入数字可能组成的和，每次 find 只要花费 O(1) 的时间在集合中判断是否存在，
但是，代价也是很明显，最坏情况下，每次add后 sum 的大小都会翻一倍，所以空间复杂度是 O(2^N).

所以说，除非数据规模非常小，否则这个优化还是不要做了，毕竟指数级的复杂度是一定要想办法避免的。

## 3、最后的总结
对于 2Sum 问题，一个难点就是给的数组无序，对于一个无序的数组，我们似乎什么技巧都没有了，只能暴力穷举所有可能。

一般情况下，我们会首先把数组排序再考虑双指针技巧，2Sum 启发我们，HashMap 或者 HashSet 也可以帮助我们处理无序数组相关的简单问题。

另外，设计的核心在于权衡，利用不同的数据结构，可以得到一些针对性的加强。

最后，如果 2Sum I 中的数组是有序的，应该如何编写算法呢？答案很简单：
```java
int[] twoSum(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while (left < right) {
        int sum = nums[left] + nums[right];
        if (sum == target) {
            return new int[] {left, right};
        } else if (sum < target) {
            left++; // 让 sum 大一些
        } else if (sum > target) {
            right--; // 让 sum 小一些
        }   
    } 
    return new int[] {-1, -1};
}
```

















