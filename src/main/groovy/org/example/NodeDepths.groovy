package org.example

class NodeDepths {

    // O(N) time | O(Log(N)) space
    static def nodeDepths(BinaryTree root) {
        return getNodeDepths(root, 0)
    }

    private static def getNodeDepths(BinaryTree node, int depth) {
        if (node == null) return 0
        return depth + getNodeDepths(node.left, depth + 1) + getNodeDepths(node.right, depth + 1)
    }
}
