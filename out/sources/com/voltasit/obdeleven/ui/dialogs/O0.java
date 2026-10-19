package com.voltasit.obdeleven.ui.dialogs;

import B8.s1;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.RunnableC1276a;
import androidx.media3.exoplayer.C1403v;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: SingleChoiceDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class O0 extends C2150i0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public N0 f33831x;

    @Override // com.voltasit.obdeleven.ui.dialogs.C2150i0
    public final p110i9.l D() {
        if (getContext() == null) {
            y();
        }
        if (this.f33831x == null) {
            Context context = getContext();
            C1403v c1403v = new C1403v(this);
            N0 n10 = new N0(context);
            n10.f33827e = c1403v;
            this.f33831x = n10;
        }
        return this.f33831x;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.C2150i0, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        s1 s1Var = (s1) M0.e.a(layoutInflater, R.layout.list_dialog, null, false, null);
        this.f33975u = s1Var;
        s1Var.f2141s.setVisibility(8);
        this.f33975u.f2142t.setVisibility(8);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f33973s = bundle;
        B();
        Bundle bundle2 = this.f33973s;
        if (bundle2 != null && bundle2.containsKey("key_last_position")) {
            this.f33975u.f2143u.post(new RunnableC1276a(2, this));
        }
        C();
        return this.f33975u.f4488d;
    }
}
