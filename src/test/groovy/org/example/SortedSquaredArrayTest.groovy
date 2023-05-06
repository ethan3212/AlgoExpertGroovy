package org.example

import org.junit.jupiter.api.Test

class SortedSquaredArrayTest {

    @Test
    void sortedSquaredArrayTest1() {
        def input = [0]
        def expected = [0]
        def actual = SortedSquaredArray.sortedSquaredArray(input)
        assert expected == actual
    }

    @Test
    void sortedSquaredArrayTest2() {
        def input = [1]
        def expected = [1]
        def actual = SortedSquaredArray.sortedSquaredArray(input)
        assert expected == actual
    }

    @Test
    void sortedSquaredArrayTest3() {
        def input = [-1]
        def expected = [1]
        def actual = SortedSquaredArray.sortedSquaredArray(input)
        assert expected == actual
    }

    @Test
    void sortedSquaredArrayTest4() {
        def input = [10]
        def expected = [100]
        def actual = SortedSquaredArray.sortedSquaredArray(input)
        assert expected == actual
    }

    @Test
    void sortedSquaredArrayTest5() {
        def input = [-10]
        def expected = [100]
        def actual = SortedSquaredArray.sortedSquaredArray(input)
        assert expected == actual
    }

    @Test
    void sortedSquaredArrayTest6() {
        def input = [1, 2]
        def expected = [1, 4]
        def actual = SortedSquaredArray.sortedSquaredArray(input)
        assert expected == actual
    }

    @Test
    void sortedSquaredArrayTest7() {
        def input = [-2, -1]
        def expected = [1, 4]
        def actual = SortedSquaredArray.sortedSquaredArray(input)
        assert expected == actual
    }

    @Test
    void sortedSquaredArrayTest8() {
        def input = [-3, -2, -1]
        def expected = [1, 4, 9]
        def actual = SortedSquaredArray.sortedSquaredArray(input)
        assert expected == actual
    }

    @Test
    void sortedSquaredArrayTest9() {
        def input = [1, 2, 3, 4, 5]
        def expected = [1, 4, 9, 16, 25]
        def actual = SortedSquaredArray.sortedSquaredArray(input)
        assert expected == actual
    }

    @Test
    void sortedSquaredArrayTest10() {
        def input = [-10, -5, 0, 5, 10]
        def expected = [0, 25, 25, 100, 100]
        def actual = SortedSquaredArray.sortedSquaredArray(input)
        assert expected == actual
    }

    @Test
    void sortedSquaredArrayTest11() {
        def input = [-5, -4, -3, -2, -1]
        def expected = [1, 4, 9, 16, 25]
        def actual = SortedSquaredArray.sortedSquaredArray(input)
        assert expected == actual
    }

    @Test
    void sortedSquaredArrayTest12() {
        def input = [1, 2, 3, 5, 6, 8, 9]
        def expected = [1, 4, 9, 25, 36, 64, 81]
        def actual = SortedSquaredArray.sortedSquaredArray(input)
        assert expected == actual
    }

    @Test
    void sortedSquaredArrayTest13() {
        def input = [-7, -3, 1, 9, 22, 30]
        def expected = [1, 9, 49, 81, 484, 900]
        def actual = SortedSquaredArray.sortedSquaredArray(input)
        assert expected == actual
    }

    @Test
    void sortedSquaredArrayTest14() {
        def input = [-1, -1, 2, 3, 3, 3, 4]
        def expected = [1, 1, 4, 9, 9, 9, 16]
        def actual = SortedSquaredArray.sortedSquaredArray(input)
        assert expected == actual
    }

    @Test
    void sortedSquaredArrayTest15() {
        def input = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        def expected = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        def actual = SortedSquaredArray.sortedSquaredArray(input)
        assert expected == actual
    }

    @Test
    void sortedSquaredArrayTest16() {
        def input = [-50, -13, -2, -1, 0, 0, 1, 1, 2, 3, 19, 20]
        def expected = [0, 0, 1, 1, 1, 4, 4, 9, 169, 361, 400, 2500]
        def actual = SortedSquaredArray.sortedSquaredArray(input)
        assert expected == actual
    }
}
