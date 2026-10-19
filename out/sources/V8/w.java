package V8;

import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.settings.SettingsFragment;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w implements androidx.lifecycle.D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f6836c;

    public /* synthetic */ w(BaseFragment baseFragment, int i10) {
        this.f6835b = i10;
        this.f6836c = baseFragment;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, xa.g] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, xa.g] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, xa.g] */
    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        switch (this.f6835b) {
            case 0:
                E e10 = (E) ((D) this.f6836c).f6749E.getValue();
                e10.f32119h.j(Integer.valueOf(R.string.common_press_and_hold));
                break;
            case 1:
                com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.r rVar = (com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.r) ((com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q) this.f6836c).f31842M.getValue();
                rVar.f32119h.j(Integer.valueOf(R.string.common_press_and_hold));
                break;
            case 2:
                ((com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.i) ((com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h) this.f6836c).f31919E.getValue()).f31940E.j(p293xa.r.f47939a);
                break;
            default:
                Integer num = (Integer) obj;
                SettingsFragment this$0 = (SettingsFragment) this.f6836c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                MainActivity mainActivityQ = this$0.q();
                kotlin.jvm.internal.i.b(num);
                P.a(mainActivityQ, mainActivityQ.getString(num.intValue()));
                break;
        }
    }
}
