package org.example

import org.junit.jupiter.api.Test

class BranchSumsTest {

    /////////////////////////
    // TEST BALANCED TREES //
    /////////////////////////

    @Test
    void branchSumsTest1() {
        def tree = new BinaryTree(1)
        def expected = List.of(1)
        def actual = BranchSums.branchSums tree
        assert expected == actual
    }

    @Test
    void branchSumsTest2() {
        def tree = new BinaryTree(1).insert(Arrays.asList(2))
        def expected = List.of(3)
        def actual = BranchSums.branchSums tree
        assert expected == actual
    }

    @Test
    void branchSumsTest3() {
        def tree = new BinaryTree(1).insert(Arrays.asList(2, 3))
        def expected = Arrays.asList(3, 4)
        def actual = BranchSums.branchSums tree
        assert expected == actual
    }

    @Test
    void branchSumsTest4() {
        def tree = new BinaryTree(1).insert(Arrays.asList(2, 3, 4, 5))
        def expected = Arrays.asList(7, 8, 4)
        def actual = BranchSums.branchSums tree
        assert expected == actual
    }

    @Test
    void branchSumsTest5() {
        def tree = new BinaryTree(1).insert(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10))
        def expected = Arrays.asList(15, 16, 18, 10, 11)
        def actual = BranchSums.branchSums tree
        assert expected == actual
    }

    @Test
    void branchSumsTest6() {
        def tree = new BinaryTree(1).insert(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 1, 1))
        def expected = Arrays.asList(15, 16, 18, 9, 11, 11, 11)
        def actual = BranchSums.branchSums tree
        assert expected == actual
    }

    ///////////////////////////
    // TEST UNBALANCED TREES //
    ///////////////////////////

    @Test
    void branchSumsTest7() {
        def tree = new BinaryTree(0)
        tree.left = new BinaryTree(1)
        tree.left.left = new BinaryTree(10)
        tree.left.left.left = new BinaryTree(100)
        def expected = List.of(111)
        def actual = BranchSums.branchSums tree
        assert expected == actual
    }

    @Test
    void branchSumsTest8() {
        def tree = new BinaryTree(0)
        tree.right = new BinaryTree(1)
        tree.right.right = new BinaryTree(10)
        tree.right.right.right = new BinaryTree(100)
        def expected = List.of(111)
        def actual = BranchSums.branchSums tree
        assert expected == actual
    }

    @Test
    void branchSumsTest9() {
        def tree = new BinaryTree(0)
        tree.left = new BinaryTree(9)
        tree.right = new BinaryTree(1)
        tree.right.left = new BinaryTree(15)
        tree.right.right = new BinaryTree(10)
        tree.right.right.left = new BinaryTree(100)
        tree.right.right.right = new BinaryTree(200)
        def expected = Arrays.asList(9, 16, 111, 211)
        def actual = BranchSums.branchSums tree
        assert expected == actual
    }
}
