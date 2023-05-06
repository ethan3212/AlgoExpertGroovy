package org.example

class ValidateSubsequence {

    // O(N) time | O(1) space
    static def isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        def ptr = 0
        for (num in array) {
            if (ptr == sequence.size()) break
            if (sequence.get(ptr) == num) ptr++
        }
        ptr == sequence.size()
    }
}
