package medium;

public class L106ConstructBinaryTreefromInorderandPostorderTraversal {
	/*
	 * 根据前序遍历与中序遍历重建一个二叉树
	 */
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		if (postorder == null || inorder == null) {
			return null;
		}
		int length = inorder.length;
		if (length == 0) {
			TreeNode root = null;
			return root;
		}
		// System.out.println(length);
		int startPost = 0;
		int endPost = length - 1;
		int startIn = 0;
		int endIn = length - 1;

		return buildTreeCore(inorder, postorder, startIn, endIn, startPost, endPost);
	}

	public TreeNode buildTreeCore(int[] inorder, int[] postorder, int startIn, int endIn, int startPost, int endPost) {
		// 后序遍历的最后一个结点为根节点。
		int rootValue = postorder[endPost];
		TreeNode root = new TreeNode(rootValue);
		root.left = root.right = null;
		if (postorder[startPost] == postorder[endPost]) {
			if (inorder[startIn] == inorder[endIn]) {
				return root;
			} else {
				System.out.println("非法输入");
			}
		}
		// 在中序遍历中找到根节点
		int rootInorderIndex = startIn;
		while (startIn <= endIn && inorder[rootInorderIndex] != rootValue) {
			rootInorderIndex++;
		}
		int leftLen = rootInorderIndex - startIn;
		int leftPostEnd = startPost + leftLen-1;
		if (leftLen > 0) {
			root.left = buildTreeCore(inorder, postorder, startIn, rootInorderIndex - 1, startPost, leftPostEnd);
		}
		if (leftLen < endPost - startPost) {
			root.right = buildTreeCore(inorder, postorder, rootInorderIndex + 1, endIn, leftPostEnd + 1, endPost - 1);

		}
		return root;
	}

	public static void main(String[] args) {
		L106ConstructBinaryTreefromInorderandPostorderTraversal cc = new L106ConstructBinaryTreefromInorderandPostorderTraversal();
		int[] preorder1 = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] inorder = { 4, 7, 2, 1, 5, 3, 8, 6 };
		int[] preorder2 = { 1, 2 };
		int[] inorder2 = { 2, 1 };
		int[] postorder={7,4,2,5,8,6,3,1};
		cc.buildTree( inorder,postorder);
	}

}
