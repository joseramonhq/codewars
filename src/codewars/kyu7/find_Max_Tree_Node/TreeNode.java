package codewars.kyu7.find_Max_Tree_Node;

class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;

    public TreeNode(int value) {
        this(value, null, null);
    }

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public static TreeNode leaf(int i) {
        return new TreeNode(i);
    }

    public TreeNode withLeftLeaf(int i) {
        left = new TreeNode(i);
        return this;
    }

    public TreeNode withLeaves(int left, int right) {
        this.left = new TreeNode(left);
        this.right = new TreeNode(right);
        return this;
    }

    public static TreeNode join(int i, TreeNode left, TreeNode right) {
        return new TreeNode(i, left, right);
    }
}
