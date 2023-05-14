package org.example

import org.junit.jupiter.api.Test

class NodeDepthsTest {

    /////////////////////////
    // TEST BALANCED TREES //
    /////////////////////////

    @Test
    void nodeDepthsTest1() {
        def tree = new BinaryTree(1)
        def expected = 0
        def actual = NodeDepths.nodeDepths tree
        assert expected == actual
    }

    @Test
    void nodeDepthsTest2() {
        def tree = new BinaryTree(1).insert(List.of(2))
        def expected = 1
        def actual = NodeDepths.nodeDepths tree
        assert expected == actual
    }

    @Test
    void nodeDepthsTest3() {
        def tree = new BinaryTree(1).insert(Arrays.asList(2, 3))
        def expected = 2
        def actual = NodeDepths.nodeDepths tree
        assert expected == actual
    }

    @Test
    void nodeDepthsTest4() {
        def tree = new BinaryTree(1).insert(Arrays.asList(2, 3, 4))
        def expected = 4
        def actual = NodeDepths.nodeDepths tree
        assert expected == actual
    }

    @Test
    void nodeDepthsTest5() {
        def tree = new BinaryTree(1).insert(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9))
        def expected = 16
        def actual = NodeDepths.nodeDepths tree
        assert expected == actual
    }

    ///////////////////////////
    // TEST UNBALANCED TREES //
    ///////////////////////////

    @Test
    void nodeDepthsTest6() {
        def tree = new BinaryTree(1)
        tree.left = new BinaryTree(2)
        tree.left.left = new BinaryTree(3)
        tree.left.left.left = new BinaryTree(4)
        tree.left.left.left.left = new BinaryTree(5)
        tree.left.left.left.left.left = new BinaryTree(6)
        tree.left.left.left.left.left.right = new BinaryTree(7)
        def expected = 21
        def actual = NodeDepths.nodeDepths tree
        assert expected == actual
    }

    @Test
    void nodeDepthsTest7() {
        def tree = new BinaryTree(1).insert(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9))
        tree.right.left.left = new BinaryTree(10)
        tree.right.left.left.right = new BinaryTree(11)
        tree.right.left.left.right.left = new BinaryTree(12)
        tree.right.left.left.right.right = new BinaryTree(13)
        tree.right.left.left.right.left.left = new BinaryTree(14)
        tree.right.left.left.right.right.left = new BinaryTree(15)
        tree.right.left.left.right.right.right = new BinaryTree(16)
        def expected = 51
        def actual = NodeDepths.nodeDepths tree
        assert expected == actual
    }

    @Test
    void nodeDepthsTest8() {
        def tree = new BinaryTree(1).insert(List.of(2))
        tree.left.left = new BinaryTree(3)
        tree.left.left.left = new BinaryTree(4)
        tree.left.left.left.left = new BinaryTree(5)
        tree.left.left.left.left.left = new BinaryTree(6)
        tree.left.left.left.left.left.left = new BinaryTree(7)
        tree.left.left.left.left.left.left.left = new BinaryTree(8)
        tree.left.left.left.left.left.left.left.left = new BinaryTree(9)
        def expected = 36
        def actual = NodeDepths.nodeDepths tree
        assert expected == actual
    }

    @Test
    void nodeDepthsTest9() {
        def tree = new BinaryTree(1).insert(Arrays.asList(2, 8, 3))
        tree.left.left.left = new BinaryTree(4)
        tree.left.left.left.left = new BinaryTree(5)
        tree.left.left.left.left.left = new BinaryTree(6)
        tree.left.left.left.left.left.right = new BinaryTree(7)
        tree.right.right = new BinaryTree(9)
        tree.right.right.right = new BinaryTree(10)
        tree.right.right.right.right = new BinaryTree(11)
        tree.right.right.right.right.right = new BinaryTree(12)
        tree.right.right.right.right.right.left = new BinaryTree(13)
        def expected = 42
        def actual = NodeDepths.nodeDepths tree
        assert expected == actual
    }
}
