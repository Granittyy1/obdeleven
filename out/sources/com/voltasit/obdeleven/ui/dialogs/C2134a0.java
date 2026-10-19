package com.voltasit.obdeleven.ui.dialogs;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.Theme;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LoaderDialog.java */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class C2134a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static MaterialDialog f33883a;

    public static void a() {
        MaterialDialog materialDialog = f33883a;
        if (materialDialog != null) {
            materialDialog.dismiss();
            f33883a = null;
        }
    }

    @Deprecated
    public static void b(Context context, int i10) {
        String string = context.getString(i10);
        MaterialDialog materialDialog = f33883a;
        if (materialDialog != null) {
            materialDialog.f23195g.setText(string);
            materialDialog.f23195g.setVisibility(TextUtils.isEmpty(string) ? 8 : 0);
            return;
        }
        MaterialDialog.a aVar = new MaterialDialog.a(context);
        aVar.f23212B = Theme.f23261b;
        aVar.f23213C = false;
        aVar.f23214D = false;
        View view = aVar.f23246p;
        if (view != null) {
            throw new IllegalStateException("You cannot set content() when you're using a custom view.");
        }
        aVar.f23241k = string;
        if (view != null) {
            throw new IllegalStateException("You cannot set progress() when you're using a custom view.");
        }
        aVar.f23226P = true;
        aVar.f23227Q = -2;
        f33883a = aVar.f();
    }
}
