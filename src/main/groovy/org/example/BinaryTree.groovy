package org.example

class BinaryTree {
    int value
    BinaryTree left = null
    BinaryTree right = null

    BinaryTree(int value) { this.value = value }

    BinaryTree insert(List<Integer> values) { return insert(values, 0) }

    BinaryTree insert(List<Integer> values, int i) {
        if (i >= values.size()) return null
        def queue = new ArrayDeque<BinaryTree>()
        queue.add(this)
        while (!queue.isEmpty()) {
            def current = queue.poll()
            if (current.left == null) {
                current.left = new BinaryTree(values.get(i))
                break
            }
            queue.add((BinaryTree) current.left)
            if (current.right == null) {
                current.right = new BinaryTree(values.get(i))
                break
            }
            queue.add((BinaryTree) current.right)
        }
        insert(values, i + 1)
        this
    }
}
