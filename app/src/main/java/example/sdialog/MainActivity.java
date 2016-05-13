package example.sdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.jgabrielfreitas.callbacks.OnSingleChoiceListener;
import com.jgabrielfreitas.dialog.SimpleAlertDialog;
import com.jgabrielfreitas.dialog.SingleChoiceDialog;
import com.jgabrielfreitas.dialog.SingleChoiceRadioDialog;

import br.jgabrielfreitas.sdialog.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, OnSingleChoiceListener {


    Button createDialogButton;
    String[] eeny;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createDialogButton = (Button) findViewById(R.id.createDialogButton);
        createDialogButton.setOnClickListener(this);
        eeny = getResources().getStringArray(R.array.eeny);
    }

    public void onClick(View v) {


//        DialogCreator.newSimpleDialog(this).setTitle("Dialog Title")
//                                           .setMessage("Dialog message here.\nYou can write whatever you want here")
//                                           .setPositiveButtonText("YES")
//                                           .setNegativeButtonText("NO")
//                                           .setNeutralButtonText("NEUTRAL")
//                                           .setDialogCallback(new DialogCallback() {
//
//                                               public void onPositiveButton() {
//                                                   Toast.makeText(getApplicationContext(), "POSITIVE", Toast.LENGTH_LONG).show();
//                                               }
//
//                                               public void onNegativeButton() {
//                                                   Toast.makeText(getApplicationContext(), "NEGATIVE", Toast.LENGTH_LONG).show();
//                                               }
//
//                                               public void onNeutralButton() {
//                                                   Toast.makeText(getApplicationContext(), "NEUTRAL", Toast.LENGTH_LONG).show();
//                                               }
//                                           })
//                                           .create();

//        new BasicDialog(this).setTitle("Hello World").setContent(getString(R.string.lopem_ipsum)).show();
//        new SimpleAlertDialog(this).setPositiveButton("CLOSE").setTitle("Hello World").setContent(getString(R.string.lopem_ipsum)).show();
        new SingleChoiceRadioDialog(this).setItems(eeny).setChoiceButton("CHOOSE", this).setTitle("Hello World").setContent(getString(R.string.lopem_ipsum)).show();

    }

    public void onSingleChoiceSelected(int which) {
        Toast.makeText(MainActivity.this, "Selected: " + eeny[which], Toast.LENGTH_SHORT).show();
    }
}
