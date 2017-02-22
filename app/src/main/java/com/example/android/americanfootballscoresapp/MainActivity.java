package com.example.android.americanfootballscoresapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0 ;
    int teamBScore = 0 ;

    final int TOUCHDOWN_POINTS = 6;
    final int FIELD_GOAL_POINTS = 3;
    final int EXTRA_POINT_POINTS = 1;
    final int SAFETY_POINTS = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Add touchdown score for Team A.
     */
    public void touchdownTeamA(View view) {
        teamAScore = teamAScore + TOUCHDOWN_POINTS;
        displayForTeamA(teamAScore);
    }

    /**
     * Add Field goal score for Team A.
     */
    public void fieldgoalTeamA(View view) {
        teamAScore = teamAScore + FIELD_GOAL_POINTS;
        displayForTeamA(teamAScore);
    }

    /**
     * Add extra-point score for Team A.
     */
    public void extrapointTeamA(View view) {
        teamAScore = teamAScore + EXTRA_POINT_POINTS;
        displayForTeamA(teamAScore);
    }

    /**
     * Add safety score for Team A.
     */
    public void safetyTeamA(View view) {
        teamAScore = teamAScore + SAFETY_POINTS;
        displayForTeamA(teamAScore);
    }

    /**
     * Add touchdown score for Team B.
     */
    public void touchdownTeamB(View view) {
        teamBScore = teamBScore + TOUCHDOWN_POINTS;
        displayForTeamB(teamBScore);
    }

    /**
     * Add Field goal score for Team B.
     */
    public void fieldgoalTeamB(View view) {
        teamBScore = teamBScore + FIELD_GOAL_POINTS;
        displayForTeamB(teamBScore);
    }

    /**
     * Add extra-point score for Team B.
     */
    public void extrapointTeamB(View view) {
        teamBScore = teamBScore + EXTRA_POINT_POINTS;
        displayForTeamB(teamBScore);
    }

    /**
     * Add safety score for Team B.
     */
    public void safetyTeamB(View view) {
        teamBScore = teamBScore + SAFETY_POINTS;
        displayForTeamB(teamBScore);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * reset Score for two teams and display the new score.
     */
    public void reset(View view) {
        teamAScore = 0;
        teamBScore = 0 ;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}
