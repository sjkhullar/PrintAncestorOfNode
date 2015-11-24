package org.learn.Client;

import org.learn.PrepareTree.Node;
import org.learn.PrepareTree.Tree;
import org.learn.Question.PrintAncestorOfNode;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {		
		int[] data = {50, 150, 25, 80, 125, 160, 10, 30, 60, 90, 110, 140};
    	Tree tree = new Tree();
    	Node root = tree.createNode(100);
    	for(int i : data ) {
    		tree.insert(root, i );
    	}	
    	int iNode = 25;
    	System.out.printf("Ancestor of Node %d is \n",iNode);
    	PrintAncestorOfNode.printAncestorOfNode(root,iNode);    	
    }
}
