package com.voltasit.obdeleven.presentation.controlUnit.kwp.coding;

import androidx.lifecycle.D;
import com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import p255u9.E;
import p293xa.r;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f31738c;

    public /* synthetic */ i(BaseFragment baseFragment, int i10) {
        this.f31737b = i10;
        this.f31738c = baseFragment;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, xa.g] */
    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        switch (this.f31737b) {
            case 0:
                ((a) ((m) this.f31738c).f31757y.getValue()).f31719p.j(r.f47939a);
                break;
            default:
                VehicleBaseFragment this$0 = (VehicleBaseFragment) this.f31738c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                p085g9.j jVar = new p085g9.j();
                boolean zQ = this$0.Q();
                jVar.f35666o = (E) obj;
                jVar.f35667p = zQ;
                this$0.r().n(jVar, null);
                break;
        }
    }
}
