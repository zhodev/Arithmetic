package 链表;

import java.util.ArrayList;

/**
 * 题目描述：输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 *
 * @author: Hengo
 * @date: 2018/7/19 23:35
 */
public class Solution {
    ArrayList<Integer> arr = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null) {
            this.printListFromTailToHead(listNode.next);
            arr.add(listNode.val);
        }
        return arr;
    }
}
