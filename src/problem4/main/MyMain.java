/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {

public static void main(String args[]) 
{ 

    Node root = newNode(20); 

    root.parent = null; 

    root.left = newNode(10); 

    root.left.parent = root; 

    root.left.left = newNode(4); 

    root.left.left.parent = root.left; 

    root.left.right = newNode(18); 

    root.left.right.parent = root.left; 

    root.right = newNode(26); 

    root.right.parent = root; 

    root.right.left = newNode(24); 

    root.right.left.parent = root.right; 

    root.right.right = newNode(27); 

    root.right.right.parent = root.right; 

    root.left.right.left = newNode(14); 

    root.left.right.left.parent = root.left.right; 

    root.left.right.left.left = newNode(13); 

    root.left.right.left.left.parent = root.left.right.left; 

    root.left.right.left.right = newNode(15); 

    root.left.right.left.right.parent = root.left.right.left; 

    root.left.right.right = newNode(19); 

    root.left.right.right.parent = root.left.right; 

  

    Node res = preorderSuccessor(root, root.left.right.right); 

  

    if (res != null)  

    { 

        System.out.printf("Preorder successor of %d is %d\n", 

            root.left.right.right.key, res.key); 

    } 

    else

    { 

        System.out.printf("Preorder successor of %d is null\n", 

            root.left.right.right.key); 

    } 
} 
} 
}
