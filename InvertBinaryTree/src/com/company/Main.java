package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }




    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            if (root.left != null && root.right != null) {
                TreeNode temp = root.left;
                root.left = root.right;
                root.right = temp;
                invertTree(root.left);
                invertTree(root.right);
            } else if (root.left != null) {
                root.right = root.left;
                root.left = null;
                invertTree(root.right);
            } else if (root.right != null) {
                root.left = root.right;
                root.right = null;
                invertTree(root.left);
            }
        }
        return root;
    }
}
