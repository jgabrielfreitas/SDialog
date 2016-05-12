package jgabrielfreitas.sdialog;

import android.content.Context;

import jgabrielfreitas.sdialog.dialog.SimpleDialog;

/**
 * Created by JGabrielFreitas on 14/11/15.
 */
@Deprecated
public class DialogCreator {

    @Deprecated
    public static SimpleDialog newSimpleDialog(Context context) {
        return new SimpleDialog(context);
    }
}
