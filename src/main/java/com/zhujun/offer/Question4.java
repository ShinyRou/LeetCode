package com.zhujun.offer;

import javax.management.relation.RoleUnresolved;
import java.util.Arrays;

/**
 *输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 **/
public class Question4 {
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        //前序   根左右 第一个为 根节点
        //根据根节点   左根右 将中序分为左右两颗子树
        //递归的实现
        if(pre==null||in==null||pre.length==0||in.length==0){
            throw new RuntimeException("前序或中序遍历错误");
        }
        int headVal = pre[0];
        TreeNode root = new TreeNode(headVal);
        //递归结束条件
        if(pre.length!=1){
            //截取子串
            int headIndex = -1;
            for(int i =0;i<in.length;i++){
                if(in[i]==headVal){
                    headIndex = i;
                }
            }
            if(headIndex>=0){
                //根据头结点对中序 拆分成左右子树
                int[]  leftIn = Arrays.copyOfRange(in,0,headIndex);
                int[]  rightIn = Arrays.copyOfRange(in,headIndex+1,in.length);
                //根据左右子树的长度 截取前序序列
                int[] leftPre = Arrays.copyOfRange(pre,1,leftIn.length+1);
                int[] rightPre = Arrays.copyOfRange(pre,leftIn.length+1,pre.length);
                if(leftIn.length>0){
                    root.left = reConstructBinaryTree(leftPre,leftIn);

                }
                if(rightIn.length>0){
                    root.right = reConstructBinaryTree(rightPre,rightIn);
                }
            }
        }
        return root;

    }



    //中序遍历
    public static void infixOrder(TreeNode current){
        if(current != null){
            infixOrder(current.left);//先遍历左子树
            System.out.print(current.val+" ");//输出根节点数据
            infixOrder(current.right);//遍历右子树
        }
    }
    //前序遍历
    public static void preOrder(TreeNode current){
        if(current != null){
            System.out.print(current.val+" ");//输出根节点数据
            preOrder(current.left);//遍历左子树
            preOrder(current.right);//遍历右子树
        }
    }


    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        TreeNode root = reConstructBinaryTree(pre,in);
        System.out.println("中序：");
        infixOrder(root);
        System.out.println("\n前序：");
        preOrder(root);
    }
}
