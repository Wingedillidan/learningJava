package main.java;

/**
 * Created by collinm on 6/4/17.
 */
public class BinaryTreeNode {

    private BinaryTreeNode left;
    private BinaryTreeNode right;
    private Object data;

    public BinaryTreeNode(Object data) {
        this.data = data;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
