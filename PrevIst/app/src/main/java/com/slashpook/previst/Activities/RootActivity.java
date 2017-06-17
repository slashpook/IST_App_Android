package com.slashpook.previst.Activities;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.slashpook.previst.R;

public class RootActivity extends AppCompatActivity {

    //IBOUTLETS
    private Button mButtonListISTs;
    private Button mButtonQuestionnaire;
    private Button mButtonMapCentres;
    private Button mButtonListFAQ;


    //FONCTIONS DE BASE
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);

        //On cache la barre d'action
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //On set les outlets
        this.mButtonListISTs = (Button) findViewById(R.id.buttonISTs);
        this.mButtonQuestionnaire = (Button) findViewById(R.id.buttonQuestionnaire);
        this.mButtonMapCentres = (Button) findViewById(R.id.buttonCentres);
        this.mButtonListFAQ = (Button) findViewById(R.id.buttonPreventions);

        //on set les actions
        this.mButtonListISTs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dispatchAction(v);
            }
        });
        this.mButtonQuestionnaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dispatchAction(v);
            }
        });
        this.mButtonMapCentres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dispatchAction(v);
            }
        });
        this.mButtonListFAQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dispatchAction(v);
            }
        });
    }


    //IBACTIONS

    //On appelle les fonctions correspondants au composant appelé
    protected void dispatchAction(View view) {

        //mButtonListISTs
        if (view.equals(this.mButtonListISTs) == true) {
            this.buttonListISTsTouchUpInside((Button) view);
        }

        //mButtonQuestionnaire
        if (view.equals(this.mButtonQuestionnaire) == true) {
            this.buttonQuestionnaireTouchUpInside((Button) view);
        }

        //mButtonMapCentres
        if (view.equals(this.mButtonMapCentres) == true) {
            this.buttonMapCentresTouchUpInside((Button) view);
        }

        //mButtonListFAQ
        if (view.equals(this.mButtonListFAQ) == true) {
            this.buttonListFAQTouchUpInside((Button) view);
        }
    }

    //On affiche la liste des ISTs
    protected void buttonListISTsTouchUpInside(Button button) {
        Intent listISTsActivity = new Intent(this, ListISTsActivity.class);
        startActivity(listISTsActivity);
    }

    //On affiche le Questionnaire
    protected void buttonQuestionnaireTouchUpInside(Button button) {
        Intent questionnaireActivity = new Intent(this, QuestionnaireActivity.class);
        startActivity(questionnaireActivity);
    }

    //On affiche les centres de map
    protected void buttonMapCentresTouchUpInside(Button button) {
        Intent mapCentresActivity = new Intent(this, MapCentresActivity.class);
        startActivity(mapCentresActivity);
    }

    //On affiche la FAQ
    protected void buttonListFAQTouchUpInside(Button button) {
        Intent listFAQActivity = new Intent(this, ListFAQActivity.class);
        startActivity(listFAQActivity);
    }

}
