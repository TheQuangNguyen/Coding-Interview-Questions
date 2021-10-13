package AlgoExpert.Arrays.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {

    // Time - O(N) where N is the number of competitions
    // Space - O(M) where M is the number of teams
    // MY SOLUTION
    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Write your code here.
        Map<String, Integer> tally = new HashMap<>();

        for (int i = 0; i < results.size(); i++) {
            String wonTeam = "";
            if (results.get(i) == 0) {	// Away Team Won
                wonTeam = competitions.get(i).get(1);
            } else {	// Home Team Won
                wonTeam = competitions.get(i).get(0);
            }
            if (tally.containsKey(wonTeam)) {
                tally.put(wonTeam, tally.get(wonTeam) + 1);
            } else {
                tally.put(wonTeam, 1);
            }
        }

        String winner = "";
        int winnerScore = 0;

        for (Map.Entry entry : tally.entrySet()) {
            String team = (String) entry.getKey();
            int score = (int) entry.getValue();

            if (score > winnerScore) {
                winner = team;
                winnerScore = score;
            }
        }
        return winner;
    }


    // ALGOEXPERT SOLUTION
    public int HOME_TEAM_WON = 1;

    public String tournamentWinner2(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        String currentBestTeam = "";
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        scores.put(currentBestTeam, 0);

        for (int idx = 0; idx < competitions.size(); idx++) {
            ArrayList<String> competition = competitions.get(idx);
            int result = results.get(idx);

            String homeTeam = competition.get(0);
            String awayTeam = competition.get(1);

            String winningTeam = (result == HOME_TEAM_WON) ? homeTeam : awayTeam;

            updateScores(winningTeam, 3, scores);

            if (scores.get(winningTeam) > scores.get(currentBestTeam)) {
                currentBestTeam = winningTeam;
            }
        }

        return currentBestTeam;
    }

    public void updateScores(String team, int points, HashMap<String, Integer> scores) {
        if (!scores.containsKey(team)) {
            scores.put(team, 0);
        }

        scores.put(team, scores.get(team) + points);
    }
}
