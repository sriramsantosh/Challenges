package com.week3.presession;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class InOrderTraversal {

	public static void main(String[] args) {

	}
	
	class TreeNode {
		int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}

	
	public ArrayList<Integer> inorderTraversal(TreeNode a) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();

	    Stack<TreeNode> stack = new Stack<TreeNode>();
	    TreeNode cur = a;
	    
	    while(cur!=null || !stack.empty()){
	        while(cur!=null){
	            stack.add(cur);
	            cur = cur.left;
	        }
	        cur = stack.pop();
	        list.add(cur.val);
	        cur = cur.right;
	    }

	    return list;
	}

}
