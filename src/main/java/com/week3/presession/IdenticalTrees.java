package com.week3.presession;

public class IdenticalTrees {

	public static void main(String[] args) {

	}
	
	class TreeNode {
		int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	public int isSameTree(TreeNode a, TreeNode b) {
	    if(isSame(a,b))
	        return 1;
	    return 0;
	}
	
	public boolean isSame(TreeNode a, TreeNode b) {
	    if(a == null && b == null) return true;
	    if(a == null || b == null) return false;
	    if(a.val == b.val)
	        return isSame(a.left, b.left) && isSame(a.right, b.right);
	    return false;
	}


}
