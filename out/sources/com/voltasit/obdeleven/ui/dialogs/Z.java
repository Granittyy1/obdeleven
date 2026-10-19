package com.voltasit.obdeleven.ui.dialogs;

import B8.u1;
import android.widget.CheckedTextView;
import com.obdeleven.service.model.OBDIIService01;

/* JADX INFO: compiled from: LiveDataDialogAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class Z extends p110i9.l {

    /* JADX INFO: compiled from: LiveDataDialogAdapter.java */
    public class a extends i9.l.a {
        public a(u1 u1Var) {
            super(u1Var);
        }

        @Override // i9.l.a
        public final void a(String str) {
            u1 u1Var = this.f36810b;
            u1Var.f2165r.setVisibility(0);
            CheckedTextView checkedTextView = u1Var.f2165r;
            Z z10 = Z.this;
            checkedTextView.setChecked(z10.f36809d.contains(str));
            u1Var.t(z10.f36780b.getString(OBDIIService01.valueOf(str).getDescription()));
            u1Var.f();
        }
    }

    @Override // p110i9.l
    public final i9.l.a e(u1 u1Var) {
        return new a(u1Var);
    }
}
