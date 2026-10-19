package V8;

import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.pro.BaseProFragment;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements androidx.lifecycle.D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseProFragment f6834c;

    public /* synthetic */ v(BaseProFragment baseProFragment, int i10) {
        this.f6833b = i10;
        this.f6834c = baseProFragment;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, xa.g] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, xa.g] */
    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        switch (this.f6833b) {
            case 0:
                ((E) ((D) this.f6834c).f6749E.getValue()).f6763o.j(p293xa.r.f47939a);
                break;
            case 1:
                X8.t tVar = (X8.t) ((X8.s) this.f6834c).f7410C.getValue();
                tVar.f32119h.j(Integer.valueOf(R.string.common_press_and_hold));
                break;
            default:
                ((com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h) this.f6834c).Z();
                break;
        }
    }
}
