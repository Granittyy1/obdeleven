package com.voltasit.obdeleven.ui.dialogs;

import android.content.Context;
import android.graphics.Typeface;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.Theme;
import com.google.android.gms.internal.measurement.C1787c0;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AlertDialog.java */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class C2137c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static MaterialDialog f33909a;

    public static void a() {
        MaterialDialog materialDialog = f33909a;
        if (materialDialog == null || !materialDialog.isShowing()) {
            return;
        }
        f33909a.dismiss();
    }

    public static Task<Boolean> b(Context context, int i10, int i11, int i12) {
        String string = context.getString(i10);
        String string2 = context.getString(i11);
        String string3 = context.getString(i12);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        MaterialDialog.a aVar = new MaterialDialog.a(context);
        aVar.f23212B = Theme.f23261b;
        Typeface typefaceCreate = Typeface.create("sans-serif", 0);
        Typeface typefaceJ = C1787c0.j();
        aVar.f23219I = typefaceCreate;
        aVar.f23218H = typefaceJ;
        if (aVar.f23246p != null) {
            throw new IllegalStateException("You cannot set content() when you're using a custom view.");
        }
        aVar.f23241k = string;
        aVar.f23243m = string2;
        aVar.f23245o = string3;
        aVar.f23253w = new I4.r(taskCompletionSource);
        aVar.f23222L = new DialogInterfaceOnCancelListenerC2135b(0, taskCompletionSource);
        f33909a = aVar.f();
        return taskCompletionSource.getTask();
    }
}
