package V8;

import B8.K0;
import D2.F;
import D2.I;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.garage.GarageFragment;
import com.voltasit.obdeleven.presentation.garage.GarageViewModel;
import com.voltasit.obdeleven.presentation.settings.SettingsFragment;
import com.voltasit.obdeleven.ui.module.BaseFragment;

/* JADX INFO: renamed from: V8.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0830d implements androidx.lifecycle.D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f6777c;

    public /* synthetic */ C0830d(BaseFragment baseFragment, int i10) {
        this.f6776b = i10;
        this.f6777c = baseFragment;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, xa.g] */
    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        switch (this.f6776b) {
            case 0:
                ((i) ((h) this.f6777c).f6796w.getValue()).f32119h.j(Integer.valueOf(R.string.common_press_and_hold));
                return;
            case 1:
                GarageViewModel.a aVar = (GarageViewModel.a) obj;
                GarageFragment this$0 = (GarageFragment) this.f6777c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                BaseFragment<?> cVar = new p195p9.c();
                String str = aVar.f32350a;
                Bundle bundle = new Bundle();
                bundle.putString("vehicleId", str);
                cVar.setArguments(bundle);
                int i10 = aVar.f32351b;
                if (i10 >= 0) {
                    F fC = new I(this$0.requireContext()).c();
                    cVar.setSharedElementEnterTransition(fC);
                    fC.a(new com.voltasit.obdeleven.presentation.garage.m(this$0));
                }
                K0 k10 = this$0.f32306s;
                if (k10 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                RecyclerView.B bJ = k10.f1738u.J(i10);
                View view = bJ != null ? bJ.itemView : null;
                if (view == null) {
                    this$0.r().n(cVar, null);
                    return;
                } else {
                    view.setTag("vehicleImageTransition");
                    this$0.r().n(cVar, view);
                    return;
                }
            default:
                SettingsFragment this$1 = (SettingsFragment) this.f6777c;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                this$1.r().o(false);
                return;
        }
    }
}
