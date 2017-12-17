package com.week3.presession;

public class HasPathSum {

	public static void main(String[] args) {

	}
	
	class TreeNode {
		int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	public int hasPathSum(TreeNode a, int b) {
		   
        if(hasPathSumB(a,b))
           return 1;
        
        return 0;
	}
	
	public boolean hasPathSumB(TreeNode a, int b){
        
        if(a == null) return false;
    
        if(a.left == null && a.right == null && b - a.val == 0) return true;
    
        return hasPathSumB(a.left, b - a.val) || hasPathSumB(a.right, b - a.val);
	    
	}

}
