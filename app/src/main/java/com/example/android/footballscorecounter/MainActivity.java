package com.example.android.footballscorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamBright=0;
    int scoreTeamEast=0;
    int foulTeamBright=0;
    int foulTeamEast=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamBright(scoreTeamBright);
        displayForTeamEast(scoreTeamEast);
        displayForTeamBrightFoul(foulTeamBright);
        displayForTeamEastFoul(foulTeamEast);
    }

    /**
     * Displays the given score for TeamBright .
     */
    public void displayForTeamBright(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_bright_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of given fouls for TeamBright .
     */
    public void displayForTeamBrightFoul(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_bright_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the Goal (+1) button is clicked for Team Bright School.
     */
    public void submitGoalBright(View view) {
        scoreTeamBright = scoreTeamBright + 1;
        displayForTeamBright(scoreTeamBright);
    }

    /**
     * This method is called when the Foul (+1) button is clicked for Team Bright School.
     */
    public void submitFoulBright(View view) {
        foulTeamBright = foulTeamBright + 1;
        displayForTeamBrightFoul(foulTeamBright);
    }

    /**
     * Displays the given score for Team East High.
     */
    public void displayForTeamEast(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_east_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of given fouls for Team East High .
     */
    public void displayForTeamEastFoul(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_east_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the Goal (+1) button is clicked for Team East High School.
     */
    public void submitGoalEast(View view) {
        scoreTeamEast = scoreTeamEast + 1;
        displayForTeamEast(scoreTeamEast);
    }

    /**
     * This method is called when the Foul (+1) button is clicked for Team East High School.
     */
    public void submitFoulEast(View view) {
        foulTeamEast = foulTeamEast + 1;
        displayForTeamEastFoul(foulTeamEast);
    }

    /**
     * This method is called when the reset button is clicked. Resets the score for both teams back to 0.
     */
    public void reset(View view) {
        scoreTeamBright = 0;
        displayForTeamBright(scoreTeamBright);
        scoreTeamEast = 0;
        displayForTeamEast(scoreTeamEast);
        foulTeamBright=0;
        displayForTeamBrightFoul(foulTeamBright);
        foulTeamEast=0;
        displayForTeamEastFoul(foulTeamEast);
    }

}

