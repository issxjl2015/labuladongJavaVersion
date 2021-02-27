package org.issxjl2015.tx.arrayandstring.lc_有效的括号;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *
 * 解题思路：
 * 1、用map来保存 不同字符之间的映射关系
 * 2、用stack来保存 没有配对的字符
 * 3、遍历的时候，
 *      1）如果stack为空，则直接存入
 *      2）如果不为空，则比较stack栈顶的字符和map取出的字符是否相等，如果相等，则弹出栈顶的字符
 *                  否则，将字符加到stack的栈顶
 * 4、遍历结束后，判断stack是否为空，如果为空，说明字符全部配对成功，是有效的括号，否则为非有效的括号
 *
 */
public class Solution {

    public boolean isValid(String s) {
        if (s == null || s.length() < 2) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
                continue;
            }
            // 判断是否
            if (stack.peek() == map.get(s.charAt(i))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }

}
