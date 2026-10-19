package com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata;

import androidx.lifecycle.D;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.presentation.garage.GarageFragment;
import com.voltasit.obdeleven.ui.dialogs.B;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import kotlin.jvm.internal.i;
import p194p8.h;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f31764c;

    public /* synthetic */ c(BaseFragment baseFragment, int i10) {
        this.f31763b = i10;
        this.f31764c = baseFragment;
    }

    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        switch (this.f31763b) {
            case 0:
                f fVar = (f) this.f31764c;
                h hVar = fVar.f31784v;
                if (hVar != null && hVar.f45913d != null) {
                    new B(fVar.q(), fVar.f31784v.f45913d, fVar.f31777o.getVisibility() == 0 ? 10 : 4).b().continueWith(new com.parse.a(2, fVar), Task.UI_THREAD_EXECUTOR);
                    break;
                }
                break;
            default:
                GarageFragment this$0 = (GarageFragment) this.f31764c;
                i.e(this$0, "this$0");
                this$0.q().S();
                break;
        }
    }
}
