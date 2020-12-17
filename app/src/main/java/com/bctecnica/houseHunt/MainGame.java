package com.bctecnica.houseHunt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Objects;

public class MainGame extends AppCompatActivity {

    private ItemsToFind itemsToFind = new ItemsToFind();
    private ColorWheel colorWheel = new ColorWheel();
    private TextView itemToFindView;
    private Button nextItemButton;
    private RelativeLayout mainGameLayout;
    int passedNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);

        // Sets player selection as int to pass to the findNextItem method
        passedNumber = getIntent().getIntExtra("PLAYER_SELECTION", 0);

        // Hides action bar in main game activity
        Objects.requireNonNull(getSupportActionBar()).hide();

        // Link view elements to there corresponding java variables
        itemToFindView = findViewById(R.id.itemToFindText);
        nextItemButton = findViewById(R.id.nextItemButton);
        mainGameLayout = findViewById(R.id.mainGameLayout);

        // When next item button is clicked
        nextItemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Sets next random item to textview and colour
                String fact = itemsToFind.getNextItem(passedNumber);
                int color = colorWheel.getColor();

                //updates the main text field with the random fact
                itemToFindView.setText(fact);
                mainGameLayout.setBackgroundColor(color);
                nextItemButton.setTextColor(color);
            }
        });
    }

}
