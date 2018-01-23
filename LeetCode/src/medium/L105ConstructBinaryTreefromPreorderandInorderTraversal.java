package medium;

public class L105ConstructBinaryTreefromPreorderandInorderTraversal {
	/*
	 * 根据前序遍历与中序遍历重建一个二叉树
	 */
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if (preorder == null || inorder == null) {
			return null;
		}
		int length = preorder.length;
		if(length==0){
			TreeNode root =null;
			return root;
		}
		//System.out.println(length);
		int startPre = 0;
		int endPre = length - 1;
		int startIn = 0;
		int endIn = length - 1;

		return buildTreeCore(preorder, inorder, startPre, endPre, startIn, endIn);
	}

	public TreeNode buildTreeCore(int[] preorder, int[] inorder, int startPre, int endPre, int startIn, int endIn) {
		// 前序遍历的第一个结点为根节点。
		int rootValue=preorder[startPre];
		TreeNode root = new TreeNode(rootValue);
		root.left = root.right = null;
		System.out.println("前序遍历第一个节点"+preorder[startPre]);
		if (preorder[startPre] == preorder[endPre] )
			if(inorder[startIn] == inorder[endIn]) {
			return root;
		} else {
			System.out.println("非法输入");
		}
		//在中序遍历中找到根节点
		int rootInorderIndex=startIn;
		while(startIn<=endIn && inorder[rootInorderIndex]!=rootValue){
			rootInorderIndex++;
		}
		int leftLen=rootInorderIndex-startIn;
		int leftPreEnd=startPre+leftLen;
		if(leftLen>0){
			root.left=buildTreeCore(preorder,inorder,startPre+1,leftPreEnd,startIn,rootInorderIndex-1);
		}
		if(leftLen<endPre-startPre){
			root.right=buildTreeCore(preorder,inorder,leftPreEnd+1,endPre,rootInorderIndex+1,endIn);
				
		}
		return root;
	}
	public static void main(String[] args) {
		L105ConstructBinaryTreefromPreorderandInorderTraversal cc= new L105ConstructBinaryTreefromPreorderandInorderTraversal();
		int[] preorder1={1,2,4,7,3,5,6,8};
		int[] inorder1={4,7,2,1,5,3,8,6};
		int[] preorder={1,2};
		int[] inorder={2,1};
		cc.buildTree(preorder, inorder);
	}

}
