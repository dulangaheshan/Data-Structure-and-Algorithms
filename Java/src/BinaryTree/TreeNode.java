package BinaryTree;

import com.sun.xml.internal.stream.events.NamedEvent;

public class TreeNode {

    public int data;
    public TreeNode leftChild;
    public TreeNode rightChild;

    public TreeNode(int value){
        this.data = value;
    }

    public void insert(int value){
        if(value == data){
            return;
        }
        if(value < data){
            if(leftChild == null){
                leftChild = new TreeNode(value);
            }
            else{
                leftChild.insert(value);
            }
        }
        if(value > data){
            if(rightChild == null){
                rightChild = new TreeNode(value);
            }
            else{
                rightChild.insert(value);
            }
        }
    }


    public TreeNode get(int value){
        if(value == data){
            return this;
        }
        if(value < data){
            if(leftChild != null){
                return leftChild.get(value);
            }
        }
        else{
            if(rightChild != null){
                return rightChild.get(value);
            }
        }
        return null;
    }



    public void travelseInOrder(){
        if(leftChild != null){
            leftChild.travelseInOrder();
        }
        System.out.println(data+" ");
        if(rightChild != null){
            rightChild.travelseInOrder();
        }
    }


}
