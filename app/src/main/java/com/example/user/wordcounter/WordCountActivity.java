package com.example.user.wordcounter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 08/11/2016.
 */

public class WordCountActivity extends AppCompatActivity {

TextView mAnswerText;

    EditText mQuestionEditText;
    Button mSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuestionEditText =(EditText) findViewById(R.id.question_text);
        mSubmitButton=(Button)findViewById(R.id.submit_button);


        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

//                not sure on the below method
                WordCount wordCount = new WordCount("");
                String stringAnswer = wordCount.wordCounter().toString();

                Intent intent = new Intent(WordCountActivity.this, WordCountActivity.class);

                intent.putExtra("answer", stringAnswer);

                startActivity(intent);
            }
        });



//        mAnswerText =(TextView)findViewById(R.id.answer_text);



    }



}




