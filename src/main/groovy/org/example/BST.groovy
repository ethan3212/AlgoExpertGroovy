package org.example

class BST {
    int value
    BST left = null
    BST right = null

    BST(int value) { this.value = value }

    // O(Log(N)) time | O(1) space
    BST insert(int value) {
        def current = this
        while (current != null) {
            if (value < current.value) {
                if (current.left == null) {
                    current.left = new BST(value)
                    break
                } else current = current.left
            } else {
                if (current.right == null) {
                    current.right = new BST(value)
                    break
                } else current = current.right
            }
        }
        this
    }

    BST addMany(List<Integer> values) {
        for (value in values) this.insert(value)
        this
    }

    // O(Log(N)) time | O(1) space
    boolean contains(int value) {
        def current = this
        while (current != null) {
            if (value < current.value) current = current.left
            else if (value > current.value) current = current.right
            else return true
        }
        false
    }

    // O(Log(N)) time | O(1) space
    BST remove(int value) { remove value, null }

    BST remove(int value, BST parent) {
        def current = this
        while (current != null) {
            if (value < current.value) {
                parent = current
                current = current.left
            } else if (value > current.value) {
                parent = current
                current = current.right
            } else {
                if (current.left != null && current.right != null) {
                    current.value = current.right.getMinValue()
                    current.right.remove(current.value, current)
                } else if (parent == null) {
                    if (current.left != null) {
                        current.value = current.left.value
                        current.right = current.left.right
                        current.left = current.left.left
                    } else if (current.right != null) {
                        current.value = current.right.value
                        current.left = current.right.left
                        current.right = current.right.right
                    }
                } else if (parent.left == current) {
                    parent.left = current.left != null ? current.left : current.right
                } else if (parent.right == current) {
                    parent.right = current.left != null ? current.left : current.right
                }
                break
            }
        }
        this
    }

    int getMinValue() {
        if (left == null) return value
        else return left.getMinValue()
    }
}
