package com.sail.leaks;

public class ReverseTree {
    public static void reverseTree(TreeNode rootNode){
        if (rootNode==null){return;}

        TreeNode leftNode = rootNode.getLchild();
        TreeNode rightNode = rootNode.getRchild();

        TreeNode tmp = leftNode;
        leftNode=rightNode;
        rightNode=tmp;
        rootNode.setRchild(rightNode);
        rootNode.setLchild(leftNode);
        reverseTree(leftNode);


        reverseTree(rightNode);

    }

    public static TreeNode getReverseTree(TreeNode rootNode){
        if (rootNode==null){
            return null;
        }
        TreeNode treeNode = new TreeNode(rootNode.getVal());
        treeNode.setRchild(getReverseTree(rootNode.getLchild()));
        treeNode.setLchild(getReverseTree(rootNode.getRchild()));
        return rootNode;
    }


}
