package sg.edu.np.mad.week03practical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    final String Title = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User myUser = new User();

        TextView header = findViewById(R.id.textView);
        header.setText("  MAD Practical");

        TextView userName = findViewById(R.id.textView2);
        Random random = new Random();
        int randomNumber = random.nextInt(100000000-1)+1;
        userName.setText("MAD " + randomNumber);

        TextView userDescription = findViewById(R.id.textView3);
        userDescription.setText("The beauty of programming lies in the fact that it constantly challenges you to come up with innovative solutions to complex problems. Programming allows for continuous learning and improvement, where one can constantly discover new technologies and stay up to date with the latest trends.");

        Button myButton = findViewById(R.id.button);
        myButton.setOnClickListener(new View.OnClickListener() { //inner class
            @Override
            public void onClick(View v) { //effecting what it would do after u click on the button
                Log.v(Title, "Button is pressed");
                if (myUser.isFollowed() == true){
                    myButton.setText("UNFOLLOW");
                    Toast.makeText(getApplicationContext(), "Followed", Toast.LENGTH_SHORT).show();
                    myUser.setFollowed(false);
                }
                else {
                    myButton.setText("FOLLOW");
                    Toast.makeText(getApplicationContext(), "Unfollowed", Toast.LENGTH_SHORT).show();
                    myUser.setFollowed(true);
                }
            }
        });

        Button messageButton = findViewById(R.id.button2);
        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Log.v(Title,"Message button is pressed");
                Intent messageIntent = new Intent(MainActivity.this, MessageGroup.class);
                startActivity(messageIntent);
            }
        });

    }


}