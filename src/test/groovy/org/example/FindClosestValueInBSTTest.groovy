package org.example

import org.junit.jupiter.api.Test

class FindClosestValueInBSTTest {

    def TEST_BST = new BST(100).addMany([502, 55000, 1001, 4500, 204, 205, 207, 208, 206, 203,
                                         5, 15, 22, 57, 60, 5, 2, 3, 1, 1, 1, 1, 1, -51, -403])

    @Test
    void findClosestValueInBst1() {
        def expected = 4500
        def actual = FindClosestValueInBST.findClosestValueInBST TEST_BST, 29749
        assert expected == actual
    }

    @Test
    void findClosestValueInBst2() {
        def expected = 100
        def actual = FindClosestValueInBST.findClosestValueInBST TEST_BST, 100
        assert expected == actual
    }

    @Test
    void findClosestValueInBst3() {
        def expected = 208
        def actual = FindClosestValueInBST.findClosestValueInBST TEST_BST, 208
        assert expected == actual
    }

    @Test
    void findClosestValueInBst4() {
        def expected = 4500
        def actual = FindClosestValueInBST.findClosestValueInBST TEST_BST, 4500
        assert expected == actual
    }

    @Test
    void findClosestValueInBst5() {
        def expected = 4500
        def actual = FindClosestValueInBST.findClosestValueInBST TEST_BST, 4501
        assert expected == actual
    }

    @Test
    void findClosestValueInBst6() {
        def expected = -51
        def actual = FindClosestValueInBST.findClosestValueInBST TEST_BST, -70
        assert expected == actual
    }

    @Test
    void findClosestValueInBst7() {
        def expected = 1001
        def actual = FindClosestValueInBST.findClosestValueInBST TEST_BST, 2000
        assert expected == actual
    }

    @Test
    void findClosestValueInBst8() {
        def expected = 5
        def actual = FindClosestValueInBST.findClosestValueInBST TEST_BST, 6
        assert expected == actual
    }

    @Test
    void findClosestValueInBst9() {
        def expected = 55000
        def actual = FindClosestValueInBST.findClosestValueInBST TEST_BST, 30000
        assert expected == actual
    }

    @Test
    void findClosestValueInBst10() {
        def expected = 1
        def actual = FindClosestValueInBST.findClosestValueInBST TEST_BST, -1
        assert expected == actual
    }

    @Test
    void findClosestValueInBst11() {
        def expected = 55000
        def actual = FindClosestValueInBST.findClosestValueInBST TEST_BST, 29751
        assert expected == actual
    }

    //////////////////////////
    // TEST A DIFFERENT BST //
    //////////////////////////

    @Test
    void findClosestValueInBst12() {
        def bst = new BST(10).addMany([15, 22, 13, 14, 5, 5, 2, 1])
        def expected = 13
        def actual = FindClosestValueInBST.findClosestValueInBST bst, 12
        assert expected == actual
    }
}
