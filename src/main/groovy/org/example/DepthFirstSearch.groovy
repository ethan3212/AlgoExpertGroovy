package org.example

class DepthFirstSearch {

    static class Node {
        String name
        List<Node> children = new ArrayList<>()

        Node(String name) {
            this.name = name
        }

        Node addChild(String name) {
            Node child = new Node(name)
            children.add(child)
            return this
        }

        // O(V + E) time | O(V) space
        List<String> depthFirstSearch(List<String> array) {
            array.add(this.name)
            for (child in children) {
                child.depthFirstSearch(array)
            }
            return array
        }
    }
}
