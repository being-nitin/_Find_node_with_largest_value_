package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Treenode <Integer> root = new Treenode<>(1);
        Treenode<Integer> node1 = new Treenode<>(2);
        Treenode<Integer> node2 = new Treenode<>(3);
        Treenode<Integer> node3 = new Treenode<>(4);
        Treenode<Integer> node4 = new Treenode<>(5);
        Treenode<Integer> node5 = new Treenode<>(6);
        Treenode<Integer> node6 = new Treenode<>(7);
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node1.children.add(node4);
        node2.children.add(node5);
        node3.children.add(node6);
        System.out.println(largest(root));

    }
    public static int largest(Treenode<Integer> root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int ans = root.data;
        for(int i=0;i<root.children.size();i++){
        int maxChild = largest(root.children.get(i));
        if(maxChild>ans){
            ans = maxChild;
        }
        }
        return ans;
    }
}
