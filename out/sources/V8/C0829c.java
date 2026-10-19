package V8;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.ActivityC1347l;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.garage.GarageFragment;
import com.voltasit.obdeleven.presentation.settings.SettingsFragment;
import com.voltasit.obdeleven.ui.dialogs.C2133a;
import com.voltasit.obdeleven.ui.module.BaseFragment;

/* JADX INFO: renamed from: V8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0829c implements androidx.lifecycle.D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f6775c;

    public /* synthetic */ C0829c(BaseFragment baseFragment, int i10) {
        this.f6774b = i10;
        this.f6775c = baseFragment;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, xa.g] */
    @Override // androidx.lifecycle.D
    public final void d(Object obj) throws Exception {
        switch (this.f6774b) {
            case 0:
                ((i) ((h) this.f6775c).f6796w.getValue()).f6797o.j(p293xa.r.f47939a);
                break;
            case 1:
                GarageFragment this$0 = (GarageFragment) this.f6775c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                Bundle bundle = new Bundle();
                C2133a c2133a = new C2133a();
                c2133a.setArguments(bundle);
                c2133a.f32261r = this$0.getFragmentManager();
                c2133a.setTargetFragment(this$0, 0);
                c2133a.A();
                break;
            default:
                Integer num = (Integer) obj;
                SettingsFragment this$1 = (SettingsFragment) this.f6775c;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                kotlin.jvm.internal.i.b(num);
                int iIntValue = num.intValue();
                ActivityC1347l activity = this$1.getActivity();
                try {
                    this$1.startActivityForResult(new Intent("android.intent.action.GET_CONTENT").setType("image/*"), iIntValue);
                } catch (ActivityNotFoundException unused) {
                    Toast.makeText(activity.getApplicationContext(), R.string.crop__pick_error, 0).show();
                }
                break;
        }
    }
}
