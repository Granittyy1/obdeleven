package com.voltasit.obdeleven.ui.dialogs;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1347l;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.Theme;
import com.google.android.gms.internal.measurement.C1787c0;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.view.FloatingEditText;
import java.util.Locale;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: NumberDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2158m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static MaterialDialog f33992a;

    public static Task a(ActivityC1347l activityC1347l, int i10, final int i11) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        MaterialDialog.a aVar = new MaterialDialog.a(activityC1347l);
        aVar.f23212B = Theme.f23261b;
        Typeface typefaceCreate = Typeface.create("sans-serif", 0);
        Typeface typefaceJ = C1787c0.j();
        aVar.f23219I = typefaceCreate;
        aVar.f23218H = typefaceJ;
        aVar.g(i10);
        aVar.a(R.layout.dialog_with_edittext);
        aVar.e(R.string.common_ok);
        aVar.d();
        aVar.f23217G = false;
        aVar.f23252v = new C2156l0(i11, taskCompletionSource);
        aVar.f23222L = new DialogInterfaceOnCancelListenerC2135b(1, taskCompletionSource);
        aVar.f23223M = new DialogInterface.OnShowListener() { // from class: com.voltasit.obdeleven.ui.dialogs.j0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                final MaterialDialog materialDialog = (MaterialDialog) dialogInterface;
                FloatingEditText floatingEditText = (FloatingEditText) materialDialog.f34552b.findViewById(R.id.editText);
                floatingEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.voltasit.obdeleven.ui.dialogs.k0
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i12, KeyEvent keyEvent) {
                        if (i12 != 6) {
                            return false;
                        }
                        DialogAction dialogAction = DialogAction.f23184b;
                        MaterialDialog materialDialog2 = materialDialog;
                        materialDialog2.onClick(materialDialog2.c(dialogAction));
                        return true;
                    }
                });
                int i12 = i11;
                floatingEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(String.valueOf(i12).length())});
                Locale locale = Locale.US;
                floatingEditText.setHint("0 - " + i12);
                floatingEditText.setInputType(2);
                D9.o.p(floatingEditText);
            }
        };
        f33992a = aVar.f();
        return taskCompletionSource.getTask();
    }
}
