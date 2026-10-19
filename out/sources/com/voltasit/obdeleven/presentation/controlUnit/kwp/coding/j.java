package com.voltasit.obdeleven.presentation.controlUnit.kwp.coding;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.lifecycle.D;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import kotlinx.coroutines.C2680e;
import p097h9.x;
import p255u9.E;
import p293xa.r;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f31740c;

    public /* synthetic */ j(BaseFragment baseFragment, int i10) {
        this.f31739b = i10;
        this.f31740c = baseFragment;
    }

    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        switch (this.f31739b) {
            case 0:
                final m mVar = (m) this.f31740c;
                mVar.getClass();
                mVar.K(new d(0, mVar), new Ia.l() { // from class: com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.e
                    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, xa.g] */
                    @Override // Ia.l
                    public final Object invoke(Object obj2) {
                        m mVar2 = mVar;
                        mVar2.getClass();
                        ((DialogInterface) obj2).dismiss();
                        a aVar = (a) mVar2.f31757y.getValue();
                        aVar.getClass();
                        C2680e.c(Z.a(aVar), aVar.f32112a, null, new CodingKwpViewModel$onDevelopmentClicked$1(aVar, null), 2);
                        return r.f47939a;
                    }
                });
                break;
            default:
                VehicleBaseFragment this$0 = (VehicleBaseFragment) this.f31740c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                x xVar = new x();
                Bundle bundle = new Bundle();
                bundle.putParcelable("vehicleBase", ((E) obj).i());
                bundle.putBoolean("demo", this$0.Q());
                xVar.setArguments(bundle);
                this$0.r().n(xVar, null);
                break;
        }
    }
}
