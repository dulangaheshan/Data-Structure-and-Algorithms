package BinaryTree;

public class Tree {

    public TreeNode root;

    public void insert(int value){
        if(this.root == null){
            root = new TreeNode(value);
        }
        else{
            root.insert(value);
        }
    }

    public TreeNode get(int value){
        if(root != null){
            return root.get(value);
        }
        return null;
    }

    public void travelseInOrder(){
        if(root != null){
            root.travelseInOrder();
        }
    }
}
