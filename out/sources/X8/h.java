package X8;

import B8.AbstractC0613a0;
import B8.AbstractC0638l0;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.D;
import androidx.recyclerview.widget.RecyclerView;
import com.parse.ControlUnitDB;
import com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment;
import com.voltasit.obdeleven.presentation.controlunitlist.offline.OfflineControlUnitListFragment;
import com.voltasit.obdeleven.presentation.settings.SettingsFragment;
import com.voltasit.obdeleven.ui.dialogs.B0;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import p255u9.C2801d;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f7390c;

    public /* synthetic */ h(BaseFragment baseFragment, int i10) {
        this.f7389b = i10;
        this.f7390c = baseFragment;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xa.g] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, xa.g] */
    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        switch (this.f7389b) {
            case 0:
                s sVar = (s) this.f7390c;
                ?? r10 = sVar.f7410C;
                int i10 = ((t) r10.getValue()).f7428q;
                Object obj2 = ((t) r10.getValue()).f7429r;
                if (obj2 == null) {
                    kotlin.jvm.internal.i.m("data");
                    throw null;
                }
                B0 b10 = sVar.f7425z;
                if (b10 == null || !b10.isVisible()) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("key_type", i10);
                    if (i10 == 0) {
                        bundle.putBoolean("key_data", ((Boolean) obj2).booleanValue());
                    } else {
                        bundle.putString("key_data", (String) obj2);
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("key_login_finder_enabled", false);
                    bundle2.putBundle("key_bundle", bundle);
                    B0 b11 = new B0();
                    b11.setArguments(bundle2);
                    b11.setTargetFragment(sVar, 0);
                    b11.f32261r = sVar.getFragmentManager();
                    sVar.f7425z = b11;
                    b11.f33753w = sVar.f7416q;
                    b11.A();
                    return;
                }
                return;
            case 1:
                ((com.voltasit.obdeleven.presentation.controlUnit.basicsettings.a) ((com.voltasit.obdeleven.presentation.controlUnit.basicsettings.i) this.f7390c).f31518G.getValue()).f31490p.j(p293xa.r.f47939a);
                return;
            case 2:
                com.voltasit.obdeleven.presentation.controlunitlist.offline.a.C0336a c0336a = (com.voltasit.obdeleven.presentation.controlunitlist.offline.a.C0336a) obj;
                OfflineControlUnitListFragment this$0 = (OfflineControlUnitListFragment) this.f7390c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                AbstractC0613a0 abstractC0613a0U = this$0.U();
                RecyclerView.B bJ = abstractC0613a0U.f1855s.J(c0336a.f32058c);
                if (bJ == null) {
                    return;
                }
                View itemView = bJ.itemView;
                kotlin.jvm.internal.i.d(itemView, "itemView");
                ControlUnitFragment mVar = new p170n9.m();
                ControlUnitDB controlUnitDB = c0336a.f32056a;
                C2801d controlUnitBase = controlUnitDB.getControlUnitBase();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("ControlUnitBaseDB", controlUnitBase);
                bundle3.putParcelable("vehicleData", c0336a.f32057b);
                bundle3.putParcelable("ControlUnitDB", controlUnitDB);
                mVar.setArguments(bundle3);
                this$0.W(itemView, mVar);
                return;
            default:
                String str = (String) obj;
                SettingsFragment this$1 = (SettingsFragment) this.f7390c;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                AbstractC0638l0 abstractC0638l0 = this$1.f33082o;
                if (abstractC0638l0 != null) {
                    abstractC0638l0.f2008H.f1857r.setText(str);
                    return;
                } else {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
        }
    }
}
