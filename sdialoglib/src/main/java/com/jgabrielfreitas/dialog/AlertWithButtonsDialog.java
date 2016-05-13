package com.jgabrielfreitas.dialog;

import android.content.Context;
import android.content.DialogInterface;

import com.jgabrielfreitas.callbacks.OnNegativeListener;
import com.jgabrielfreitas.callbacks.OnNeutralListener;
import com.jgabrielfreitas.callbacks.OnPositiveListener;

/**
 * Created by JGabrielFreitas on 13/05/16.
 */
public abstract class AlertWithButtonsDialog extends BasicDialog {

    public AlertWithButtonsDialog(Context context) {
        super(context);
    }

    /**
     * Set the text in positive button, default event on click is close AlertDialog
     *
     * @param text Text in button
     * @return AlertWithButtonsDialog
     */
    public AlertWithButtonsDialog setPositiveButton(String text) {
        return setPositiveButton(text, null);
    }

    /**
     * Set the text in negative button, default event on click is close AlertDialog
     *
     * @param text Text in button
     * @return AlertWithButtonsDialog
     */
    public AlertWithButtonsDialog setNegativeButton(String text) {
        return setNegativeButton(text, null);
    }

    /**
     * Set the text in neutral button, default event on click is close AlertDialog
     *
     * @param text Text in button
     * @return AlertWithButtonsDialog
     */
    public AlertWithButtonsDialog setNeutralButton(String text) {
        return setNeutralButton(text, null);
    }

    /**
     * Set the text in positive button, overwriting click event
     *
     * @param onPositiveListener Click listener
     * @param text               Text in button
     * @return AlertWithButtonsDialog
     */
    public AlertWithButtonsDialog setPositiveButton(String text, final OnPositiveListener onPositiveListener) {

        getBuilder().setPositiveButton(text, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                if (onPositiveListener != null)
                    onPositiveListener.onPositiveButtonClicked();
            }
        });
        return this;
    }

    /**
     * Set the text in negative button, overwriting click event
     *
     * @param onNegativeListener Click listener
     * @param text               Text in button
     * @return AlertWithButtonsDialog
     */
    public AlertWithButtonsDialog setNegativeButton(String text, final OnNegativeListener onNegativeListener) {

        getBuilder().setNegativeButton(text, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                if (onNegativeListener != null)
                    onNegativeListener.onNegativeButtonClicked();
            }
        });
        return this;
    }

    /**
     * Set the text in neutral button, overwriting click event
     *
     * @param onNeutralListener Click listener
     * @param text              Text in button
     * @return AlertWithButtonsDialog
     */
    public AlertWithButtonsDialog setNeutralButton(String text, final OnNeutralListener onNeutralListener) {

        getBuilder().setNeutralButton(text, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                if (onNeutralListener != null)
                    onNeutralListener.onNeutralButtonClicked();
            }
        });
        return this;
    }

}
