package X8;

import android.content.DialogInterface;
import androidx.lifecycle.D;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.presentation.settings.SettingsFragment;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import kotlinx.coroutines.C2680e;
import p293xa.r;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f7392c;

    public /* synthetic */ i(BaseFragment baseFragment, int i10) {
        this.f7391b = i10;
        this.f7392c = baseFragment;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xa.g] */
    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        switch (this.f7391b) {
            case 0:
                s sVar = (s) this.f7392c;
                ?? r10 = sVar.f7410C;
                if (((t) r10.getValue()).f7428q == 0) {
                    Object obj2 = ((t) r10.getValue()).f7429r;
                    if (obj2 != null) {
                        sVar.W(((Boolean) obj2).booleanValue());
                        return;
                    } else {
                        kotlin.jvm.internal.i.m("data");
                        throw null;
                    }
                }
                Object obj3 = ((t) r10.getValue()).f7429r;
                if (obj3 != null) {
                    sVar.Y((String) obj3);
                    return;
                } else {
                    kotlin.jvm.internal.i.m("data");
                    throw null;
                }
            case 1:
                final com.voltasit.obdeleven.presentation.controlUnit.basicsettings.i iVar = (com.voltasit.obdeleven.presentation.controlUnit.basicsettings.i) this.f7392c;
                iVar.getClass();
                iVar.K(new com.voltasit.obdeleven.presentation.controlUnit.basicsettings.c(0, iVar), new Ia.l() { // from class: com.voltasit.obdeleven.presentation.controlUnit.basicsettings.d
                    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, xa.g] */
                    @Override // Ia.l
                    public final Object invoke(Object obj4) {
                        i iVar2 = iVar;
                        iVar2.getClass();
                        ((DialogInterface) obj4).dismiss();
                        a aVar = (a) iVar2.f31518G.getValue();
                        aVar.getClass();
                        C2680e.c(Z.a(aVar), aVar.f32112a, null, new BasicSettingsKwpViewModel$onDevelopmentClicked$1(aVar, null), 2);
                        return r.f47939a;
                    }
                });
                return;
            case 2:
                com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q qVar = (com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q) this.f7392c;
                qVar.getClass();
                com.voltasit.obdeleven.presentation.dialogs.i iVar2 = new com.voltasit.obdeleven.presentation.dialogs.i();
                iVar2.w(((Integer) obj).intValue());
                iVar2.v(qVar.getChildFragmentManager(), "SfdRateLimitDialog");
                return;
            case 3:
                com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h hVar = (com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h) this.f7392c;
                hVar.getClass();
                com.voltasit.obdeleven.presentation.dialogs.i iVar3 = new com.voltasit.obdeleven.presentation.dialogs.i();
                iVar3.w(((Integer) obj).intValue());
                iVar3.v(hVar.getChildFragmentManager(), "SfdRateLimitDialog");
                return;
            default:
                SettingsFragment this$0 = (SettingsFragment) this.f7392c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                this$0.P();
                return;
        }
    }
}
