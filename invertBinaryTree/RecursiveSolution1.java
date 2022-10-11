package com.leetcode.invertBinaryTree;

import javax.swing.tree.TreeNode;

public class RecursiveSolution1 {

	public TreeNode invertTree(TreeNode root) {
		helper(root);
		return root;
	}
	
	public void helper(TreeNode n) {
		if(n==null) {
			return;
		}
		
		TreeNode t = n.left;
		n.left = n.right;
		n.right = t;
		
		helper(n.left);
		helper(n.right);
	}
}
