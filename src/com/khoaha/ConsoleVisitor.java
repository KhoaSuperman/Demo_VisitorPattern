package com.khoaha;

/**
 * Created by HoangAnhKhoa on 1/11/16.
 */
public class ConsoleVisitor implements NodeVisitor {
    @Override
    public void visit(TreeNode treeNode) {
        System.out.println("Console : " + treeNode.getName());
    }
}
