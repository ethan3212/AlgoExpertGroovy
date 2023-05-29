package org.example

import org.junit.jupiter.api.Test

class DepthFirstSearchTest {

    @Test
    void DFSTest1() {
        def node = new DepthFirstSearch.Node("A")
        node.addChild("B").addChild("C")
        node.children.get(0).addChild("D")
        def expected = ["A", "B", "D", "C"]
        def actual = node.depthFirstSearch([])
        assert expected == actual
    }

    @Test
    void DFSTest2() {
        def node = new DepthFirstSearch.Node("A")
        node.addChild("B").addChild("C").addChild("D").addChild("E")
        node.children.get(1).addChild("F")
        def expected = ["A", "B", "C", "F", "D", "E"]
        def actual = node.depthFirstSearch([])
        assert expected == actual
    }

    @Test
    void DFSTest3() {
        def node = new DepthFirstSearch.Node("A")
        node.addChild("B")
        node.children.get(0).addChild("C")
        node.children.get(0).children.get(0).addChild("D").addChild("E")
        node.children.get(0).children.get(0).children.get(0).addChild("F")
        def expected = ["A", "B", "C", "D", "F", "E"]
        def actual = node.depthFirstSearch([])
        assert expected == actual
    }

    @Test
    void DFSTest4() {
        def node = new DepthFirstSearch.Node("A")
        node.addChild("B").addChild("C").addChild("D")
        node.children.get(0).addChild("E").addChild("F")
        node.children.get(2).addChild("G").addChild("H")
        node.children.get(0).children.get(1).addChild("I").addChild("J")
        node.children.get(2).children.get(0).addChild("K")
        def expected = ["A", "B", "E", "F", "I", "J", "C", "D", "G", "K", "H"]
        def actual = node.depthFirstSearch([])
        assert expected == actual
    }

    @Test
    void DFSTest5() {
        def node = new DepthFirstSearch.Node("A")
        node.addChild("B").addChild("C").addChild("D").addChild("E").addChild("F")
        node.children.get(0).addChild("G").addChild("H").addChild("I")
        node.children.get(1).addChild("J")
        node.children.get(2).addChild("K").addChild("L")
        node.children.get(4).addChild("M").addChild("N")
        node.children.get(0).children.get(1).addChild("O").addChild("P").addChild("Q").addChild("R")
        node.children.get(2).children.get(0).addChild("S")
        node.children.get(0).children.get(1).children.get(1).addChild("T").addChild("U")
        node.children.get(0).children.get(1).children.get(3).addChild("V")
        node.children.get(0).children.get(1).children.get(3).children.get(0).addChild("W").addChild("X").addChild("Y")
        node.children.get(0).children.get(1).children.get(3).children.get(0).children.get(1).addChild("Z")
        def expected = ["A", "B", "G", "H", "O", "P", "T", "U", "Q", "R", "V", "W", "X", "Z", "Y", "I", "C", "J", "D", "K", "S", "L", "E", "F", "M", "N"]
        def actual = node.depthFirstSearch([])
        assert expected == actual
    }
}
