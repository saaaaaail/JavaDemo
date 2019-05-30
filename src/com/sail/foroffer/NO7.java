package com.sail.foroffer;


import com.sail.tree.LevelTree;
import com.sail.tree.Tree;
import com.sail.tree.TreeNode;

import java.util.Scanner;

/**
 * @program: JavaDemo
 * @description: 重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，重建该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复数字
 * @author: sail
 * @create: 2019/05/30 12:02
 */

public class NO7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pre = sc.nextLine();
        String post = sc.nextLine();
        LevelTree.levelTree(construct(pre,"#"+post+"#"));
    }

    public static TreeNode construct(String pre, String post){
        char rootVal = pre.charAt(0);
        TreeNode node = new TreeNode(rootVal-'0');

        String[] postChilds = post.split(rootVal+"");

        String postleft = postChilds[0];
        String postright = postChilds[1];

        if (!postleft.equals("#")){
            String preleft = pre.substring(1,1+postleft.length()-1);
            node.setLchild(construct(preleft,postleft+"#"));
        }
        if (!postright.equals("#")){
            String preright = pre.substring(1+postleft.length()-1);
            node.setRchild(construct(preright,"#"+postright));
        }





        return node;
    }
}
