package com.voltasit.obdeleven.ui.dialogs;

import android.text.Editable;
import android.text.TextWatcher;
import com.obdeleven.service.model.OBDIIService01;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: OBDIILiveDataListDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class C2169s0 extends C2150i0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Z f34021x;

    @Override // com.voltasit.obdeleven.ui.dialogs.C2150i0
    public final void C() {
        this.f33975u.f2140r.addTextChangedListener(new a());
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.C2150i0
    public final p110i9.l D() {
        if (getContext() == null) {
            y();
        }
        if (this.f34021x == null) {
            this.f34021x = new Z(getContext());
        }
        return this.f34021x;
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.s0$a */
    /* JADX INFO: compiled from: OBDIILiveDataListDialog.java */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            String strValueOf = String.valueOf(charSequence);
            C2169s0 c2169s0 = C2169s0.this;
            c2169s0.f33976v.clear();
            p110i9.l lVarD = c2169s0.D();
            int size = lVarD.f36779a.size();
            lVarD.f36779a.clear();
            lVarD.notifyItemRangeRemoved(0, size);
            c2169s0.D().notifyDataSetChanged();
            for (String str : c2169s0.f33977w) {
                if (c2169s0.getContext().getString(OBDIIService01.valueOf(str).getDescription()).toLowerCase().contains(strValueOf.toLowerCase())) {
                    c2169s0.f33976v.add(str);
                    c2169s0.D().d(c2169s0.f33976v);
                }
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
