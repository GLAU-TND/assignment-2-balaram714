/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class
import problem1.mybst;
public class MyMain {

class BinaryTree 
{ 

    // Root of Binary Tree 

    Node root; 

  

    BinaryTree() 

    { 

        root = null; 

    } 

  

    /* Given a binary tree, print its nodes according to the 

      "bottom-up" postorder traversal. */

    void printPostorder(Node node) 

    { 

        if (node == null) 

            return; 

  

        // first recur on left subtree 

        printPostorder(node.left); 

  

        // then recur on right subtree 

        printPostorder(node.right); 

  

        // now deal with the node 

        System.out.print(node.key + " "); 

    } 


void printPreorder(Node node) 

    { 

        if (node == null) 

            return; 

  

        /* first print data of node */

        System.out.print(node.key + " "); 

  

        /* then recur on left sutree */

        printPreorder(node.left); 

  

        /* now recur on right subtree */

        printPreorder(node.right); 

    } 

public static void main(String[] args) 

    { 

        BinaryTree tree = new BinaryTree(); 

        tree.root = new Node(1); 

        tree.root.left = new Node(2); 

        tree.root.right = new Node(3); 

        tree.root.left.left = new Node(4); 

        tree.root.left.right = new Node(5); 

  

        System.out.println("Preorder traversal of binary tree is");

        tree.printInorder(); 

  

        System.out.println("\nPostorder traversal of binary tree is "); 

        tree.printPostorder(); 

    } 
}}
}
