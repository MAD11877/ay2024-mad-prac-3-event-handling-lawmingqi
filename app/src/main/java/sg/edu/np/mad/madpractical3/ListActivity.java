package sg.edu.np.mad.madpractical3;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

import sg.edu.np.mad.practical3.R;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list);

        ImageView alertPrompt = findViewById(R.id.imageAlert);

        alertPrompt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random num = new Random();
                Integer numint = num.nextInt(99999999);

                AlertDialog.Builder builder = new AlertDialog.Builder(ListActivity.this);

                builder.setTitle("Profile");
                builder.setMessage("MADness");
                builder.setPositiveButton("View", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        Intent i2 = new Intent(ListActivity.this, MainActivity.class);
                        i2.putExtra("rNumber", numint);
                        startActivity(i2);
                    }
                });
                builder.setNegativeButton("Close", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                    }
                });

                builder.show();
            }
        });
    }
}