package jgabrielfreitas.sdialog.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import jgabrielfreitas.sdialog.interfaces.DialogCallback;

/**
 * Created by JGabrielFreitas on 14/11/15.
 */
public class SimpleDialog {

    private String text;
    private String title;
    private String positiveButtonText;
    private String negativeButtonText;
    private String neutralButtonText;
    private DialogCallback dialogCallback;
    private Context context;

    public SimpleDialog(Context context) {
        this.context = context;
    }

    public void create() {

        // create dialog here
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(getText()).setTitle(getTitle());

        if(getPositiveButtonText() != null) {
            builder.setPositiveButton(getPositiveButtonText(), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    getDialogCallback().onPositiveButton();
                }
            });
        }

        if(getNegativeButtonText()!= null) {
            builder.setNegativeButton(getNegativeButtonText(),  new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    getDialogCallback().onNegativeButton();
                }
            });
        }

        if(getNeutralButtonText() != null) {
            builder.setNeutralButton(getNeutralButtonText(), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    getDialogCallback().onNeutralButton();
                }
            });
        }

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public String getText() {
        return text;
    }

    public SimpleDialog setMessage(String text) {
        this.text = text;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public SimpleDialog setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getPositiveButtonText() {
        return positiveButtonText;
    }

    public SimpleDialog setPositiveButtonText(String positiveButtonText) {
        this.positiveButtonText = positiveButtonText;
        return this;
    }

    public String getNegativeButtonText() {
        return negativeButtonText;
    }

    public SimpleDialog setNegativeButtonText(String negativeButtonText) {
        this.negativeButtonText = negativeButtonText;
        return this;
    }

    public String getNeutralButtonText() {
        return neutralButtonText;
    }

    public SimpleDialog setNeutralButtonText(String neutralButtonText) {
        this.neutralButtonText = neutralButtonText;
        return this;
    }

    public Context getContext() {
        return context;
    }

    public DialogCallback getDialogCallback() {
        return dialogCallback;
    }

    public SimpleDialog setDialogCallback(DialogCallback dialogCallback) {
        this.dialogCallback = dialogCallback;
        return this;
    }
}
