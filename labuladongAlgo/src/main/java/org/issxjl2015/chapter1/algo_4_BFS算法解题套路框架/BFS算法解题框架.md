# BFS算法解题框架

BFS （Breath First Serach，广度优先搜索） 和 DFS（Depth First Search，深度优先搜索）算法是特别常用的两种算法，其中 DFS 算法被认为是 回溯算法。

BFS 算法的核心思想：把一些问题抽象成图，从一个点开始，向四周扩散。一般来说，写 BFS算法都是用 “队列” 这种数据结构，每次都将一个节点周围的所有节点加入队列。

 BFS 相对 DFS 的最主要的区别： BFS 找到的路径一定是最短的，但代价是空间复杂度 比 DFS 大很多，至于为什么，看后面总结的框架就很容易理解了。
 
 ## 算法框架
 BFS 问题的本质：
 >让你在一幅“图” 中找到从 起点 start 到 终点 target 的最近距离

BFS 广义的描述，可以有各种变体，比如：
>1、走迷宫，有的格子是围墙不能走，从起点到终点的最短距离是多少？ 如果这个迷宫带 “传送门” 可以瞬时传送呢？
>
>2、有两个单词，要求通过替换某些字母，把其中一个变成另一个，每次只能替换一个字母，最少要替换几次？
>
>3、连连看游戏，消除两个方块的条件不仅是图案相同，还要保证两个方块之间的最短连线不能多于两个拐点。你玩连连看，点击两个坐标，游戏程序是如何找到最短连线的？如何判断最短连线有几个拐点？

其实，这些问题，本质上就是一幅图，让你从起点走到终点，问最短路径，这就是 BFS 的本质。

BFS 算法框架代码：
```java
public int BFS(Node start, Node target) {
    Queue<Node> q;      // 核心数据结构
    Set<Node> visited;  // 避免走回头路
    
    q.offer(start);     // 将起点加入队列
    visited.add(start);
    int step = 0;       // 记录扩散的步数
    
    while (q not empty) {
        int sz = q.size();
        // 将当前队列中的所有节点向四周扩散
        for (int i = 0; i < sz; i++) {
            Node cur = q.poll();
            // 划重点：在这里判断是否到大终点
            if (cur is target) {
                return step;
            }
            // 将 cur 的相邻节点加入队列
            for (Node x : cur.adj()) {
                if (x not in visited) {
                    q.offer(x);
                    visited.add(x);
                }   
            }    
        }
        // 划重点：在这里更新步数
        step++;
    }   
}
```

>队列 q 是 BFS 的核心数据结构；
>
>cur.adj() 泛指与 cur 相邻的节点，比如在二维数组中，cur 上下左右四面的位置就是相邻节点
>
>visited 的主要作用：防止走回头路，大部分时候都是必需的
>>例外：二叉树结构，没有子节点到父节点的指针，不会走回头路就不需要 visited
 
 ## 二叉树的最小高度
 二叉树的最小高度，也就是根节点到叶子节点的最短距离。
 需要明确起点 start 和 终点 target 是什么，以及 怎么判断到达了终点。
 
 起点就是 root 根节点，终点就是最靠近根节点的那个 “叶子节点”，叶子节点就是两个子节点都是null的节点。
 ```java
if (cur.left == null && cur.right == null) {
    // 到达叶子节点
}
```

那么，按照上述框架加以改造来写解法即可：
```java
public class Lc_111_二叉树的最小深度 {
    
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        // root 本身就是一层，将 depth 初始化 为 1
        int depth = 1;
        
        while (!q.isEmpty()) {
            int sz = q.size();
            // 将当前队列中所有节点向四周扩散
            for (int i = 0; i < sz; i++) {
                TreeNode cur = q.poll();
                // 判断是否达到终点
                if (cur.left == null && cur.right == null) {
                    return depth;
                }
                
                // 将 cur 的 相邻节点加入队列
                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }
            }
            
            // 在这里增加步数
            depth++;
        }
        return depth;
    }
}
```

1、为啥BFS 可以找到最短距离，DFS 不行吗？
>答：1、看BFS的逻辑，depth 每增加一次，队列中所有节点都向前迈一步，这个逻辑可以保证一旦找到一个终点，走的步数肯定是最少的。
>
>2、DFS其实也可以找到最短路径，但是DFS实际上是通过递归的堆栈记录走过的路径的，要找到最短路径，肯定要把二叉树中所有的节点全部探索完，才能对比出最短的路径。
>
>而 BFS 还没遍历完整棵树，就找到了最短距离，因此，BFS 相对更高效。

2、既然BFS 这么好，为啥 DFS 还要存在？
>答：BFS 可以找到最短距离，但是空间复杂度搞，而DFS 空间复杂度较低。
>
>客观来说，BFS 还是有代价的，一般来说，找最短路径使用BFS，其他的时候，用 DFS 多一些。（主要是递归代码比较好写）