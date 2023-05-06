package org.example

class SortedSquaredArray {

    // O(N) time | O(N) space
    static def sortedSquaredArray(List<Integer> array) {
        def sortedAndSquared = [0] * array.size()
        def leftIdx = 0, rightIdx = array.size() - 1
        for (def idx = array.size() - 1; idx >= 0; idx--) {
            if (Math.abs(array.get(leftIdx)) > Math.abs(array.get(rightIdx))) {
                sortedAndSquared[idx] = (int) Math.pow(array.get(leftIdx), 2)
                leftIdx++
            } else {
                sortedAndSquared[idx] = (int) Math.pow(array.get(rightIdx), 2)
                rightIdx--
            }
        }
        sortedAndSquared
    }
}
