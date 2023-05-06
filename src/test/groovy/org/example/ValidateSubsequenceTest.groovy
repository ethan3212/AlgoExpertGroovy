package org.example

import org.junit.jupiter.api.Test

class ValidateSubsequenceTest {

    ///////////////////////////
    // TEST TRUE EVALUATIONS //
    ///////////////////////////

    @Test
    void isValidSubsequenceTest1() {
        def array = [5, 1, 22, 25, 6, -1, 8, 10]
        def sequence = [25]
        assert ValidateSubsequence.isValidSubsequence(array, sequence)
    }

    @Test
    void isValidSubsequenceTest2() {
        def array = [1, 1, 1, 1, 1]
        def sequence = [1, 1, 1]
        assert ValidateSubsequence.isValidSubsequence(array, sequence)
    }

    @Test
    void isValidSubsequenceTest3() {
        def array = [5, 1, 22, 25, 6, -1, 8, 10]
        def sequence = [1, 6, 10]
        assert ValidateSubsequence.isValidSubsequence(array, sequence)
    }

    @Test
    void isValidSubsequenceTest4() {
        def array = [5, 1, 22, 25, 6, -1, 8, 10]
        def sequence = [22, 25, 6]
        assert ValidateSubsequence.isValidSubsequence(array, sequence)
    }

    @Test
    void isValidSubsequenceTest5() {
        def array = [5, 1, 22, 25, 6, -1, 8, 10]
        def sequence = [1, 6, -1, 10]
        assert ValidateSubsequence.isValidSubsequence(array, sequence)
    }

    @Test
    void isValidSubsequenceTest6() {
        def array = [5, 1, 22, 25, 6, -1, 8, 10]
        def sequence = [5, 1, 22, 10]
        assert ValidateSubsequence.isValidSubsequence(array, sequence)
    }

    @Test
    void isValidSubsequenceTest7() {
        def array = [5, 1, 22, 25, 6, -1, 8, 10]
        def sequence = [5, -1, 8, 10]
        assert ValidateSubsequence.isValidSubsequence(array, sequence)
    }

    @Test
    void isValidSubsequenceTest8() {
        def array = [5, 1, 22, 25, 6, -1, 8, 10]
        def sequence = [5, 1, 22, 6, -1, 8, 10]
        assert ValidateSubsequence.isValidSubsequence(array, sequence)
    }

    @Test
    void isValidSubsequenceTest9() {
        def array = [5, 1, 22, 25, 6, -1, 8, 10]
        def sequence = [5, 1, 22, 25, 6, -1, 8, 10]
        assert ValidateSubsequence.isValidSubsequence(array, sequence)
    }

    ////////////////////////////
    // TEST FALSE EVALUATIONS //
    ////////////////////////////

    @Test
    void isValidSubsequenceTest10() {
        def array = [1, 1, 6, 1]
        def sequence = [1, 1, 1, 6]
        assert !ValidateSubsequence.isValidSubsequence(array, sequence)
    }

    @Test
    void isValidSubsequenceTest11() {
        def array = [5, 1, 22, 25, 6, -1, 8, 10]
        def sequence = [26]
        assert !ValidateSubsequence.isValidSubsequence(array, sequence)
    }

    @Test
    void isValidSubsequenceTest12() {
        def array = [5, 1, 22, 25, 6, -1, 8, 10]
        def sequence = [1, 6, -1, -1]
        assert !ValidateSubsequence.isValidSubsequence(array, sequence)
    }

    @Test
    void isValidSubsequenceTest13() {
        def array = [5, 1, 22, 25, 6, -1, 8, 10]
        def sequence = [1, 6, -1, -2]
        assert !ValidateSubsequence.isValidSubsequence(array, sequence)
    }

    @Test
    void isValidSubsequenceTest14() {
        def array = [5, 1, 22, 25, 6, -1, 8, 10]
        def sequence = [5, 26, 22, 8]
        assert !ValidateSubsequence.isValidSubsequence(array, sequence)
    }

    @Test
    void isValidSubsequenceTest15() {
        def array = [5, 1, 22, 25, 6, -1, 8, 10]
        def sequence = [1, 6, -1, 5]
        assert !ValidateSubsequence.isValidSubsequence(array, sequence)
    }

    @Test
    void isValidSubsequenceTest16() {
        def array = [5, 1, 22, 25, 6, -1, 8, 10]
        def sequence = [1, 6, -1, -1, 10]
        assert !ValidateSubsequence.isValidSubsequence(array, sequence)
    }

    @Test
    void isValidSubsequenceTest17() {
        def array = [5, 1, 22, 25, 6, -1, 8, 10]
        def sequence = [5, 1, 22, 22, 6, -1, 8, 10]
        assert !ValidateSubsequence.isValidSubsequence(array, sequence)
    }

    @Test
    void isValidSubsequenceTest18() {
        def array = [5, 1, 22, 25, 6, -1, 8, 10]
        def sequence = [5, 1, 25, 22, 6, -1, 8, 10]
        assert !ValidateSubsequence.isValidSubsequence(array, sequence)
    }

    @Test
    void isValidSubsequenceTest19() {
        def array = [5, 1, 22, 25, 6, -1, 8, 10]
        def sequence = [5, 1, 22, 23, 6, -1, 8, 10]
        assert !ValidateSubsequence.isValidSubsequence(array, sequence)
    }

    @Test
    void isValidSubsequenceTest20() {
        def array = [5, 1, 22, 25, 6, -1, 8, 10]
        def sequence = [1, 6, -1, 10, 11, 11, 11, 11]
        assert !ValidateSubsequence.isValidSubsequence(array, sequence)
    }

    @Test
    void isValidSubsequenceTest21() {
        def array = [5, 1, 22, 25, 6, -1, 8, 10]
        def sequence = [4, 5, 1, 22, 25, 6, -1, 8, 10]
        assert !ValidateSubsequence.isValidSubsequence(array, sequence)
    }

    @Test
    void isValidSubsequenceTest22() {
        def array = [5, 1, 22, 25, 6, -1, 8, 10]
        def sequence = [5, 1, 22, 25, 6, -1, 8, 10, 10]
        assert !ValidateSubsequence.isValidSubsequence(array, sequence)
    }

    @Test
    void isValidSubsequenceTest23() {
        def array = [5, 1, 22, 25, 6, -1, 8, 10]
        def sequence = [5, 1, 22, 25, 6, -1, 8, 10, 12]
        assert !ValidateSubsequence.isValidSubsequence(array, sequence)
    }

    @Test
    void isValidSubsequenceTest24() {
        def array = [5, 1, 22, 25, 6, -1, 8, 10]
        def sequence = [5, 1, 22, 22, 25, 6, -1, 8, 10]
        assert !ValidateSubsequence.isValidSubsequence(array, sequence)
    }
}
