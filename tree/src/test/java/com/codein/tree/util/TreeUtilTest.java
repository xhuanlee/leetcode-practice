package com.codein.tree.util;

import com.codein.tree.entry.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lxh on 2018/4/25.
 */
public class TreeUtilTest {
    @Test
    public void generateTreeFromPreOrder() throws Exception {
        Integer[] array = {0};
        TreeNode tree = TreeUtil.generateTreeFromPreOrder(array);
        assertTrue(tree != null && tree.getValue() == 0);
    }

    @Test
    public void preOrderTraversal() throws Exception {
        TreeNode root = new TreeNode(0, new TreeNode(1, new TreeNode(6, new TreeNode(7, new TreeNode(8), null), null), new TreeNode(2)), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        List<Integer> list = TreeUtil.preOrderTraversalRecursive(root);
        Integer[] expects = {0, 1, 6, 7, 8, 2, 3, 4, 5};
        Integer[] actual = new Integer[list.size()];
        list.toArray(actual);
        assertArrayEquals(expects, actual);
    }

}