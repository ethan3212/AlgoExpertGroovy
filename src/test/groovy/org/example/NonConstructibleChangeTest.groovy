package org.example

import org.junit.jupiter.api.Test

class NonConstructibleChangeTest {

    @Test
    void nonConstructibleChangeTest1() {
        def coins = []
        def expected = 1
        def actual = NonConstructibleChange.nonConstructibleChange coins
        assert expected == actual
    }

    @Test
    void nonConstructibleChangeTest2() {
        def coins = [2]
        def expected = 1
        def actual = NonConstructibleChange.nonConstructibleChange coins
        assert expected == actual
    }

    @Test
    void nonConstructibleChangeTest3() {
        def coins = [1]
        def expected = 2
        def actual = NonConstructibleChange.nonConstructibleChange coins
        assert expected == actual
    }

    @Test
    void nonConstructibleChangeTest4() {
        def coins = [87]
        def expected = 1
        def actual = NonConstructibleChange.nonConstructibleChange coins
        assert expected == actual
    }

    @Test
    void nonConstructibleChangeTest5() {
        def coins = [1, 1]
        def expected = 3
        def actual = NonConstructibleChange.nonConstructibleChange coins
        assert expected == actual
    }

    @Test
    void nonConstructibleChangeTest6() {
        def coins = [1, 1, 1, 1, 1]
        def expected = 6
        def actual = NonConstructibleChange.nonConstructibleChange coins
        assert expected == actual
    }

    @Test
    void nonConstructibleChangeTest7() {
        def coins = [1, 2, 3, 4, 5, 6, 7]
        def expected = 29
        def actual = NonConstructibleChange.nonConstructibleChange coins
        assert expected == actual
    }

    @Test
    void nonConstructibleChangeTest8() {
        def coins = [6, 4, 5, 1, 1, 8, 9]
        def expected = 3
        def actual = NonConstructibleChange.nonConstructibleChange coins
        assert expected == actual
    }

    @Test
    void nonConstructibleChangeTest9() {
        def coins = [5, 7, 1, 1, 2, 3, 22]
        def expected = 20
        def actual = NonConstructibleChange.nonConstructibleChange coins
        assert expected == actual
    }

    @Test
    void nonConstructibleChangeTest10() {
        def coins = [5, 6, 1, 1, 2, 3, 43]
        def expected = 19
        def actual = NonConstructibleChange.nonConstructibleChange coins
        assert expected == actual
    }

    @Test
    void nonConstructibleChangeTest11() {
        def coins = [5, 6, 1, 1, 2, 3, 4, 9]
        def expected = 32
        def actual = NonConstructibleChange.nonConstructibleChange coins
        assert expected == actual
    }

    @Test
    void nonConstructibleChangeTest12() {
        def coins = [1, 5, 1, 1, 1, 10, 15, 20, 100]
        def expected = 55
        def actual = NonConstructibleChange.nonConstructibleChange coins
        assert expected == actual
    }

    @Test
    void nonConstructibleChangeTest13() {
        def coins = [109, 2000, 8765, 19, 18, 17, 16, 8, 1, 1, 2, 4]
        def expected = 87
        def actual = NonConstructibleChange.nonConstructibleChange coins
        assert expected == actual
    }
}
