package org.example

class TwoNumberSum {

    // O(NLog(N)) time | O(1) space
    static def twoNumberSum(List<Integer> array, int targetSum) {
        Collections.sort(array)
        def leftIdx = 0, rightIdx = array.size() - 1
        while (leftIdx < rightIdx) {
            def currentSum = array[leftIdx] + array[rightIdx]
            if (currentSum < targetSum) leftIdx++
            else if (currentSum > targetSum) rightIdx--
            else return [array[leftIdx], array[rightIdx]]
        }
        []
    }
}
