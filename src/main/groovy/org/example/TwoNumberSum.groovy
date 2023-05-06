package org.example

class TwoNumberSum {

    // O(NLog(N)) time | O(1) space
    static def twoNumberSum(List<Integer> array, int targetSum) {
        Collections.sort(array)
        int leftIdx = 0
        int rightIdx = array.size() - 1
        while (leftIdx < rightIdx) {
            int currentSum = array[leftIdx] + array[rightIdx]
            if (currentSum < targetSum) {
                leftIdx++
            } else if (currentSum > targetSum) {
                rightIdx--
            } else {
                return [array[leftIdx], array[rightIdx]]
            }
        }
        []
    }
}
