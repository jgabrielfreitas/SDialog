package com.jgabrielfreitas.dialog;

import android.content.Context;
import android.content.DialogInterface;

import com.jgabrielfreitas.callbacks.OnSingleChoiceListener;

/**
 * Created by JGabrielFreitas on 13/05/16.
 */
public class SingleChoiceRadioDialog extends SingleChoiceDialog {

    public SingleChoiceRadioDialog(Context context) {
        super(context);
    }

    public SingleChoiceRadioDialog setItems(CharSequence[] items) {

        getBuilder().setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                selected = which;
            }
        });

        return this;
    }
}
