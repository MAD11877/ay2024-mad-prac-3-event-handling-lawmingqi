package sg.edu.np.mad.practical3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize a new User obj
        User user = new User("MAD","Description",00,false);

        // Get the TextViews and Button from the layout
        TextView tvName = findViewById(R.id.helloworld);
        TextView tvDescription = findViewById(R.id.description);
        Button btnFollow = findViewById(R.id.follow);

        // Set the TextViews with the User's Name, description and default button message
        tvName.setText(user.name);
        tvDescription.setText(user.description);
        btnFollow.setText(user.followed ? "UNFOLLOW" : "FOLLOW");

        btnFollow.setOnClickListener(v -> {
            user.followed = !user.followed;
            // Update the text of the button
            btnFollow.setText(user.followed ? "UNFOLLOW" : "FOLLOW");

        });

        Button btnMessage = (Button) findViewById(R.id.message);

        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(MainActivity.this, MessageGroup.class);
                startActivity(i1);
            }
        });

        Intent i2 = getIntent();
        Integer number = i2.getIntExtra("rNumber", -1);

        String text = user.name + number;
        tvName.setText(text);

    }
}