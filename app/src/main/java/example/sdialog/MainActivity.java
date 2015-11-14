package example.sdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.jgabrielfreitas.sdialog.R;
import jgabrielfreitas.sdialog.DialogCreator;
import jgabrielfreitas.sdialog.interfaces.DialogCallback;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button createDialogButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createDialogButton = (Button) findViewById(R.id.createDialogButton);
        createDialogButton.setOnClickListener(this);
    }

    public void onClick(View v) {


        DialogCreator.newSimpleDialog(this).setTitle("Dialog Title")
                                           .setMessage("Dialog message here.\nYou can write whatever you want here")
                                           .setPositiveButtonText("YES")
                                           .setNegativeButtonText("NO")
                                           .setNeutralButtonText("NEUTRAL")
                                           .setDialogCallback(new DialogCallback() {

                                               public void onPositiveButton() {
                                                   Toast.makeText(getApplicationContext(), "POSITIVE", Toast.LENGTH_LONG).show();
                                               }

                                               public void onNegativeButton() {
                                                   Toast.makeText(getApplicationContext(), "NEGATIVE", Toast.LENGTH_LONG).show();
                                               }

                                               public void onNeutralButton() {
                                                   Toast.makeText(getApplicationContext(), "NEUTRAL", Toast.LENGTH_LONG).show();
                                               }
                                           })
                                           .create();
    }
}
