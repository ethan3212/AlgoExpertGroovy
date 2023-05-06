package org.example

import org.junit.jupiter.api.Test

class TournamentWinnerTest {

    @Test
    void tournamentWinnerTest1() {
        def competitions = []
        competitions.add(["A", "B"])
        def results = [0]
        def expected = "B"
        def actual = TournamentWinner.tournamentWinner competitions, results
        assert expected == actual
    }

    @Test
    void tournamentWinnerTest2() {
        def competitions = []
        competitions.add(["Bulls", "Eagles"])
        def results = [1]
        def expected = "Bulls"
        def actual = TournamentWinner.tournamentWinner competitions, results
        assert expected == actual
    }

    @Test
    void tournamentWinnerTest3() {
        def competitions = []
        competitions.add(["Bulls", "Eagles"])
        competitions.add(["Bulls", "Bears"])
        competitions.add(["Bears", "Eagles"])
        def results = [0, 0, 0]
        def expected = "Eagles"
        def actual = TournamentWinner.tournamentWinner competitions, results
        assert expected == actual
    }

    @Test
    void tournamentWinnerTest4() {
        def competitions = []
        competitions.add(["HTML", "C#"])
        competitions.add(["C#", "Python"])
        competitions.add(["Python", "HTML"])
        def results = [0, 0, 1]
        def expected = "Python"
        def actual = TournamentWinner.tournamentWinner competitions, results
        assert expected == actual
    }

    @Test
    void tournamentWinnerTest5() {
        def competitions = []
        competitions.add(["HTML", "Java"])
        competitions.add(["Java", "Python"])
        competitions.add(["Python", "HTML"])
        def results = [0, 1, 1]
        def expected = "Java"
        def actual = TournamentWinner.tournamentWinner competitions, results
        assert expected == actual
    }

    @Test
    void tournamentWinnerTest6() {
        def competitions = []
        competitions.add(["HTML", "Java"])
        competitions.add(["Java", "Python"])
        competitions.add(["Python", "HTML"])
        competitions.add(["C#", "Python"])
        competitions.add(["Java", "C#"])
        competitions.add(["C#", "HTML"])
        def results = [0, 1, 1, 1, 0, 1]
        def expected = "C#"
        def actual = TournamentWinner.tournamentWinner competitions, results
        assert expected == actual
    }

    @Test
    void tournamentWinnerTest7() {
        def competitions = []
        competitions.add(["Bulls", "Eagles"])
        competitions.add(["Bulls#", "Bears"])
        competitions.add(["Bulls", "Monkeys"])
        competitions.add(["Eagles", "Bears"])
        competitions.add(["Eagles", "Monkeys"])
        competitions.add(["Bears", "Monkeys"])
        def results = [1, 1, 1, 1, 1, 1]
        def expected = "Bulls"
        def actual = TournamentWinner.tournamentWinner competitions, results
        assert expected == actual
    }

    @Test
    void tournamentWinnerTest8() {
        def competitions = []
        competitions.add(["HTML", "Java"])
        competitions.add(["Java", "Python"])
        competitions.add(["Python", "HTML"])
        competitions.add(["C#", "Python"])
        competitions.add(["Java", "C#"])
        competitions.add(["C#", "HTML"])
        competitions.add(["SQL", "C#"])
        competitions.add(["HTML", "SQL"])
        competitions.add(["SQL", "Python"])
        competitions.add(["SQL", "Java"])
        def results = [0, 1, 1, 1, 0, 1, 0, 1, 1, 0]
        def expected = "C#"
        def actual = TournamentWinner.tournamentWinner competitions, results
        assert expected == actual
    }

    @Test
    void tournamentWinnerTest9() {
        def competitions = []
        competitions.add(["HTML", "Java"])
        competitions.add(["Java", "Python"])
        competitions.add(["Python", "HTML"])
        competitions.add(["C#", "Python"])
        competitions.add(["Java", "C#"])
        competitions.add(["C#", "HTML"])
        competitions.add(["SQL", "C#"])
        competitions.add(["HTML", "SQL"])
        competitions.add(["SQL", "Python"])
        competitions.add(["SQL", "Java"])
        def results = [0, 0, 0, 0, 0, 0, 1, 0, 1, 1]
        def expected = "SQL"
        def actual = TournamentWinner.tournamentWinner competitions, results
        assert expected == actual
    }

    @Test
    void tournamentWinnerTest10() {
        def competitions = []
        competitions.add(["AlgoMasters", "FrontPage Free birds"])
        competitions.add(["Runtime Terror", "Static Startup"])
        competitions.add(["WeC#", "Hypertext Assassins"])
        competitions.add(["AlgoMasters", "WeC#"])
        competitions.add(["Static Startup", "Hypertext Assassins"])
        competitions.add(["Runtime Terror", "FrontPage Free birds"])
        competitions.add(["AlgoMasters", "Runtime Terror"])
        competitions.add(["Hypertext Assassins", "FrontPage Free birds"])
        competitions.add(["Static Startup", "WeC#"])
        competitions.add(["AlgoMasters", "Static Startup"])
        competitions.add(["FrontPage Free birds", "WeC#"])
        competitions.add(["Hypertext Assassins", "Runtime Terror"])
        competitions.add(["AlgoMasters", "Hypertext Assassins"])
        competitions.add(["WeC#", "Runtime Terror"])
        competitions.add(["FrontPage Free birds", "Static Startup"])
        def results = [1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0]
        def expected = "AlgoMasters"
        def actual = TournamentWinner.tournamentWinner competitions, results
        assert expected == actual
    }
}
