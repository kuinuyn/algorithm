package bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
	int val;
	TreeNode left, right;
	
	TreeNode(int x) {
		this.val = x;
	}
}

public class BasicBfsTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		System.out.print(solve(root));
	}
	
	public static List<List<Integer>> solve(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		boolean chk = true;
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> nodeList = new ArrayList<>();
			
			for(int i=0; i<size; i++) {
				TreeNode node = queue.poll();
				
				if(chk) {
					nodeList.add(node.val);
				}
				else {
					nodeList.add(0, node.val);
				}
				
				if(node.left != null) {
					queue.offer(node.left);
				}
				if(node.right != null) {
					queue.offer(node.right);
				}
			}
			
			chk = !chk;
			result.add(nodeList);
			
		}
		
		return result;
	}
}
