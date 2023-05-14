package org.example

class BranchSums {

    // O(N) time | O(N) space
    static def branchSums(BinaryTree root) {
        def sums = new ArrayList<Integer>()
        helper(root, sums, 0)
        sums
    }

    private static void helper(BinaryTree node, List<Integer> sums, int sum) {
        if (node == null) return
        sum += node.value
        if (node.left == null && node.right == null) sums.add(sum)
        helper(node.left, sums, sum)
        helper(node.right, sums, sum)
    }
}
