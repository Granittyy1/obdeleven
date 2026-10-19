package com.voltasit.obdeleven.presentation.controlUnit.basicsettings;

import androidx.fragment.app.ActivityC1347l;
import androidx.lifecycle.D;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.controlunitlist.offline.OfflineControlUnitListFragment;
import com.voltasit.obdeleven.presentation.settings.SettingsFragment;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f31506c;

    public /* synthetic */ f(BaseFragment baseFragment, int i10) {
        this.f31505b = i10;
        this.f31506c = baseFragment;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, xa.g] */
    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        switch (this.f31505b) {
            case 0:
                a aVar = (a) ((i) this.f31506c).f31518G.getValue();
                aVar.f32119h.j(Integer.valueOf(R.string.common_press_and_hold));
                break;
            case 1:
                OfflineControlUnitListFragment this$0 = (OfflineControlUnitListFragment) this.f31506c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                this$0.r().h();
                break;
            default:
                Integer num = (Integer) obj;
                SettingsFragment this$1 = (SettingsFragment) this.f31506c;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                ActivityC1347l activity = this$1.getActivity();
                if (activity != null) {
                    kotlin.jvm.internal.i.b(num);
                    P.e(activity, activity.getString(num.intValue()));
                }
                break;
        }
    }
}
