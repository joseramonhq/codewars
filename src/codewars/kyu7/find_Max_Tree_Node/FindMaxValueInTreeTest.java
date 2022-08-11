package codewars.kyu7.find_Max_Tree_Node;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMaxValueInTreeTest {
    @Test
    public void findMaxInLeaf() {
        TreeNode root = TreeNode.leaf(-1);
        assertEquals(-1, FindMaxValueInTree.findMax(root));
    }

    @Test
    public void findMaxInOneChildTree() {
        TreeNode root = TreeNode.leaf(1).withLeftLeaf(2);
        assertEquals(2, FindMaxValueInTree.findMax(root));
    }

    @Test
    public void findMaxInPerfectTree() {
        TreeNode left = TreeNode.leaf(-22).withLeaves(9, 50);
        TreeNode right = TreeNode.leaf(11).withLeaves(9, 2);
        TreeNode root = TreeNode.join(5, left, right);
        assertEquals(50, FindMaxValueInTree.findMax(root));
    }

    @Test
    public void findMaxInUnbalancedTree() {
        TreeNode left = TreeNode.leaf(50).withLeaves(-100, -10);
        TreeNode right = TreeNode.leaf(40);
        TreeNode root = TreeNode.join(6, left, right);
        assertEquals(50, FindMaxValueInTree.findMax(root));
    }

    @Test
    public void findMaxInNegativeTree() {
        TreeNode left = TreeNode.leaf(-50).withLeaves(-100, -10);
        TreeNode right = TreeNode.leaf(-40);
        TreeNode root = TreeNode.join(-600, left, right);
        assertEquals(-10, FindMaxValueInTree.findMax(root));
    }
}
