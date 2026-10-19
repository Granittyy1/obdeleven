package com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding;

import android.os.Bundle;
import androidx.lifecycle.D;
import com.voltasit.obdeleven.presentation.pro.BaseProFragment;
import com.voltasit.obdeleven.ui.dialogs.B0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseProFragment f31812c;

    public /* synthetic */ h(BaseProFragment baseProFragment, int i10) {
        this.f31811b = i10;
        this.f31812c = baseProFragment;
    }

    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        switch (this.f31811b) {
            case 0:
                q qVar = (q) this.f31812c;
                B0 b10 = qVar.f31838I;
                if (b10 == null || !b10.isVisible()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("key_login_finder_enabled", false);
                    B0 b11 = new B0();
                    b11.setArguments(bundle);
                    b11.setTargetFragment(qVar, 0);
                    b11.f32261r = qVar.getFragmentManager();
                    qVar.f31838I = b11;
                    b11.f33753w = qVar.f31857z;
                    b11.A();
                }
                break;
            default:
                ((com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h) this.f31812c).Z();
                break;
        }
    }
}
