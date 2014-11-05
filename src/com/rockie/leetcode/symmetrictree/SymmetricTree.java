/**
 * 
 */
package com.rockie.leetcode.symmetrictree;

/**
 * @author wangjinhe
 *
 */
public class SymmetricTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode rootNode = buildTree();
		boolean isSymmetric = isSymmetric(rootNode);
		System.out.println(isSymmetric);
	}

	public static TreeNode buildTree() {
		TreeNode rootNode = new TreeNode(1);
		rootNode.left = new TreeNode(2);
		rootNode.right = new TreeNode(2);
		rootNode.left.left = new TreeNode(3);
		rootNode.right.right = new TreeNode(3);
		// rootNode.left.right = new TreeNode(4);
		// rootNode.right.left = new TreeNode(4);
		return rootNode;
	}

	/**
	 * Is a given root symmetric.
	 * 
	 * @param root
	 * @return
	 */
	public static boolean isSymmetric(TreeNode root) {
		if (null == root) {
			return false;
		}

		return isSymmetric(root.left, root.right);
	}

	/**
	 * Are two nodes symmetric.
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
	public static boolean isSymmetric(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		}

		if (left == null || right == null) {
			return false;
		}

		return left.val == right.val && isSymmetric(left.left, right.right)
				&& isSymmetric(left.right, right.left);
	}
}
