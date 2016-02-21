
package org.learn.Question;

public class PrintAncestorOfNode {
	public static boolean printAncestorOfNode(Node root, int data) {
		if(null == root) {
			return false;
		}
		//we found the node
		if(root.data == data) {
			return true;
		}
		boolean bFoundOnLeft = printAncestorOfNode(root.left,data);
		if(bFoundOnLeft) {
			System.out.printf("%d ",root.data);
			return bFoundOnLeft;
		}
		boolean bFoundOnRight = printAncestorOfNode(root.right,data);
		if(bFoundOnRight) {
			System.out.printf("%d ",root.data);
			return bFoundOnRight;
		}
		return false;
	}
	
	
}
