package com.voltasit.obdeleven.ui.dialogs;

import B8.u1;
import X5.ViewOnClickListenerC0832a;
import androidx.media3.exoplayer.C1403v;

/* JADX INFO: compiled from: SingleChoiceAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class N0 extends p110i9.l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1403v f33827e;

    /* JADX INFO: compiled from: SingleChoiceAdapter.java */
    public class a extends i9.l.a {
        public a(u1 u1Var) {
            super(u1Var);
            u1Var.f2166s.setOnClickListener(new ViewOnClickListenerC0832a(2, this));
        }

        @Override // i9.l.a
        public final void a(String str) {
            u1 u1Var = this.f36810b;
            u1Var.f2166s.setVisibility(0);
            u1Var.t(str);
            u1Var.f();
        }
    }

    @Override // p110i9.l
    public final i9.l.a e(u1 u1Var) {
        return new a(u1Var);
    }
}
