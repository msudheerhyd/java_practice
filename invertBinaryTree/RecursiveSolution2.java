package com.leetcode.invertBinaryTree;

import javax.swing.tree.TreeNode;

public class RecursiveSolution2 {

	public TreeNode invertTree(TreeNode root) {
		if(root == null) {
			return root;
		}
		
		invertTree(root.left);
		invertTree(root.right);
		
		TreeNode t = root.left;
		root.left = root.right;
		root.right = t;
		
		return root;
	}
}
