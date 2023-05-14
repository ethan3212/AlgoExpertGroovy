package org.example

import org.junit.jupiter.api.Test

class EvaluateExpressionTreeTest {

    @Test
    void evaluateExpressionTreeTest1() {
        def tree = new BinaryTree(-1).insert(Arrays.asList(2, 3))
        def expected = 5
        def actual = EvaluateExpressionTree.evaluateExpressionTree tree
        assert expected == actual
    }

    @Test
    void evaluateExpressionTreeTest2() {
        def tree = new BinaryTree(-2).insert(Arrays.asList(2, 3))
        def expected = -1
        def actual = EvaluateExpressionTree.evaluateExpressionTree tree
        assert expected == actual
    }

    @Test
    void evaluateExpressionTreeTest3() {
        def tree = new BinaryTree(-2).insert(Arrays.asList(3, 2))
        def expected = 1
        def actual = EvaluateExpressionTree.evaluateExpressionTree tree
        assert expected == actual
    }

    @Test
    void evaluateExpressionTreeTest4() {
        def tree = new BinaryTree(-3).insert(Arrays.asList(2, 3))
        def expected = 0
        def actual = EvaluateExpressionTree.evaluateExpressionTree tree
        assert expected == actual
    }

    @Test
    void evaluateExpressionTreeTest5() {
        def tree = new BinaryTree(-3).insert(Arrays.asList(3, 2))
        def expected = 1
        def actual = EvaluateExpressionTree.evaluateExpressionTree tree
        assert expected == actual
    }

    @Test
    void evaluateExpressionTreeTest6() {
        def tree = new BinaryTree(-4).insert(Arrays.asList(2, 3))
        def expected = 6
        def actual = EvaluateExpressionTree.evaluateExpressionTree tree
        assert expected == actual
    }

    ///////////////////////////
    // TEST UNBALANCED TREES //
    ///////////////////////////

    @Test
    void evaluateExpressionTreeTest7() {
        def tree = new BinaryTree(-1).insert(Arrays.asList(2, -2))
        tree.right.left = new BinaryTree(4)
        tree.right.right = new BinaryTree(5)
        def expected = 1
        def actual = EvaluateExpressionTree.evaluateExpressionTree tree
        assert expected == actual
    }

    @Test
    void evaluateExpressionTreeTest8() {
        def tree = new BinaryTree(-3).insert(Arrays.asList(10, -2))
        tree.right.left = new BinaryTree(4)
        tree.right.right = new BinaryTree(6)
        def expected = -5
        def actual = EvaluateExpressionTree.evaluateExpressionTree tree
        assert expected == actual
    }

    @Test
    void evaluateExpressionTreeTest9() {
        def tree = new BinaryTree(-3).insert(Arrays.asList(9, -2))
        tree.right.left = new BinaryTree(4)
        tree.right.right = new BinaryTree(6)
        def expected = -4
        def actual = EvaluateExpressionTree.evaluateExpressionTree tree
        assert expected == actual
    }

    @Test
    void evaluateExpressionTreeTest10() {
        def tree = new BinaryTree(-3).insert(Arrays.asList(9, -2))
        tree.right.left = new BinaryTree(6)
        tree.right.right = new BinaryTree(4)
        def expected = 4
        def actual = EvaluateExpressionTree.evaluateExpressionTree tree
        assert expected == actual
    }

    @Test
    void evaluateExpressionTreeTest11() {
        def tree = new BinaryTree(-2).insert(Arrays.asList(-1, -3, 7, 10, 12, -4))
        tree.right.right.left = new BinaryTree(1)
        tree.right.right.right = new BinaryTree(4)
        def expected = 14
        def actual = EvaluateExpressionTree.evaluateExpressionTree tree
        assert expected == actual
    }

    @Test
    void evaluateExpressionTreeTest12() {
        def tree = new BinaryTree(-1).insert(Arrays.asList(-2, -4, 7, 10, 12, -3))
        tree.right.right.left = new BinaryTree(8)
        tree.right.right.right = new BinaryTree(4)
        def expected = 21
        def actual = EvaluateExpressionTree.evaluateExpressionTree tree
        assert expected == actual
    }

    @Test
    void evaluateExpressionTreeTest13() {
        def tree = new BinaryTree(-1).insert(Arrays.asList(-1, -1, 7, 10, 12, -1))
        tree.right.right.left = new BinaryTree(8)
        tree.right.right.right = new BinaryTree(4)
        def expected = 41
        def actual = EvaluateExpressionTree.evaluateExpressionTree tree
        assert expected == actual
    }

    @Test
    void evaluateExpressionTreeTest14() {
        def tree = new BinaryTree(-2).insert(Arrays.asList(-2, -2, 7, 10, 12, -2))
        tree.right.right.left = new BinaryTree(8)
        tree.right.right.right = new BinaryTree(4)
        def expected = -11
        def actual = EvaluateExpressionTree.evaluateExpressionTree tree
        assert expected == actual
    }

    @Test
    void evaluateExpressionTreeTest15() {
        def tree = new BinaryTree(-3).insert(Arrays.asList(-3, -3, 100, 10, 4, -3))
        tree.right.right.left = new BinaryTree(8)
        tree.right.right.right = new BinaryTree(4)
        def expected = 5
        def actual = EvaluateExpressionTree.evaluateExpressionTree tree
        assert expected == actual
    }

    @Test
    void evaluateExpressionTreeTest16() {
        def tree = new BinaryTree(-4).insert(Arrays.asList(-4, -4, 2, 1, 7, -4))
        tree.right.right.left = new BinaryTree(8)
        tree.right.right.right = new BinaryTree(2)
        def expected = 224
        def actual = EvaluateExpressionTree.evaluateExpressionTree tree
        assert expected == actual
    }

    @Test
    void evaluateExpressionTreeTest17() {
        def tree = new BinaryTree(-4).insert(Arrays.asList(-1, -3, -1, 8, 100, -2, 7, -2))
        tree.right.right.left = new BinaryTree(42)
        tree.right.right.right = new BinaryTree(-3)
        tree.left.left.right.left = new BinaryTree(22)
        tree.left.left.right.right = new BinaryTree(5)
        tree.right.right.right.left = new BinaryTree(-4)
        tree.right.right.right.right = new BinaryTree(2)
        tree.right.right.right.left.left = new BinaryTree(3)
        tree.right.right.right.left.right = new BinaryTree(9)
        def expected = 96
        def actual = EvaluateExpressionTree.evaluateExpressionTree tree
        assert expected == actual
    }
}
