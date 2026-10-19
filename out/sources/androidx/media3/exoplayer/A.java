package androidx.media3.exoplayer;

import android.view.ViewGroup;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17948d;

    public /* synthetic */ A(Object obj, int i10, Object obj2) {
        this.f17946b = i10;
        this.f17947c = obj;
        this.f17948d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        switch (this.f17946b) {
            case 0:
                K k10 = (K) this.f17947c;
                P.e eVar = (P.e) this.f17948d;
                int i10 = k10.f17996I - eVar.f18123c;
                k10.f17996I = i10;
                boolean z10 = true;
                if (eVar.f18124d) {
                    k10.f17997J = eVar.f18125e;
                    k10.f17998K = true;
                }
                if (i10 == 0) {
                    p078g1.x xVar = eVar.f18122b.f18411a;
                    if (!k10.f18026g0.f18411a.p() && xVar.p()) {
                        k10.f18028h0 = -1;
                        k10.f18030i0 = 0L;
                    }
                    if (!xVar.p()) {
                        List listAsList = Arrays.asList(((l0) xVar).f18482i);
                        p241t7.b.k(listAsList.size() == k10.f18036p.size());
                        for (int i11 = 0; i11 < listAsList.size(); i11++) {
                            ((K.c) k10.f18036p.get(i11)).f18053b = (p078g1.x) listAsList.get(i11);
                        }
                    }
                    long j10 = -9223372036854775807L;
                    if (k10.f17998K) {
                        if (eVar.f18122b.f18412b.equals(k10.f18026g0.f18412b) && eVar.f18122b.f18414d == k10.f18026g0.f18428s) {
                            z10 = false;
                        }
                        if (z10) {
                            if (xVar.p() || eVar.f18122b.f18412b.b()) {
                                j = eVar.f18122b.f18414d;
                            } else {
                                h0 h0Var = eVar.f18122b;
                                androidx.media3.exoplayer.source.h.b bVar = h0Var.f18412b;
                                long j11 = h0Var.f18414d;
                                Object obj = bVar.f18698a;
                                g1.x.b bVar2 = k10.f18035o;
                                xVar.g(obj, bVar2);
                                j = j11 + bVar2.f35472e;
                            }
                            j10 = j;
                        }
                    } else {
                        z10 = false;
                    }
                    k10.f17998K = false;
                    k10.z0(eVar.f18122b, 1, z10, k10.f17997J, j10, -1, false);
                }
                break;
            case 1:
                ((OverlayPresenter) this.f17947c).lambda$onNewConfig$5((ViewGroup) this.f17948d);
                break;
            default:
                ((p114j1.f) this.f17947c).a(this.f17948d);
                break;
        }
    }
}
