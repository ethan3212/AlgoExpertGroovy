package org.example

class TournamentWinner {

    // O(N) time | O(N) space
    static def tournamentWinner(List<List<String>> competitions, List<Integer> results) {
        def scoreboard = new HashMap<String, Integer>()
        def leadingTeam = ""
        scoreboard.put(leadingTeam, 0)
        for (def i = 0; i < competitions.size(); i++) {
            def matchWinner = (results.get(i) == 1) ? competitions.get(i).get(0) : competitions.get(i).get(1)
            updateScoreboard scoreboard, matchWinner
            if (scoreboard.get(matchWinner) > scoreboard.get(leadingTeam)) leadingTeam = matchWinner
        }
        leadingTeam
    }

    private static def updateScoreboard(Map<String, Integer> scoreboard, String team) {
        if (!scoreboard.containsKey(team)) scoreboard.put(team, 0)
        scoreboard.put(team, scoreboard.get(team) + 1)
    }
}
