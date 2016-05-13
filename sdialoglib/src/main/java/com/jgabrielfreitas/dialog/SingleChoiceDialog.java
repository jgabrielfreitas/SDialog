package com.jgabrielfreitas.dialog;

import android.content.Context;
import android.content.DialogInterface;

import com.jgabrielfreitas.callbacks.OnSingleChoiceListener;

/**
 * Created by JGabrielFreitas on 13/05/16.
 */
public class SingleChoiceDialog extends AlertWithButtonsDialog {

    protected final int DEFAULT_VALUE = 0;
    protected Integer selected        = DEFAULT_VALUE;

    public SingleChoiceDialog(Context context) {
        super(context);
    }

    /**
     * Set options to Alert
     *
     * @param items Alert options
     * @return SingleChoiceDialog
     */
    public SingleChoiceDialog setItems(CharSequence[] items) {

        getBuilder().setItems(items,  new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                selected = which;
            }
        });
        return this;
    }

    /**
     * Set text of button
     *
     * @param text Button text
     * @return SingleChoiceDialog
     */
    public SingleChoiceDialog setChoiceButton(String text, final OnSingleChoiceListener onSingleChoiceListener) {
        getBuilder().setPositiveButton(text, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                if (onSingleChoiceListener != null)
                    onSingleChoiceListener.onSingleChoiceSelected(selected);
            }
        });
        return this;
    }

    /**
     * Create Alert and show
     */
    public void show() {
        setContent(null);
        super.show();
    }
}
