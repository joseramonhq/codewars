package codewars.kyu7.find_Max_Tree_Node;

import java.util.Stack;

public class FindMaxValueInTree {

    static int findMax(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        int max = Integer.MIN_VALUE;

        while (!stack.empty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                if (root.value > max) max = root.value;
                root = root.right;
            }
        }
        return max;
    }
}

