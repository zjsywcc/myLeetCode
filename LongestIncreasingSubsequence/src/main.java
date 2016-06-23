/**
 * Created by wcc on 2016/5/3.
 */
public class main {
    public static void main(String[] args) {

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }

        public void addNode(int val) {
            if(val >= this.val) {
                if(this.right == null) {
                    this.right = new TreeNode(val);
                } else {
                    this.right.addNode(val);
                }
            } else {
                if(this.left == null) {
                    this.left = new TreeNode(val);
                } else {
                    this.left.addNode(val);
                }
            }
        }
    }

    public class Tree {
        int[] nums;
        public TreeNode getRoot() {
            return root;
        }

        TreeNode root;
        Tree(int[] nums) {
            this.nums = nums;
            this.root = createTree(nums);
        }
        public TreeNode createTree(int[] nums) {
            int len = nums.length;
            if(len == 0) {
                return null;
            }
            TreeNode root = new TreeNode(nums[0]);
            for(int i = 1; i < len; i++) {
                root.addNode(nums[i]);
            }
            return root;
        }
    }



    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if(len == 0) {
            return 0;
        }
        Tree tree = new Tree(nums);

    }

    public TreeNode findLeftest(TreeNode treeNode) {
        TreeNode node = treeNode;
        while(node != null) {
            if(node.left != null) {
                node = node.left;
            } else {
                break;
            }
        }
        return node;
    }

    public void traverse(TreeNode root) {
        while(root != null)
    }

}
