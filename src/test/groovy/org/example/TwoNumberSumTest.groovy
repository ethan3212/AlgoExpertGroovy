package org.example

import org.junit.jupiter.api.Test

class TwoNumberSumTest {

    ///////////////////////
    // TARGET-SUM EXISTS //
    ///////////////////////

    @Test
    void twoNumberSumTest1() {
        def input = [4, 6]
        def targetSum = 10
        def expected = [4, 6]
        def actual = TwoNumberSum.twoNumberSum input, targetSum
        assert expected == actual
    }

    @Test
    void twoNumberSumTest2() {
        def input = [4, 6, 1]
        def targetSum = 5
        def expected = [1, 4]
        def actual = TwoNumberSum.twoNumberSum input, targetSum
        assert expected == actual
    }

    @Test
    void twoNumberSumTest3() {
        def input = [4, 6, 1, -3]
        def targetSum = 3
        def expected = [-3, 6]
        def actual = TwoNumberSum.twoNumberSum input, targetSum
        assert expected == actual
    }


    @Test
    void twoNumberSumTest4() {
        def input = [1, 2, 3, 4, 5, 6, 7, 8, 9]
        def targetSum = 17
        def expected = [8, 9]
        def actual = TwoNumberSum.twoNumberSum input, targetSum
        assert expected == actual
    }

    @Test
    void twoNumberSumTest5() {
        def input = [3, 5, -4, 8, 11, 1, -1, 6]
        def targetSum = 10
        def expected = [-1, 11]
        def actual = TwoNumberSum.twoNumberSum input, targetSum
        assert expected == actual
    }

    @Test
    void twoNumberSumTest6() {
        def input = [1, 2, 3, 4, 5, 6, 7, 8, 9, 15]
        def targetSum = 18
        def expected = [3, 15]
        def actual = TwoNumberSum.twoNumberSum input, targetSum
        assert expected == actual
    }

    @Test
    void twoNumberSumTest7() {
        def input = [-7, -5, -3, -1, 0, 1, 3, 5, 7]
        def targetSum = -5
        def expected = [-5, 0]
        def actual = TwoNumberSum.twoNumberSum input, targetSum
        assert expected == actual
    }


    @Test
    void twoNumberSumTest8() {
        def input = [-21, 301, 12, 4, 65, 56, 210, 356, 9, -47]
        def targetSum = 163
        def expected = [-47, 210]
        def actual = TwoNumberSum.twoNumberSum input, targetSum
        assert expected == actual
    }

    ///////////////////////////////
    // TARGET-SUM DOES NOT EXIST //
    ///////////////////////////////

    @Test
    void twoNumberSumTest9() {
        def input = [14]
        def targetSum = 15
        def expected = []
        def actual = TwoNumberSum.twoNumberSum input, targetSum
        assert expected == actual
    }

    @Test
    void twoNumberSumTest10() {
        def input = [15]
        def targetSum = 15
        def expected = []
        def actual = TwoNumberSum.twoNumberSum input, targetSum
        assert expected == actual
    }

    @Test
    void twoNumberSumTest11() {
        def input = [3, 5, -4, 8, 11, 1, -1, 6]
        def targetSum = 15
        def expected = []
        def actual = TwoNumberSum.twoNumberSum input, targetSum
        assert expected == actual
    }

    @Test
    void twoNumberSumTest12() {
        def input = [-21, 301, 12, 4, 65, 56, 210, 356, 9, -47]
        def targetSum = 164
        def expected = []
        def actual = TwoNumberSum.twoNumberSum input, targetSum
        assert expected == actual
    }
}
