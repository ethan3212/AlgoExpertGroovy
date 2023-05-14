package org.example

class EvaluateExpressionTree {

    // O(N) time | O(N * Log(N)) space
    static int evaluateExpressionTree(BinaryTree tree) {
        if (tree.value >= 0) return tree.value
        int leftValue = evaluateExpressionTree(tree.left) as int
        int rightValue = evaluateExpressionTree(tree.right) as int
        switch (tree.value) {
            case -1: return leftValue + rightValue
            case -2: return leftValue - rightValue
            case -3: return leftValue / rightValue
            default: return leftValue * rightValue
        }
    }
}
