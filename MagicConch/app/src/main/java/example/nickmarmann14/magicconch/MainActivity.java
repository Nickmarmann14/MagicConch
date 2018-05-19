package example.nickmarmann14.magicconch;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button conchButton = (Button) findViewById(R.id.conchButton);
        final MediaPlayer theyredone = MediaPlayer.create(this, R.raw.ohlooktheyredone);
        conchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Math.random() > .5) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }

                theyredone.start();

            }
        });
    }
}