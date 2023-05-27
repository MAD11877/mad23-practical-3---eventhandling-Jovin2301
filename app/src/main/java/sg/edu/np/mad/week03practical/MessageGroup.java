package sg.edu.np.mad.week03practical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MessageGroup extends AppCompatActivity {

    final String Title = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_group);


        Button messageButton = findViewById(R.id.button4);
        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Log.v(Title,"Message button is pressed");
            }
        });

    }
}