package com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding;

import android.os.Bundle;
import androidx.lifecycle.D;
import com.google.android.gms.internal.measurement.Y;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.settings.SettingsFragment;
import com.voltasit.obdeleven.ui.dialogs.T;
import com.voltasit.obdeleven.ui.module.BaseFragment;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f31800c;

    public /* synthetic */ c(BaseFragment baseFragment, int i10) {
        this.f31799b = i10;
        this.f31800c = baseFragment;
    }

    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        switch (this.f31799b) {
            case 0:
                new com.voltasit.obdeleven.presentation.dialogs.j(((q) this.f31800c).requireContext()).show();
                break;
            case 1:
                com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h hVar = (com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h) this.f31800c;
                hVar.getClass();
                hVar.f31928t = Y.k(hVar, ((Integer) obj).intValue(), "tryAgainDialog");
                break;
            default:
                SettingsFragment this$0 = (SettingsFragment) this.f31800c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                String[] strArr = {this$0.getString(R.string.view_settings_portrait), this$0.getString(R.string.view_settings_landscape)};
                boolean zE = this$0.q().E();
                T t8 = this$0.f33084q;
                if (t8 == null || !t8.isVisible()) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("key_title", R.string.view_settings_orientation);
                    bundle.putStringArray("item_array", strArr);
                    bundle.putInt("key_checked_position", zE ? 1 : 0);
                    bundle.putInt("key_positive_text", R.string.common_ok);
                    bundle.putInt("key_negative_text", R.string.common_cancel);
                    bundle.putString("key_tag", "orientationDialog");
                    T t10 = new T();
                    t10.setArguments(bundle);
                    t10.f32261r = this$0.getFragmentManager();
                    t10.setTargetFragment(this$0, 0);
                    this$0.f33084q = t10;
                    t10.A();
                }
                break;
        }
    }
}
