package com.voltasit.obdeleven.presentation.controlUnit.basicsettings;

import Z3.o;
import android.os.Bundle;
import androidx.lifecycle.D;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.SecurityPolicy;
import com.voltasit.obdeleven.presentation.settings.SettingsFragment;
import com.voltasit.obdeleven.ui.dialogs.B;
import com.voltasit.obdeleven.ui.dialogs.B0;
import com.voltasit.obdeleven.ui.dialogs.T;
import com.voltasit.obdeleven.ui.module.BaseFragment;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f31508c;

    public /* synthetic */ g(BaseFragment baseFragment, int i10) {
        this.f31507b = i10;
        this.f31508c = baseFragment;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, xa.g] */
    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        switch (this.f31507b) {
            case 0:
                i iVar = (i) this.f31508c;
                m8.g gVar = iVar.f31532z;
                if (gVar == null || gVar.f44618c == null) {
                    return;
                }
                new B(iVar.q(), iVar.f31532z.f44618c, iVar.f31523q.getVisibility() == 0 ? 10 : 4).b();
                return;
            case 1:
                com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h hVar = (com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h) this.f31508c;
                SecurityPolicy securityPolicy = ((com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.i) hVar.f31919E.getValue()).f31942G;
                if (securityPolicy == null) {
                    kotlin.jvm.internal.i.m("securityPolicy");
                    throw null;
                }
                B0 b10 = hVar.f31927s;
                if (b10 == null || !b10.isVisible()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("key_security_policy", securityPolicy.name());
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("key_login_finder_enabled", false);
                    bundle2.putBundle("key_bundle", bundle);
                    B0 b11 = new B0();
                    b11.setArguments(bundle2);
                    b11.setTargetFragment(hVar, 0);
                    b11.f32261r = hVar.getFragmentManager();
                    hVar.f31927s = b11;
                    b11.f33753w = hVar.f31925q;
                    b11.A();
                    return;
                }
                return;
            default:
                SettingsFragment this$0 = (SettingsFragment) this.f31508c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                String[] strArr = {this$0.getString(R.string.view_settings_app_background), this$0.getString(R.string.view_settings_menu_background)};
                T t8 = this$0.f33086s;
                if (t8 == null || !t8.isVisible()) {
                    Bundle bundleA = o.a("key_tag", R.string.common_background, "changeBackgroundDialog", "key_title");
                    bundleA.putStringArray("item_array", strArr);
                    bundleA.putInt("key_positive_text", R.string.common_ok);
                    bundleA.putInt("key_negative_text", R.string.common_cancel);
                    bundleA.putInt("key_neutral_text", R.string.view_settings_restore);
                    T t10 = new T();
                    t10.setArguments(bundleA);
                    t10.f32261r = this$0.getFragmentManager();
                    t10.setTargetFragment(this$0, 0);
                    this$0.f33086s = t10;
                    t10.A();
                    return;
                }
                return;
        }
    }
}
