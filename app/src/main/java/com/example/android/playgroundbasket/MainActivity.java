package com.example.android.playgroundbasket;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

/**
 * @author Jakub
 * @date 18 02 25
 */
public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int stats2TeamA = 0;
    int stats3TeamA = 0;
    int stats1TeamA = 0;
    int scoreTeamB = 0;
    int stats3TeamB = 0;
    int stats2TeamB = 0;
    int stats1TeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the 2 button team A is clicked.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayResultA(scoreTeamA);
        stats2TeamA = stats2TeamA + 1;
        displayStatsTwoA(stats2TeamA);
    }

    /**
     * This method is called when the 3 button team A is clicked.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayResultA(scoreTeamA);
        stats3TeamA = stats3TeamA + 1;
        displayStatsThreeA(stats3TeamA);
    }

    /**
     * This method is called when the 1 button team A is clicked.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayResultA(scoreTeamA);
        stats1TeamA = stats1TeamA + 1;
        displayStatsOneA(stats1TeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    private void displayResultA(int score) {
        TextView teamAscoreTextView = (TextView) findViewById(
                R.id.TeamAscore);
        teamAscoreTextView.setText(String.valueOf(score));
    }

    /**
     * Displays the two points shots stats - Team A
     */
    private void displayStatsTwoA(int score) {
        TextView teamAscoreStatsView = (TextView) findViewById(
                R.id.teamAstatsTwo);
        teamAscoreStatsView.setText(String.valueOf(score));
    }

    /**
     * Displays the three points shots stats - Team A
     */
    private void displayStatsThreeA(int score) {
        TextView teamAscoreStatsView = (TextView) findViewById(
                R.id.teamAstatsThree);
        teamAscoreStatsView.setText(String.valueOf(score));
    }

    /**
     * Displays the one point shots stats - Team A
     */
    private void displayStatsOneA(int score) {
        TextView teamAscoreStatsView = (TextView) findViewById(
                R.id.teamAstatsOne);
        teamAscoreStatsView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the 2 button team B is clicked.
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayResultB(scoreTeamB);
        stats2TeamB = stats2TeamB + 1;
        displayStatsTwoB(stats2TeamB);
    }

    /**
     * This method is called when the 3 button team B is clicked.
     */
    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayResultB(scoreTeamB);
        stats3TeamB = stats3TeamB + 1;
        displayStatsThreeB(stats3TeamB);
    }

    /**
     * This method is called when the 1 button team B is clicked.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayResultB(scoreTeamB);
        stats1TeamB = stats1TeamB + 1;
        displayStatsOneB(stats1TeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    private void displayResultB(int score) {
        TextView teamBscoreTextView = (TextView) findViewById(
                R.id.TeamBscore);
        teamBscoreTextView.setText(String.valueOf(score));
    }

    /**
     * Displays the two points shots stats - Team B
     */
    private void displayStatsTwoB(int score) {
        TextView teamBscoreStatsView = (TextView) findViewById(
                R.id.teamBstatsTwo);
        teamBscoreStatsView.setText(String.valueOf(score));
    }

    /**
     * Displays the three points shots stats - Team B
     */
    private void displayStatsThreeB(int score) {
        TextView teamBscoreStatsView = (TextView) findViewById(
                R.id.teamBstatsThree);
        teamBscoreStatsView.setText(String.valueOf(score));
    }

    /**
     * Displays the one point shots stats - Team B
     */
    private void displayStatsOneB(int score) {
        TextView teamBscoreStatsView = (TextView) findViewById(
                R.id.teamBstatsOne);
        teamBscoreStatsView.setText(String.valueOf(score));
    }

    /**
     * Resetting all to zeros
     */
    public void resetScores(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayResultA(scoreTeamA);
        displayResultB(scoreTeamB);
        stats2TeamA = 0;
        stats3TeamA = 0;
        stats1TeamA = 0;
        stats2TeamB = 0;
        stats3TeamB = 0;
        stats1TeamB = 0;
        displayStatsTwoA(stats2TeamA);
        displayStatsThreeA(stats3TeamA);
        displayStatsOneA(stats1TeamA);
        displayStatsTwoB(stats2TeamB);
        displayStatsThreeB(stats3TeamB);
        displayStatsOneB(stats1TeamB);
    }
}
