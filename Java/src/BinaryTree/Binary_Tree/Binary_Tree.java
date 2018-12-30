package BinaryTree.Binary_Tree;

public class Binary_Tree {
    TreeNode root;


    public void addTreeNode(int value){

        root = insertNode(root,value);
    }


    public boolean find(int value){
        return containsNode(root,value);
    }

    public void deleteTreeNode(int value){
        root = delete(root,value);
    }

    public void traversel_InOrder(){

        traverseInOrder(root);

    }

    public void traversel_PreOrder(){

        traversePreOrder(root);

    }

    public void traversel_PostOrder(){

        traversePostOrder(root);

    }

    private TreeNode insertNode(TreeNode current, int value){


        if(current == null){
           // TreeNode treenode = new TreeNode(value);
            return new TreeNode(value);
        }

        if(value < current.value){
            current.left = insertNode(current.left,value);
        }
        if(value > current.value){
            current.right = insertNode(current.right,value);
        }
        else{
            return current;
        }

        return current;
    }



    private boolean containsNode(TreeNode current, int value){
        if(current == null){
            return false;
        }
        if(value == current.value){
            return true;
        }

        return value < current.value ? containsNode(current.left,value) : containsNode(current.right,value);
    }

    private TreeNode delete(TreeNode current, int value){
        if(current == null){
            return null;
        }

        if(value == current.value){
            if(current.left == null && current.right == null){
                return null;
            }
            if(current.left == null){
                return current.right;
            }
            if(current.right == null){
                return current.left;
            }
            else{
                int smallestValue = findSmallest(current.right);
                current.value = smallestValue;
                current.right = delete(current.right, smallestValue);
                return current;
            }
        }
        if(value < current.value){
            current.left=delete(current.left,value);
        }
        if(value > current.value){
            current.right=delete(current.right,value);
        }

        return current;
    }

    private int findSmallest(TreeNode root){

        return root.left == null ? root.value: findSmallest(root.left);
    }


    public void traverseInOrder(TreeNode node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(TreeNode node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(TreeNode node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.value);
        }
    }












    public static void main(String[] args) {

        Binary_Tree bt = new Binary_Tree();
        bt.addTreeNode(6);
        bt.addTreeNode(4);
        bt.addTreeNode(8);
        bt.addTreeNode(3);
        bt.addTreeNode(5);
        bt.addTreeNode(7);
        bt.addTreeNode(9);

        System.out.println(bt.find(6));

        bt.deleteTreeNode(4);

        System.out.println(bt.find(4));

        bt.traversel_InOrder();
        System.out.println();
        bt.traversel_PreOrder();
        System.out.println();
        bt.traversel_PostOrder();
    }

}
