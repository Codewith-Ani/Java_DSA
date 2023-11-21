package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Tree {
    static Node root;
    static List<Integer> result = new ArrayList<>();

    // MAIN METHOD
    public static void main(String[] args) {
        createTree(); // CREATING TREE
        traverseTree(); // Traversing Tree

        /*int height = heightOfTree(root);
        System.out.println(height);

        System.out.println(isSymmetric(root));*/
    }

    // CREATE TREE METHOD
    static void createTree() {
        //Tree vTree = new Tree();
        root = new Node(3);

        root.left = new Node(9);
        root.right = new Node(20);

        root.left.left = new Node(5);
        root.left.right = new Node(4);

        root.right.left = new Node(15);
        root.right.right = new Node(7);
    }

    // TRAVERSE TREE
    static void traverseTree() {

/*        result  = in_OrderTraversal(root);
        System.out.println(result);

        result  = pre_OrderTraversal(root);
        System.out.println(result);

        result  = post_OrderTraversal(root);
        System.out.println(result);*/

        System.out.println(level_OrderTraversal(root));

    }

    // PRE ORDER TRAVERSAL
    public static List<Integer> pre_OrderTraversal(Node root) {

        if(root == null)
            return result;

        result.add(root.value);
        pre_OrderTraversal(root.left);
        pre_OrderTraversal(root.right);
        return result;
    }

    // POST ORDER TRAVERSAL
    public static List<Integer> post_OrderTraversal(Node root) {
        if(root == null)
            return result;

        post_OrderTraversal(root.left);
        post_OrderTraversal(root.right);
        result.add(root.value);

        return result;

    }

    // IN ORDER TRAVERSAL
    static List<Integer> in_OrderTraversal(Node root) {
        if(root == null) {
            return result;
        }
        in_OrderTraversal(root.left);
        result.add(root.value);
        in_OrderTraversal(root.right);
        return result;
    }

    // LEVEL ORDER TRAVERSAL
    static List<Integer> level_OrderTraversal(Node root) {
        List<Integer> res = new ArrayList<>();
        Queue<Node> vQueue = new LinkedList();

        while (root != null) {
            System.out.println(root.value);
            root = root.left;
        }
        return res;
    }

    // HEIGHT OF TREE
    static int heightOfTree(Node root) {
        if(root == null) {
            return 0;
        }
        return 1 + Math.max(heightOfTree(root.left) , heightOfTree(root.right));
    }

    // SYMMETRIC TREE FUNCTION
    static boolean isSymmetric(Node root) {
        return checkNode_isSymmetric(root,root);
    }

    // CHECK IF EACH NODE IS SYMMETRIC - IS_SYMMETRIC HELPER FUNCTION
    static boolean checkNode_isSymmetric(Node left, Node right) {
        // Condition 1: Check if left and right nodes are null
        if(left == null && right == null)
            return true;

        // Condition 2: Check if left or right node is null and other is not null
        if(left == null || right == null)
            return false;

        // Condition 3: check if value of left node is not equal to value of right node.
        if(left.value != right.value)
            return false;

        // Condition 4: check if left.left.value == left.right.value
        return checkNode_isSymmetric(left.left, right.right) && checkNode_isSymmetric(left.right, right.left);
    }
}
