package com.voltasit.obdeleven.presentation.garage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.ActivityC1347l;
import androidx.lifecycle.D;
import com.voltas.crop.CropImageActivity;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.settings.SettingsFragment;
import com.voltasit.obdeleven.presentation.settings.SettingsViewModel;
import com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment;
import com.voltasit.obdeleven.ui.module.BaseFragment;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f32370c;

    public /* synthetic */ g(BaseFragment baseFragment, int i10) {
        this.f32369b = i10;
        this.f32370c = baseFragment;
    }

    @Override // androidx.lifecycle.D
    public final void d(Object obj) throws Exception {
        switch (this.f32369b) {
            case 0:
                Boolean bool = (Boolean) obj;
                GarageFragment this$0 = (GarageFragment) this.f32370c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                q qVar = this$0.f32300m;
                if (qVar == null) {
                    kotlin.jvm.internal.i.m("loadMoreListener");
                    throw null;
                }
                kotlin.jvm.internal.i.b(bool);
                qVar.f32390f = bool.booleanValue();
                return;
            case 1:
                SettingsViewModel.a aVar = (SettingsViewModel.a) obj;
                SettingsFragment this$1 = (SettingsFragment) this.f32370c;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                boolean z10 = aVar.f33183a;
                F6.a aVarE = F6.a.e(aVar.f33184b, aVar.f33185c);
                Intent intent = (Intent) aVarE.f3259c;
                intent.putExtra("aspect_x", 1);
                intent.putExtra("aspect_y", 1);
                Intent intent2 = (Intent) aVarE.f3259c;
                int i10 = aVar.f33186d;
                intent2.putExtra("aspect_x", i10);
                int i11 = aVar.f33187e;
                intent2.putExtra("aspect_y", i11);
                Intent intent3 = (Intent) aVarE.f3259c;
                intent3.putExtra("max_x", i10);
                intent3.putExtra("max_y", i11);
                int i12 = aVar.f33188f;
                if (!z10) {
                    ActivityC1347l activity = this$1.getActivity();
                    Intent intent4 = (Intent) aVarE.f3259c;
                    intent4.setClass(activity, CropImageActivity.class);
                    this$1.startActivityForResult(intent4, i12);
                    return;
                }
                ActivityC1347l activity2 = this$1.getActivity();
                Intent intent5 = (Intent) aVarE.f3259c;
                intent5.setClass(activity2, CropImageActivity.class);
                intent5.putExtra("multi_orientation", true);
                this$1.startActivityForResult(intent5, i12);
                return;
            default:
                String str = (String) obj;
                VehicleBaseFragment this$2 = (VehicleBaseFragment) this.f32370c;
                kotlin.jvm.internal.i.e(this$2, "this$0");
                try {
                    this$2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return;
                } catch (ActivityNotFoundException unused) {
                    O.e.D("MainActivityFragment", "Handled ActivityNotFoundException - there is no browser to open web page.");
                    this$2.F(this$2.getString(R.string.common_no_web_app));
                    return;
                }
        }
    }
}
