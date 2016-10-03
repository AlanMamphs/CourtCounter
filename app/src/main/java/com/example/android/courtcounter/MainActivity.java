package com.example.android.courtcounter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    /**
     * Initialize variables score_a and score_b and set them to 0
     */
    int score_a = 0;
    int score_b = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Update score for A team for 3 scores
     */
    public void plusThreeA(View view){
        score_a += 3;
        displayForTeamA(score_a);
    }
    /**
     * Update score for A team for 2 scores
     */
    public void plusTwoA(View view){
        score_a += 2;
        displayForTeamA(score_a);
    }
    /**
     * Update score for A team for 1 score
     */
    public void plusOneA(View view){
        score_a++;
        displayForTeamA(score_a);
    }
    /**
     * Update score for B team for 3 scores
     */
    public void plusThreeB(View view){
        score_b += 3;
        displayForTeamB(score_b);
    }
    /**
     * Update score for A team for 2 scores
     */
    public void plusTwoB(View view){
        score_b += 2;
        displayForTeamB(score_b);
    }
    /**
     * Update score for A team for 1 score
     */
    public void plusOneB(View view){
        score_b++;
        displayForTeamB(score_b);
    }
    /**
     * Reset the scores
     */
    public void Reset(View view){
        score_a = 0;
        score_b = 0;
        displayForTeamA(score_a);
        displayForTeamB(score_b);
    }
    /**
     * Setting display method to update values on the screen for team A
     */
    public void displayForTeamA(int score_a){
        TextView scoreTextA = (TextView) findViewById(R.id.team_a_score);
        scoreTextA.setText(String.valueOf(score_a));
    }
    /**
     * Setting display method to update values on the screen for team B
     */
    public void displayForTeamB(int score_b){
        TextView scoreTextB = (TextView) findViewById(R.id.team_b_score);
        scoreTextB.setText(String.valueOf(score_b));
    }
}
