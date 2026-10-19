package com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding;

import android.os.Bundle;
import androidx.lifecycle.D;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.controlunitlist.ControlUnitListFragment;
import com.voltasit.obdeleven.presentation.settings.SettingsFragment;
import com.voltasit.obdeleven.presentation.settings.SettingsViewModel;
import com.voltasit.obdeleven.ui.dialogs.T;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f31802c;

    public /* synthetic */ d(BaseFragment baseFragment, int i10) {
        this.f31801b = i10;
        this.f31802c = baseFragment;
    }

    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        switch (this.f31801b) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                q qVar = (q) this.f31802c;
                p121j8.e eVar = qVar.f31856y.f41191e.f42830b;
                if (eVar != null) {
                    p170n9.d dVar = new p170n9.d();
                    int i10 = qVar.f31830A;
                    dVar.f44992q = eVar;
                    dVar.f44993r = i10;
                    dVar.f44994s = iIntValue;
                    qVar.r().n(dVar, null);
                    qVar.f31831B = true;
                    return;
                }
                return;
            case 1:
                ((com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h) this.f31802c).V();
                return;
            case 2:
                List list = (List) obj;
                ControlUnitListFragment this$0 = (ControlUnitListFragment) this.f31802c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                com.voltasit.obdeleven.presentation.controlunitlist.a aVar = this$0.f32018o;
                if (aVar != null) {
                    aVar.f19484a.b(list, null);
                    return;
                } else {
                    kotlin.jvm.internal.i.m("adapter");
                    throw null;
                }
            default:
                SettingsViewModel.b bVar = (SettingsViewModel.b) obj;
                SettingsFragment this$1 = (SettingsFragment) this.f31802c;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                boolean z10 = bVar.f33189a;
                T t8 = this$1.f33087t;
                if (t8 == null || !t8.isVisible()) {
                    String currentLanguage = bVar.f33190b;
                    kotlin.jvm.internal.i.e(currentLanguage, "currentLanguage");
                    String[] strArr = bVar.f33191c;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("key_app_db", z10);
                    bundle.putString("key_app_language", currentLanguage);
                    Bundle bundleA = Z3.o.a("key_tag", R.string.common_language, "languageDialog", "key_title");
                    bundleA.putStringArray("item_array", strArr);
                    bundleA.putBundle("key_bundle", bundle);
                    bundleA.putInt("key_positive_text", R.string.common_ok);
                    bundleA.putInt("key_negative_text", R.string.common_cancel);
                    bundleA.putInt("key_checked_position", bVar.f33192d);
                    T t10 = new T();
                    t10.setArguments(bundleA);
                    t10.f32261r = this$1.getFragmentManager();
                    t10.setTargetFragment(this$1, 0);
                    this$1.f33087t = t10;
                    t10.A();
                    return;
                }
                return;
        }
    }
}
