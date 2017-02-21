package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // global integer variables for keeping track of the
    // score of team A and B
    // fouls of team A and B
    // yellow cards of team A and B
    // red cards of team A and B
    int scoreA = 0, scoreB=0, foulsA=0, foulsB=0, yellowsA=0, yellowsB=0, redsA=0, redsB=0;
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
    Method to be invoked when the "score" button is pressed (the left score button)
    i.e. find textview, update score (+1) and set the text to the updated value
     */
    public void teamAScores(View v){
        scoreA++;
        textViewTeamA.setText("" + scoreA);
    }

    /*
   Method to be invoked when the "score" button is pressed (the right score button)
   i.e. find textview, update score (+1) and set the text to the updated value
    */
    public void teamBScores(View v){
        scoreB++;
        textViewTeamB.setText("" + scoreB);
    }

    /*
   Method to be invoked when the "+" button of fouls is pressed (the left button)
   i.e. find textview, update fouls (+1) and set the text to the updated value
    */
    public void teamACommitsFoul(View v){
        foulsA++;
        textViewFoulsA.setText("" + foulsA);
    }

    /*
   Method to be invoked when the "+" button of fouls is pressed (the right button)
   i.e. find textview, update fouls (+1) and set the text to the updated value
    */
    public void teamBCommitsFoul(View v){
        foulsB++;
        textViewFoulsB.setText("" + foulsB);
    }

    /*
  Method to be invoked when the "+" button of yellow cards is pressed (the left button)
  i.e. find textview, update yellow cards (+1) and set the text to the updated value
   */
    public void teamAYellowCard(View v){
        yellowsA++;
        textViewYellowA.setText("" + yellowsA);
    }

    /*
  Method to be invoked when the "+" button of yellow cards is pressed (the right button)
  i.e. find textview, update yellow cards (+1) and set the text to the updated value
   */
    public void teamBYellowCard(View v){
        yellowsB++;
        textViewYellowB.setText("" + yellowsB);
    }

    /*
  Method to be invoked when the "+" button of red cards is pressed (the left button)
  i.e. find textview, update red cards (+1) and set the text to the updated value
   */
    public void teamARedCard(View v){
        redsA++;
        textViewRedA.setText("" + redsA);
    }

    /*
  Method to be invoked when the "+" button of red cards is pressed (the right button)
  i.e. find textview, update red cards (+1) and set the text to the updated value
   */
    public void teamBRedCard(View v){
        redsB++;
        textViewRedB.setText("" + redsB);
    }

    /*
    Method to be invoked when the reset button is pressed, i.e. all the values are set to 0
    and the text on the TextViews is set to this value 0
     */
    public void reset(View v){
        scoreA=0; scoreB=0; foulsA=0;foulsB=0;yellowsA=0;yellowsB=0;redsA=0;redsB=0;
        textViewTeamA.setText(""+scoreA);
        textViewTeamB.setText(""+scoreB);
        textViewFoulsA.setText(""+foulsA);
        textViewFoulsB.setText(""+foulsB);
        textViewYellowA.setText(""+yellowsA);
        textViewYellowB.setText(""+yellowsB);
        textViewRedA.setText(""+redsA);
        textViewRedB.setText(""+redsB);
    }


}
