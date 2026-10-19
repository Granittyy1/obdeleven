package com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata;

import Ia.l;
import android.content.DialogInterface;
import androidx.lifecycle.D;
import androidx.lifecycle.Z;
import coil.compose.i;
import com.google.android.gms.internal.measurement.Y;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q;
import com.voltasit.obdeleven.presentation.garage.GarageFragment;
import com.voltasit.obdeleven.presentation.history.vehicle.VehicleHistoryFragment;
import com.voltasit.obdeleven.presentation.profile.ProfileFragment;
import com.voltasit.obdeleven.presentation.profile.ProfileViewModel;
import com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment;
import com.voltasit.obdeleven.presentation.vehicleInfo.VehicleInfoFragment;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import kotlinx.coroutines.C2680e;
import p255u9.E;
import p293xa.r;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f31760c;

    public /* synthetic */ a(BaseFragment baseFragment, int i10) {
        this.f31759b = i10;
        this.f31760c = baseFragment;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, xa.g] */
    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        BaseFragment baseFragment = this.f31760c;
        switch (this.f31759b) {
            case 0:
                final f fVar = (f) baseFragment;
                fVar.getClass();
                fVar.K(new i(1, fVar), new l() { // from class: com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.e
                    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, xa.g] */
                    @Override // Ia.l
                    public final Object invoke(Object obj2) {
                        f fVar2 = fVar;
                        fVar2.getClass();
                        ((DialogInterface) obj2).dismiss();
                        g gVar = (g) fVar2.f31772D.getValue();
                        gVar.getClass();
                        C2680e.c(Z.a(gVar), gVar.f32112a, null, new LiveDataViewModel$onDevelopmentClicked$1(gVar, null), 2);
                        return r.f47939a;
                    }
                });
                break;
            case 1:
                ((com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.r) ((q) baseFragment).f31842M.getValue()).f31861p.j(r.f47939a);
                break;
            case 2:
                GarageFragment this$0 = (GarageFragment) baseFragment;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                this$0.F((String) obj);
                break;
            case 3:
                VehicleHistoryFragment this$1 = (VehicleHistoryFragment) baseFragment;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                Y.k(this$1, R.string.common_check_network, "TryAgainDialog");
                break;
            case 4:
                ProfileViewModel.c cVar = (ProfileViewModel.c) obj;
                ProfileFragment this$2 = (ProfileFragment) baseFragment;
                kotlin.jvm.internal.i.e(this$2, "this$0");
                if (cVar instanceof ProfileViewModel.c.a) {
                    this$2.F(((ProfileViewModel.c.a) cVar).f32884a);
                } else {
                    this$2.E(R.string.common_check_network_try_again);
                }
                r rVar = r.f47939a;
                Na.i iVar = E8.a.f3126a;
                break;
            default:
                E e10 = (E) obj;
                VehicleBaseFragment this$3 = (VehicleBaseFragment) baseFragment;
                kotlin.jvm.internal.i.e(this$3, "this$0");
                VehicleInfoFragment vehicleInfoFragment = new VehicleInfoFragment();
                vehicleInfoFragment.f33470M = e10;
                vehicleInfoFragment.f33469L = e10 != null ? e10.getObjectId() : null;
                this$3.r().n(vehicleInfoFragment, null);
                break;
        }
    }
}
