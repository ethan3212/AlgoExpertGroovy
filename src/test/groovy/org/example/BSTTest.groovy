package org.example

import org.junit.jupiter.api.Test

class BSTTest {

    @Test
    void BSTTest1() {
        def bst = new BST(0).addMany([1])
        assert 1 == bst.right.value
    }

    @Test
    void BSTTest2() {
        def bst = new BST(5).addMany([10, 1])
        assert 10 == bst.right.value
        assert 1 == bst.left.value
    }

    @Test
    void BSTTest3() {
        def bst = new BST(0).addMany([1, 10])
        assert 1 == bst.right.value
        assert 10 == bst.right.right.value
    }

    @Test
    void BSTTest4() {
        def bst = new BST(10).addMany([5, 1])
        assert 5 == bst.left.value
        assert 1 == bst.left.left.value
    }

    @Test
    void BSTTest5() {
        def bst = new BST(5).addMany([1, 10, 3, 7])
        assert 1 == bst.left.value
        assert 10 == bst.right.value
        assert 3 == bst.left.right.value
        assert 7 == bst.right.left.value
    }

    @Test
    void BSTTest6() {
        def bst = new BST(5).addMany([3, 1, 2, 4, 7, 9, 6, 8, 10])
        assert bst.contains(1)
    }

    @Test
    void BSTTest7() {
        def bst = new BST(5).addMany([3, 1, 2, 4, 7, 9, 6, 8, 10])
        assert bst.contains(2)
    }

    @Test
    void BSTTest8() {
        def bst = new BST(5).addMany([3, 1, 2, 4, 7, 9, 6, 8, 10])
        assert bst.contains(3)
    }

    @Test
    void BSTTest9() {
        def bst = new BST(5).addMany([3, 1, 2, 4, 7, 9, 6, 8, 10])
        assert bst.contains(4)
    }

    @Test
    void BSTTest10() {
        def bst = new BST(5).addMany([3, 1, 2, 4, 7, 9, 6, 8, 10])
        assert bst.contains(5)
    }

    @Test
    void BSTTest11() {
        def bst = new BST(5).addMany([3, 1, 2, 4, 7, 9, 6, 8, 10])
        assert bst.contains(6)
    }

    @Test
    void BSTTest12() {
        def bst = new BST(5).addMany([3, 1, 2, 4, 7, 9, 6, 8, 10])
        assert bst.contains(7)
    }

    @Test
    void BSTTest13() {
        def bst = new BST(5).addMany([3, 1, 2, 4, 7, 9, 6, 8, 10])
        assert bst.contains(8)
    }

    @Test
    void BSTTest14() {
        def bst = new BST(5).addMany([3, 1, 2, 4, 7, 9, 6, 8, 10])
        assert bst.contains(9)
    }

    @Test
    void BSTTest15() {
        def bst = new BST(5).addMany([3, 1, 2, 4, 7, 9, 6, 8, 10])
        assert bst.contains(10)
    }

    @Test
    void BSTTest16() {
        def bst = new BST(5).addMany([3, 1, 2, 4, 7, 9, 6, 8, 10])
        assert !bst.contains(11)
    }

    @Test
    void BSTTest17() {
        def bst = new BST(5).addMany([3, 1, 2, 4, 7, 9, 6, 8, 10])
        assert !bst.contains(-1)
    }

    @Test
    void BSTTest18() {
        def bst = new BST(5).addMany([3, 1, 2, 4, 7, 9, 6, 8, 10])
        assert !bst.contains(0)
    }

    @Test
    void BSTTest19() {
        def bst = new BST(5).addMany([3, 1, 2, 4, 7, 9, 6, 8, 10])
        assert bst.contains(1)
        bst.remove 1
        assert !bst.contains(1)
    }

    @Test
    void BSTTest20() {
        def bst = new BST(5).addMany([3, 1, 2, 4, 7, 9, 6, 8, 10])
        assert bst.contains(10)
        bst.remove 10
        assert !bst.contains(10)
    }

    @Test
    void BSTTest21() {
        def bst = new BST(5).addMany([3, 1, 2, 4, 7, 9, 6, 8, 10])
        assert bst.contains(1)
        assert bst.contains(2)
        assert bst.contains(3)
        bst.remove 1
        bst.remove 2
        bst.remove 3
        assert !bst.contains(1)
        assert !bst.contains(2)
        assert !bst.contains(3)
    }

    @Test
    void BSTTest22() {
        def bst = new BST(5).addMany([3, 1, 2, 4, 7, 9, 6, 8, 10])
        assert bst.contains(5)
        bst.remove(5)
        assert !bst.contains(5)
    }

    @Test
    void BSTTest23() {
        def bst = new BST(5).addMany([3, 1, 2, 4, 7, 9, 6, 8, 10])
        assert !bst.contains(11)
        bst.remove 11
        assert !bst.contains(11)
    }

    @Test
    void BSTTest24() {
        def bst = new BST(3).addMany([1, 2, 5, 4])
        assert bst.contains(3)
        bst.remove 3
        assert !bst.contains(3)
    }

    @Test
    void BSTTest25() {
        def bst = new BST(3).addMany([1])
        assert bst.contains(3)
        bst.remove 3
        assert !bst.contains(3)
    }

    @Test
    void BSTTest26() {
        def bst = new BST(3).addMany([5])
        assert bst.contains(3)
        bst.remove 3
        assert !bst.contains(3)
    }
}
