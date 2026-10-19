package com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.lifecycle.D;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.models.StartView;
import com.voltasit.obdeleven.presentation.settings.SettingsFragment;
import com.voltasit.obdeleven.ui.dialogs.T;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import java.util.List;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f31798c;

    public /* synthetic */ b(BaseFragment baseFragment, int i10) {
        this.f31797b = i10;
        this.f31798c = baseFragment;
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, xa.g] */
    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        int i10 = 0;
        BaseFragment baseFragment = this.f31798c;
        switch (this.f31797b) {
            case 0:
                final q qVar = (q) baseFragment;
                qVar.getClass();
                qVar.K(new m(i10, qVar), new Ia.l() { // from class: com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.n
                    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, xa.g] */
                    @Override // Ia.l
                    public final Object invoke(Object obj2) {
                        q qVar2 = qVar;
                        qVar2.getClass();
                        ((DialogInterface) obj2).dismiss();
                        r rVar = (r) qVar2.f31842M.getValue();
                        int i11 = rVar.f31869x;
                        rVar.f31869x = i11;
                        C2680e.c(Z.a(rVar), null, null, new LongCodingKwpViewModel$onBitLongClicked$1(rVar, i11, null), 3);
                        return p293xa.r.f47939a;
                    }
                });
                break;
            case 1:
                com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.i iVar = (com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.i) ((com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h) baseFragment).f31919E.getValue();
                iVar.f32119h.j(Integer.valueOf(R.string.common_press_and_hold));
                break;
            default:
                SettingsFragment this$0 = (SettingsFragment) baseFragment;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                String[] strArr = {this$0.getString(R.string.view_settings_auto), this$0.getString(R.string.common_garage), this$0.getString(R.string.common_car)};
                List<String> list = com.voltasit.obdeleven.a.f29638c;
                Context contextRequireContext = this$0.requireContext();
                kotlin.jvm.internal.i.d(contextRequireContext, "requireContext(...)");
                StartView startViewH = com.voltasit.obdeleven.a.C0320a.a(contextRequireContext).h();
                T t8 = this$0.f33085r;
                if (t8 == null || !t8.isVisible()) {
                    Bundle bundleA = Z3.o.a("key_tag", R.string.view_settings_start_view, "startViewDialog", "key_title");
                    bundleA.putStringArray("item_array", strArr);
                    bundleA.putInt("key_checked_position", startViewH.ordinal());
                    bundleA.putInt("key_positive_text", R.string.common_ok);
                    bundleA.putInt("key_negative_text", R.string.common_cancel);
                    T t10 = new T();
                    t10.setArguments(bundleA);
                    t10.f32261r = this$0.getFragmentManager();
                    t10.setTargetFragment(this$0, 0);
                    this$0.f33085r = t10;
                    t10.A();
                }
                break;
        }
    }
}
