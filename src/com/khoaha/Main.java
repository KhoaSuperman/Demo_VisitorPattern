package com.khoaha;

public class Main {

    public static void main(String[] args) {
        ConsoleVisitor consoleVisitor = new ConsoleVisitor();
        EmailVisitor emailVisitor = new EmailVisitor();
        TreeNode treeNode = new TreeNode("Jav");
        treeNode.accept(consoleVisitor);
        treeNode.accept(emailVisitor);
    }
}
