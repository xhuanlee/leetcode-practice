package com.codein.tree.util;

import com.codein.tree.entry.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 处理二叉树
 * Created by lxh on 2018/4/25.
 */
public class TreeUtil {

    /**
     * 根据二叉树先序遍历的结果，返回二叉树
     * @param array
     * @return
     */
    public static TreeNode generateTreeFromPreOrder(Integer[] array) {
        return null;
    }

    /**
     * 二叉树的先序遍历（递归）
     * @param root
     * @return
     */
    public static List<Integer> preOrderTraversalRecursive(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(root.getValue());
        if (root.getLeft() != null) {
            list.addAll(preOrderTraversalRecursive(root.getLeft()));
        }
        if (root.getRight() != null) {
            list.addAll(preOrderTraversalRecursive(root.getRight()));
        }

        return list;
    }

    /**
     * 二叉树的先序遍历（迭代）
     * @param root
     * @return
     */
    public static List<Integer> preOrderTraversalIterative(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        return list;
    }

}
