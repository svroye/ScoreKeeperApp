package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // global integer variables for keeping track of the
    // score of team A and B
    // fouls of team A and B
    // yellow cards of team A and B
    // red cards of team A and B
    int scoreA = 0;
    int scoreB=0;
    int foulsA=0;
    int foulsB=0;
    int yellowsA=0;
    int yellowsB=0;
    int redsA=0;
    int redsB=0;
    TextView textViewTeamA;
    TextView textViewTeamB;
    TextView textViewFoulsA;
    TextView textViewFoulsB;
    TextView textViewYellowA;
    TextView textViewYellowB;
    TextView textViewRedA;
    TextView textViewRedB;

    //this method, together with the next one, are based on info found on
    //stackoverflow. The code however is not copied
    // to save the instance after the orientation is changed
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        // Save UI state changes to the savedInstanceState.
        // This bundle will be passed to onCreate if the process is
        // killed and restarted.
        savedInstanceState.putInt("ScoreASaved", scoreA);
        savedInstanceState.putInt("ScoreBSaved", scoreB);
        savedInstanceState.putInt("FoulsASaved", foulsA);
        savedInstanceState.putInt("FoulsBSaved", foulsB);
        savedInstanceState.putInt("YellowASaved", yellowsA);
        savedInstanceState.putInt("YellowBSaved", yellowsB);
        savedInstanceState.putInt("RedASaved", redsA);
        savedInstanceState.putInt("RedBSaved", redsB);
    }

        //to restore the state after the orientation was changed
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // Restore UI state from the savedInstanceState.
        // This bundle has also been passed to onCreate.
        scoreA = savedInstanceState.getInt("ScoreASaved");
        scoreB = savedInstanceState.getInt("ScoreBSaved");
        foulsA = savedInstanceState.getInt("FoulsASaved");
        foulsB = savedInstanceState.getInt("FoulsBSaved");
        yellowsA = savedInstanceState.getInt("YellowASaved");
        yellowsB = savedInstanceState.getInt("YellowBSaved");
        redsA = savedInstanceState.getInt("RedASaved");
        redsB = savedInstanceState.getInt("RedBSaved");

        //  set the text of the TextViews to the saved values
        textViewTeamA.setText(""+scoreA);
        textViewTeamB.setText(""+scoreB);
        textViewFoulsA.setText(""+foulsA);
        textViewFoulsB.setText(""+foulsB);
        textViewYellowA.setText(""+yellowsA);
        textViewYellowB.setText(""+yellowsB);
        textViewRedA.setText(""+redsA);
        textViewRedB.setText(""+redsB);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewTeamA = (TextView) findViewById(R.id.team_a_score);
        textViewTeamB = (TextView) findViewById(R.id.team_b_score);
        textViewFoulsA = (TextView) findViewById(R.id.foul_a_text_view);
        textViewFoulsB = (TextView) findViewById(R.id.foul_b_text_view);
        textViewYellowA = (TextView) findViewById(R.id.yellow_a_text_view);
        textViewYellowB = (TextView) findViewById(R.id.yellow_b_text_view);
        textViewRedA = (TextView) findViewById(R.id.red_a_text_view);
        textViewRedB = (TextView) findViewById(R.id.red_b_text_view);
    }
    /*
    Method to be invoked when one of the buttons is pressed. The id of the pressed button is used in a switch statement
    and compared with the ids of all the buttons. Depending on which button is pressed, either :
    the score is increased
    the fouls are increased
    the number of yellow cards is increased
    the number of red cards is increased
    everything is reset to 0
     */
    public void buttonClick(View v){
        switch(v.getId()){
            case R.id.team_a_scores :
                scoreA++;
                textViewTeamA.setText("" + scoreA);
                break;
            case R.id.team_b_scores :
                scoreB++;
                textViewTeamB.setText("" + scoreB);
                break;
            case R.id.plus_fouls_a :
                foulsA++;
                textViewFoulsA.setText("" + foulsA);
                break;
            case R.id.plus_fouls_b :
                foulsB++;
                textViewFoulsB.setText("" + foulsB);
                break;
            case R.id.plus_yellow_a :
                yellowsA++;
                textViewYellowA.setText("" + yellowsA);
                break;
            case R.id.plus_yellow_b :
                yellowsB++;
                textViewYellowB.setText("" + yellowsB);
                break;
            case R.id.plus_red_a :
                redsA++;
                textViewRedA.setText("" + redsA);
                break;
            case R.id.plus_red_b :
                redsB++;
                textViewRedB.setText("" + redsB);
                break;
            case R.id.reset :
                scoreA=0;
                scoreB=0;
                foulsA=0;
                foulsB=0;
                yellowsA=0;
                yellowsB=0;
                redsA=0;
                redsB=0;
                textViewTeamA.setText(""+scoreA);
                textViewTeamB.setText(""+scoreB);
                textViewFoulsA.setText(""+foulsA);
                textViewFoulsB.setText(""+foulsB);
                textViewYellowA.setText(""+yellowsA);
                textViewYellowB.setText(""+yellowsB);
                textViewRedA.setText(""+redsA);
                textViewRedB.setText(""+redsB);
                break;
        }
    }
}
