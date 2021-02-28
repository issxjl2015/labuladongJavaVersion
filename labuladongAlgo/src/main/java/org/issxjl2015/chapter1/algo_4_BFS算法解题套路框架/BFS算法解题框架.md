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
 
 ## 