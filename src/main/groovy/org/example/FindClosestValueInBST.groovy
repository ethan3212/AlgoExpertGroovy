package org.example

class FindClosestValueInBST {

    // O(Log(N)) time | O(1) space
    static def findClosestValueInBST(BST tree, int target) {
        def closestSoFar = tree.value
        def current = tree
        while (current != null) {
            if (Math.abs(target - current.value) < Math.abs(target - closestSoFar)) closestSoFar = current.value
            if (current.value > target) current = current.left
            else if (current.value < target) current = current.right
            else break
        }
        closestSoFar
    }
}
