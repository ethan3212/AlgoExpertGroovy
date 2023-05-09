package org.example

class NonConstructibleChange {

    // O(NLog(N)) time | O(1) space
    static def nonConstructibleChange(List<Integer> coins) {
        coins.sort()
        def changeWeCanMake = 0
        for (coin in coins) {
            if (coin > changeWeCanMake + 1) {
                break
            } else {
                changeWeCanMake += coin
            }
        }
        changeWeCanMake + 1
    }
}
