package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView story;
    Button topButton;
    Button bottomButton;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState != null) {
            mStoryIndex = savedInstanceState.getInt("StoryIndexKey");
        }
        else {
            mStoryIndex = 1;
        }

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        story = (TextView) findViewById(R.id.storyTextView);
        topButton = (Button) findViewById(R.id.buttonTop);
        bottomButton = (Button) findViewById(R.id.buttonBottom);


        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex==1) {
                    updateStory(3);
                    mStoryIndex = 3;
                }
                else if (mStoryIndex == 2) {
                    updateStory(3);
                    mStoryIndex = 3;
                }
                else if (mStoryIndex == 3){
                    updateStory(6);
                    mStoryIndex = 6;
                }
            }
        });

        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex==1) {
                    updateStory(2);
                    mStoryIndex = 2;
                }
                else if (mStoryIndex == 2) {
                    updateStory(4);
                    mStoryIndex = 4;
                }
                else if (mStoryIndex == 3) {
                    updateStory(5);
                    mStoryIndex = 5;
                }

            }
        });

                // TODO: Steps 6, 7, & 9 - Set a listener on the top button:


                // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

    }
    private void updateStory(int mStoryIndex) {
        if(mStoryIndex == 1) {
            story.setText(R.string.T1_Story);
            topButton.setText(R.string.T1_Ans1);
            bottomButton.setText(R.string.T1_Ans2);
        }
        else if (mStoryIndex == 2) {
            story.setText(R.string.T2_Story);
            topButton.setText(R.string.T2_Ans1);
            bottomButton.setText(R.string.T2_Ans2);
        }
        else if(mStoryIndex == 3) {
            story.setText(R.string.T3_Story);
            topButton.setText(R.string.T3_Ans1);
            bottomButton.setText(R.string.T3_Ans2);
        }
        else if (mStoryIndex == 4) {
            story.setText(R.string.T4_End);
            topButton.setVisibility(View.GONE);
            bottomButton.setVisibility(View.GONE);
        }
        else if (mStoryIndex == 5) {
            story.setText(R.string.T5_End);
            topButton.setVisibility(View.GONE);
            bottomButton.setVisibility(View.GONE);
        }
        else if(mStoryIndex == 6) {
            story.setText(R.string.T6_End);
            topButton.setVisibility(View.GONE);
            bottomButton.setVisibility(View.GONE);
        }
    }
}
