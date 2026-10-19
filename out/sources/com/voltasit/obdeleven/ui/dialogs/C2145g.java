package com.voltasit.obdeleven.ui.dialogs;

import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BackupDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2145g implements O8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f33950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2147h f33951b;

    public C2145g(C2147h c2147h, String str) {
        this.f33951b = c2147h;
        this.f33950a = str;
    }

    @Override // O8.a
    public final void a(double d10) {
        C2147h c2147h = this.f33951b;
        TextView textView = c2147h.f33984s.f2112C;
        Locale locale = Locale.US;
        textView.setText(((int) Math.round(d10)) + "%");
        c2147h.f33984s.f2113D.setProgress((int) Math.round(d10));
    }

    @Override // O8.a
    public final void b(float f10) {
        this.f33951b.C(f10);
    }
}
