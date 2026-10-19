package N5;

import D9.w;
import M5.f;
import X5.r;
import androidx.media3.exoplayer.source.k;
import io.grpc.internal.C2222h;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4651c;

    public /* synthetic */ d(int i10, Object obj) {
        this.f4650b = i10;
        this.f4651c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4650b) {
            case 0:
                ((f) this.f4651c).a(true);
                break;
            case 1:
                r rVar = (r) this.f4651c;
                boolean zIsPopupShowing = rVar.f7265h.isPopupShowing();
                rVar.t(zIsPopupShowing);
                rVar.f7269m = zIsPopupShowing;
                break;
            case 2:
                C2222h c2222h = (C2222h) this.f4651c;
                w.c cVar = c2222h.f37552e;
                if (cVar != null) {
                    w.b bVar = cVar.f2920a;
                    if (!bVar.f2919d && !bVar.f2918c) {
                        cVar.a();
                    }
                }
                c2222h.f37551d = null;
                break;
            default:
                ((k) this.f4651c).f18729J = true;
                break;
        }
    }
}
