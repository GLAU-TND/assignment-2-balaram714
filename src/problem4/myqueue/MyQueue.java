/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

public class MyQueue {

}static class Node  
{ 

    Node left, right, parent; 

    int key; 
}; 

  

static Node newNode(int key) 
{ 

    Node temp = new Node(); 

    temp.left = temp.right = temp.parent = null; 

    temp.key = key; 

    return temp; 
} 

  

static Node preorderSuccessor(Node root, Node n) 
{ 

    // If left child exists, then it is preorder 

    // successor. 

    if (n.left != null) 

        return n.left; 

  

    // If left child does not exist, then 

    // travel up (using parent pointers) 

    // until we reach a node which is left 

    // child of its parent. 

    Node curr = n, parent = curr.parent; 

    while (parent != null && parent.right == curr)  

    { 

        curr = curr.parent; 

        parent = parent.parent; 

    } 

  

    // If we reached root, then the given 

    // node has no preorder successor 

    if (parent == null) 

        return null; 

  

    return parent.right; 
} 
