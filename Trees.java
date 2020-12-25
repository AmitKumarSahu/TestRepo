import java.util.*;
public class Trees {
    // implementing trees
    static class Node{
        int value;
        Node left , right;
        Node(int value){
            this.value = value;
            left = null;
            right = null;
        }
    }

    //insertion in binary tree
    public static void insertNode(Node rootNode , int value){
        if(rootNode.value > value){
            //insert to left
            if(rootNode.left!=null){
                insertNode(rootNode.left, value);
            }
            else{
                rootNode.left = new Node(value);
            }
        }
            
        else{
            //insert to right
            if(rootNode.right!=null){
                insertNode(rootNode.right, value);
            }
            else{
                rootNode.right = new Node(value);
            }
        }
    }

    //pre-order traversal fo the tree
    public static void preOrderTraversal(Node rootNode){
        if(rootNode!=null){
            System.out.print(rootNode.value+" => ");
            preOrderTraversal(rootNode.left);
            preOrderTraversal(rootNode.right);
        }
    }

    //in-order traversal of the tree
    public static void inOrderTraversal(Node rootNode){
        if(rootNode!=null){
            inOrderTraversal(rootNode.left);
            System.out.print(rootNode.value+" => ");
            inOrderTraversal(rootNode.right);
        }
    }

    //post-order traversal
    public static void postOrderTraversal(Node rootNode){
        if(rootNode!=null){
            postOrderTraversal(rootNode.left);
            postOrderTraversal(rootNode.right);
            System.out.print(rootNode.value+" => ");
        }
    }

    //level-order traversal
    public static void levelOrderTraversal(Node rootNode){
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(rootNode);
        while(!nodes.isEmpty()){
            Node tempNode = nodes.poll();
            System.out.print(tempNode.value+" ===>");
            if(tempNode.left!=null){
                nodes.add(tempNode.left);
            }
            if(tempNode.right!=null){
                nodes.add(tempNode.right);
            }
        } 
    }

    //searching using level order traversal
    public static boolean levelOrderSearch(Node rootNode  , int valueToSearch){
        Queue<Node> nodes = new LinkedList<>();
        if(rootNode==null){
            return false;
        }
        nodes.add(rootNode);
        while(!nodes.isEmpty()){
            Node tempNode = nodes.poll();
            if(tempNode.value==valueToSearch){
                return true;
            }
            if(tempNode.left!=null){
                nodes.add(tempNode.left);
            }
            if(tempNode.right!=null){
                nodes.add(tempNode.right);
            }
        }
        return false;
    }

    //driver code
    public static void main(String args[]){
        Node rNode = new Node(5);
        Node nullNode = null;
        // insertNode(rNode, 80);
        // insertNode(rNode, 70);
        // insertNode(rNode, 50);
        // insertNode(rNode, 40);
        // insertNode(rNode, 60);
        // insertNode(rNode, 90);
        // insertNode(rNode, 200);
        // insertNode(rNode, 150);
        // insertNode(rNode, 140);
        // insertNode(rNode, 160);
        // insertNode(rNode, 300);
        // insertNode(rNode, 400);
        // insertNode(rNode, 350);
        // insertNode(rNode, 410);
        insertNode(rNode, 2);
        insertNode(rNode, 4);
        insertNode(rNode, 8);
        insertNode(rNode, 6);
        insertNode(rNode, 7);
        insertNode(rNode, 3);
        insertNode(rNode, 9);
        //inorder traversal
        // inOrderTraversal(rNode);
        // System.out.println();
        // preOrderTraversal(rNode);
        // System.out.println();
        // postOrderTraversal(rNode);
        // System.out.println();
        // levelOrderTraversal(rNode);
        System.out.println(levelOrderSearch(rNode, 3));
        System.out.println(inOrderSearch(rNode, 3));

    }
    
}
