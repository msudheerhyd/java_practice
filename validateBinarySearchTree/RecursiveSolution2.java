package com.leetcode.validateBinarySearchTree;

import javax.swing.tree.TreeNode;

public class RecursiveSolution2 {

	public boolean isVaildBST(TreeNode root) {
		return helper(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
	}
	
	public boolean helper(TreeNode root, double min, double max) {
		if(root == null) {
			return true;
		}
		
		if(root.val<=min || root.val>=max) {
			return false;
		}
		
		boolean isLeftBST = helper(root.left, min, root.val);
		boolean isRightBST = helper(root.right, root.val, max);
		
		if(!isLeftBST||!isRightBST) {
			return false;
		}
		
		return true;
	}
}
