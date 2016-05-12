package jgabrielfreitas.sdialog.dialog;

import android.content.Context;
import android.support.v7.app.AlertDialog;

/**
 * Created by JGabrielFreitas on 12/05/16.
 */
public abstract class BaseDialog {

    private Context context;
    private AlertDialog.Builder builder;

    public BaseDialog(Context context) {
        this.context = context;
        createBuilder();
    }

    private void createBuilder() {
        builder = new AlertDialog.Builder(getContext());
    }

    public BaseDialog setTitle(String title) {
        this.builder.setTitle(title);
        return this;
    }

    public BaseDialog setContent(String content) {
        this.builder.setMessage(content);
        return this;
    }

    public Context getContext() {
        return context;
    }

    public void show(){
        // create dialog here
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
