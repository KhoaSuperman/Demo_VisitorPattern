package com.khoaha;

/**
 * Created by HoangAnhKhoa on 1/11/16.
 */
public class TreeNode {
    String name;

    public TreeNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accept(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }
}
